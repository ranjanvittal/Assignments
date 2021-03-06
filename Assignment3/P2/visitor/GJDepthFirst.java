//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * Provides default methods which visit each node in the tree in depth-first
 * order.  Your visitors may extend this class.
 */
public class GJDepthFirst<R,A> implements GJVisitor<R,A> {

   void cryError(String message) {
        System.out.print("Type error");
        System.exit(1);
   }

   String temp(int number) {
      return " TEMP " + number + " ";
   }

   String label(int number) {
      return " L" + number + " ";
   }

   void println(String a) {
      System.out.println(a);
   }

    String move = "\n MOVE ";
    String hstore = "\n HSTORE ";
    String hallocate = " HALLOCATE ";
    String ret = "\n RETURN ";
    String hload = "\n HLOAD ";
    String begin = "\n BEGIN \n";
    String end = "\n END \n";
    String print = "\n PRINT ";
    String jump = "\n JUMP ";
    String cjump = "\n CJUMP ";
    String lt = " LT ";
    String plus = " PLUS ";
    String minus = " MINUS ";
    String times = " TIMES ";
    String noop = " NOOP \n";
    String main = "\n MAIN \n";
    String error = "\n ERROR ";
    String call = "\n CALL ";
    Hashtable<String, SymbolTable> global = new Hashtable<String, SymbolTable>();
    Hashtable<String, CompressedTable> compressedGlobal = new Hashtable<String, CompressedTable>();
    class Argument extends Object {
          String name;
          String type;
          Argument(String name, String type){
              this.name = name;
              this.type = type;
          }
          public void pretty(){
              println(name + " : " + type);
          }
     }

    class Returns extends Object{
    	Hashtable<String, SymbolTable> global;
    	Hashtable<String, CompressedTable> compressedGlobal;
    	Returns(Hashtable<String, SymbolTable> global, Hashtable<String, CompressedTable> compressedGlobal) {
    		this.global = global;
    		this.compressedGlobal = compressedGlobal;
    	}
    }

    class Signature extends Object{
        Vector<Argument> arguments;
        SymbolTable symbolTable;
        String returnType;
        public void appendArguments(){
            Enumeration vEnum = arguments.elements();
            while(vEnum.hasMoreElements()){
                Argument argument = (Argument) vEnum.nextElement();
                if(symbolTable.contains(argument.name))
                    cryError("append Error");
                else
                  symbolTable.variableSymbolTable.put(argument.name, argument.type);
            }
        }
        public void pretty(){
            int i = 0;
            println("Method arguments :");
            Enumeration vEnum = arguments.elements();
            while(vEnum.hasMoreElements()){
                Argument argument = (Argument) vEnum.nextElement();
                println(argument.type + " " + argument.name);
            }
            println("Return Type :");
            println(returnType);
            println("");
            //symbolTable.pretty();
        }
    }

    boolean contains(Vector<Argument> arguments, String name){
        Enumeration vEnum = arguments.elements();
        while(vEnum.hasMoreElements()){
            Argument argument = (Argument) vEnum.nextElement();
            if(argument.name.equals(name)){
                return true;
            }
        }
        return false;
    }

    class SymbolTable extends Object {
        Hashtable<String, String> variableSymbolTable;
        Hashtable<String, Signature> methodSymbolTable;
        String parent;
        SymbolTable(){
            parent = "main";
        }
        public String getVariable(String name, String key) {
            if(variableSymbolTable.containsKey(key))
                return  name + "_" + key + "_" + name.length();
            else if(!parent.equals("main"))
                return global.get(parent).getVariable(parent, key);
            return "";
        }

        public String getMethod(String name, String key) {
            if(methodSymbolTable.containsKey(key))
                return name + "_" + key + "_" + name.length();
            else if(!parent.equals("main"))
                return global.get(parent).getMethod(parent, key);
            return "";
        }

        public String getVariableType(String key) {
        	if(variableSymbolTable.containsKey(key))
                return  variableSymbolTable.get(key);
            else if(!parent.equals("main"))
                return global.get(parent).getVariableType(key);
            return "";
        }

        // public boolean currentContains(String key) {
        //     if(methodSymbolTable.containsKey(key))
        //         return true;
        //     else
        //         return false;
        // }
        public R getSignature(String key){
            if(methodSymbolTable.containsKey(key))
                return (R) methodSymbolTable.get(key);
            else if(!parent.equals("main"))
                return global.get(parent).getSignature(key);
            return null;
        }
        public boolean contains(String key){
            return variableSymbolTable.containsKey(key);
        }
        public void pretty(){
            Set entrySet = variableSymbolTable.entrySet();
            Iterator it = entrySet.iterator();
            println("variableSymbolTable :");
            while(it.hasNext()){
                System.out.println(it.next());
            }
            println("methodSymbolTable :");
            Enumeration e = methodSymbolTable.keys();
            while(e.hasMoreElements()){
                String key = (String) e.nextElement();
                println(key);
                println("");
                methodSymbolTable.get(key).pretty();
            }

            println("parent :");
            if(parent != null)
                println(parent);
            else
                println("none");
            println("");
        }
    }

    class CompressedTable {
        Hashtable<String, Integer> fields;
        Hashtable<String, Integer> vtable;
        String className;
        CompressedTable(Hashtable<String, Integer> fields,
            Hashtable<String, Integer> vtable, String className) {
            this.fields = fields;
            this.vtable = vtable;
            this.className = className;
        }

        public String getField(String field) {
            return global.get(className).getVariable(className, field);
        }

        public String getMethod(String method) {
        	return global.get(className).getMethod(className, method);
        }

        public Integer fieldOffset(String field) {
            return fields.get(getField(field));
        }

        public Integer methodOffset(String method) {
            return vtable.get(getMethod(method));
        }

        public void pretty() {
            Enumeration e = fields.keys();
            println(className + " :");
            println("\tvariables :");
            while(e.hasMoreElements()) {
                String field = (String) e.nextElement();
                println("\t\t" + field + " " + fields.get(field).toString() + "\n");
            }
            println("\tmethods :");
            e = vtable.keys();
            while(e.hasMoreElements()) {
                String method = (String) e.nextElement();
                println("\t\t" + method + " " + vtable.get(method).toString() + "\n");
            }
        }

        public String init(int lastUsedTemp, int lastUsedLabel) {
            String newInit = begin;
            newInit += move + temp(lastUsedTemp) + hallocate + vtable.size()*4 + "\n";
            newInit += move + temp(lastUsedTemp + 1) + hallocate + (fields.size()+1)*4 + "\n";
            newInit += methodInit(lastUsedTemp);
            newInit += fieldInit(lastUsedTemp, lastUsedLabel);
            newInit += ret + temp(lastUsedTemp + 1);
            newInit += end;
            return newInit;
        }

        public String methodInit(int lastUsedTemp) {
            String methods = "";
            Enumeration e = vtable.keys();
            while(e.hasMoreElements()) {
                String key = (String) e.nextElement();
                methods += hstore + temp(lastUsedTemp) + vtable.get(key).toString() + " " +  key;
            }
            methods += "\n";
            return methods;
        }



        public String fieldInit(int lastUsedTemp, int lastUsedLabel) {
            String methodInit = temp(lastUsedTemp);
            String classInit = temp(lastUsedTemp + 1);
            String iterator = temp(lastUsedTemp + 2);
            String labelStart = label(lastUsedLabel);
            String labelEnd = label(lastUsedLabel + 1);
            String fieldInits = move + iterator + " 4\n";
            String fieldSize = " " + (fields.size() + 1)*4 + " ";
            fieldInits += labelStart;
            fieldInits += cjump + lt + iterator + fieldSize + labelEnd;
            fieldInits += hstore + plus + classInit  + iterator + " 0 0";
            fieldInits += move + iterator+ plus + iterator + " 4";
            fieldInits += jump + labelStart + "\n";
            fieldInits += labelEnd;
            fieldInits += hstore + classInit + " 0 " + methodInit + "\n";
            return fieldInits;
        }

    }

    CompressedTable compressSymbolTable(String className, SymbolTable s) {
        CompressedTable a;
        if(compressedGlobal.containsKey(className))
            return compressedGlobal.get(className);

        if(!s.parent.equals("main")) {
        	a = compressSymbolTable(s.parent, global.get(s.parent));
            Hashtable<String, Integer> parentFields;
            Hashtable<String, Integer> parentVtable;
            parentFields = a.fields;
            parentVtable = a.vtable;
            Hashtable<String, Integer> fields = new Hashtable<String, Integer>();
            Hashtable<String, Integer> vtable = new Hashtable<String, Integer>();
            Enumeration e = parentFields.keys();
            int i = 4;
            while(e.hasMoreElements()) {
                String key = (String) e.nextElement();
                fields.put(key, parentFields.get(key));
                i += 4;
            }
            e = s.variableSymbolTable.keys();
            while(e.hasMoreElements()) {
                String key = (String) e.nextElement();
                String entryToFields = className + "_" + key + "_" + className.length();
                fields.put(entryToFields, new Integer(i));
                i += 4;
            }
            i = 0;
            e = parentVtable.keys();
            while(e.hasMoreElements()) {
                String key = (String) e.nextElement();
                vtable.put(key, parentVtable.get(key));
                i += 4;
            }
            e = s.methodSymbolTable.keys();
            while(e.hasMoreElements()) {
                String key = (String) e.nextElement();
                String parent = global.get(className).parent;
                String existingMethod = global.get(parent).getMethod(parent, key);
                if(existingMethod.equals("")) {
                    String entryToVtable = className + "_" + key + "_" + className.length();
                    vtable.put(entryToVtable, new Integer(i));
                    i += 4;
                }
                else {
                    Integer index = vtable.get(existingMethod);
                    vtable.remove(existingMethod);
                    String entryToVtable = className + "_" + key + "_" + className.length();
                    vtable.put(entryToVtable, index);
                }
            }
            CompressedTable compressedTable = new CompressedTable(fields, vtable,
                                                  className);
            compressedGlobal.put(className, compressedTable);
            return compressedTable;
        }
        else {
            Hashtable<String, Integer> fields = new Hashtable<String, Integer>();
            Hashtable<String, Integer> vtable = new Hashtable<String, Integer>();
            Enumeration e = s.variableSymbolTable.keys();
            int i = 4;
            while(e.hasMoreElements()) {
                String key = (String) e.nextElement();
                String entryToFields = className + "_" + key + "_" + className.length();
                fields.put(entryToFields, new Integer(i));
                i += 4;
            }
            e = s.methodSymbolTable.keys();
            i = 0;
            while(e.hasMoreElements()) {
                String key = (String) e.nextElement();
                String entryToVtable = className + "_" + key + "_" + className.length();
                vtable.put(entryToVtable, new Integer(i));
                i += 4;
            }

            CompressedTable compressedTable = new CompressedTable(fields, vtable, className);
            compressedGlobal.put(className, compressedTable);
            return compressedTable;
        }

    }


    void compressGlobal() {
        Enumeration e = global.keys();
        while(e.hasMoreElements()) {
            String key = (String) e.nextElement();
            CompressedTable a = compressSymbolTable(key, global.get(key));
            // println(a.init(55, 2));
            // println(a.fieldOffset("num").toString());
            // println(a.methodOffset("ComputeFac").toString());
        }
    }

    SymbolTable currentSymbolTable;
    String currentClass;
    Hashtable<String, String> currentHashIdentifiers;
    Hashtable<String, Signature> currentHashMethods;
    Vector<Argument> currentArguments;


   //
   // Auto class visitors--probably don't need to be overridden.
   //
   public R visit(NodeList n, A argu) {
      R _ret=null;
      int _count=0;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this,argu);
         _count++;
      }
      return _ret;
   }

   public R visit(NodeListOptional n, A argu) {
      if ( n.present() ) {
         R _ret=null;
         int _count=0;
         for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
            e.nextElement().accept(this,argu);
            _count++;
         }
         return _ret;
      }
      else
         return null;
   }

   public R visit(NodeOptional n, A argu) {
      if ( n.present() )
         return n.node.accept(this,argu);
      else
         return null;
   }

   public R visit(NodeSequence n, A argu) {
      R _ret=null;
      int _count=0;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this,argu);
         _count++;
      }
      return _ret;
   }

   public R visit(NodeToken n, A argu) { return null; }

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> MainClass()
    * f1 -> ( TypeDeclaration() )*
    * f2 -> <EOF>
    */
   public R visit(Goal n, A argu) {
      R _ret=null;
      // String k = "int[]";
      // global.put(k, new SymbolTable());
      // k = "int";
      // global.put(k, new SymbolTable());
      // k = "boolean";
      // global.put(k, new SymbolTable());
      n.f0.accept(this, null);
      n.f1.accept(this, null);
      n.f2.accept(this, null);
      compressGlobal();
      return (R) new Returns(global, compressedGlobal);
   }

   /**
    * f0 -> "class"
    * f1 -> Identifier()
    * f2 -> "{"
    * f3 -> "public"
    * f4 -> "static"
    * f5 -> "void"
    * f6 -> "main"
    * f7 -> "("
    * f8 -> "String"
    * f9 -> "["
    * f10 -> "]"
    * f11 -> Identifier()
    * f12 -> ")"
    * f13 -> "{"
    * f14 -> PrintStatement()
    * f15 -> "}"
    * f16 -> "}"
    */
   public R visit(MainClass n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      n.f1.accept(this, null);
      n.f2.accept(this, null);
      n.f3.accept(this, null);
      n.f4.accept(this, null);
      n.f5.accept(this, null);
      n.f6.accept(this, null);
      n.f7.accept(this, null);
      n.f8.accept(this, null);
      n.f9.accept(this, null);
      n.f10.accept(this, null);
      n.f11.accept(this, null);
      n.f12.accept(this, null);
      n.f13.accept(this, null);
      n.f14.accept(this, null);
      n.f15.accept(this, null);
      n.f16.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> ClassDeclaration()
    *       | ClassExtendsDeclaration()
    */
   public R visit(TypeDeclaration n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> "class"
    * f1 -> Identifier()
    * f2 -> "{"
    * f3 -> ( VarDeclaration() )*
    * f4 -> ( MethodDeclaration() )*
    * f5 -> "}"
    */
   public R visit(ClassDeclaration n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      n.f1.accept(this, null);
      currentClass = n.f1.f0.toString();
      currentSymbolTable = new SymbolTable();
      currentHashIdentifiers = new Hashtable<String, String>();
      currentHashMethods = new Hashtable<String, Signature>();
      currentSymbolTable.variableSymbolTable = currentHashIdentifiers;
      currentSymbolTable.methodSymbolTable = currentHashMethods;
      currentSymbolTable.parent = (String) "main";
      n.f2.accept(this, null);
      n.f3.accept(this, null);
      n.f4.accept(this, null);
      global.put(currentClass, currentSymbolTable);
      n.f5.accept(this, null);
      //println(currentClass);
      //currentSymbolTable.pretty();
      return _ret;
   }

   /**
    * f0 -> "class"
    * f1 -> Identifier()
    * f2 -> "extends"
    * f3 -> Identifier()
    * f4 -> "{"
    * f5 -> ( VarDeclaration() )*
    * f6 -> ( MethodDeclaration() )*
    * f7 -> "}"
    */
   public R visit(ClassExtendsDeclaration n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      currentClass = (String) n.f1.accept(this, null);
      if(global.containsKey(currentClass)) {
          cryError("Redeclaration of class");
      }
      n.f2.accept(this, null);
      currentSymbolTable = new SymbolTable();
      String parent = (String) n.f3.accept(this, null);
      //if(!global.containsKey(parent))
      //    cryError("No Parent Found");
      currentHashIdentifiers = new Hashtable<String, String>();
      currentHashMethods = new Hashtable<String, Signature>();
      currentSymbolTable.variableSymbolTable = currentHashIdentifiers;
      currentSymbolTable.methodSymbolTable = currentHashMethods;
      currentSymbolTable.parent = parent;
      n.f4.accept(this, null);
      n.f5.accept(this, null);
      n.f6.accept(this, null);
      n.f7.accept(this, null);
      global.put(currentClass, currentSymbolTable);
      //println(currentClass);
      //currentSymbolTable.pretty();
      return _ret;
   }

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    * f2 -> ";"
    */
   public R visit(VarDeclaration n, A argu) {
      R _ret=null;
      String type = (String) n.f0.accept(this, null);
      String name = (String) n.f1.accept(this, null);
      n.f2.accept(this, null);
      if(!currentHashIdentifiers.containsKey(name))
          currentHashIdentifiers.put(name, type);
      else
          cryError("Redeclaration of Variable");
      return _ret;
   }

   /**
    * f0 -> "public"
    * f1 -> Type()
    * f2 -> Identifier()
    * f3 -> "("
    * f4 -> ( FormalParameterList() )?
    * f5 -> ")"
    * f6 -> "{"
    * f7 -> ( VarDeclaration() )*
    * f8 -> ( Statement() )*
    * f9 -> "return"
    * f10 -> Expression()
    * f11 -> ";"
    * f12 -> "}"
    */
   public R visit(MethodDeclaration n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      SymbolTable currentMethodTable = new SymbolTable();
      String returnType = (String) n.f1.accept(this, null);
      String methodName = (String) n.f2.accept(this, null);
      if(currentHashMethods.containsKey(methodName))
          cryError("overloading");
      n.f3.accept(this, null);
      currentArguments = new Vector<Argument>();
      n.f4.accept(this, null);
      Signature methodSign = new Signature();
      methodSign.arguments = currentArguments;
      methodSign.returnType = returnType;
      currentHashIdentifiers = new Hashtable<String, String>();
      n.f5.accept(this, null);
      n.f6.accept(this, null);
      n.f7.accept(this, null);
      n.f8.accept(this, null);
      n.f9.accept(this, null);
      n.f10.accept(this, null);
      n.f11.accept(this, null);
      n.f12.accept(this, null);

      currentMethodTable.variableSymbolTable = currentHashIdentifiers;
      currentMethodTable.methodSymbolTable = new Hashtable<String, Signature>();
      currentMethodTable.parent = currentClass;
      methodSign.symbolTable = currentMethodTable;
      methodSign.appendArguments();
      currentHashMethods.put(methodName, methodSign);
      return _ret;
   }

   /**
    * f0 -> FormalParameter()
    * f1 -> ( FormalParameterRest() )*
    */
   public R visit(FormalParameterList n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      n.f1.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    */
   public R visit(FormalParameter n, A argu) {
      R _ret=null;
      String type = (String) n.f0.accept(this, null);
      String name = (String) n.f1.accept(this, null);
      if(!contains(currentArguments, name))
          currentArguments.add(new Argument(name, type));
      else
          cryError("repetition in arguments");
      return _ret;
   }

   /**
    * f0 -> ","
    * f1 -> FormalParameter()
    */
   public R visit(FormalParameterRest n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      n.f1.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> ArrayType()
    *       | BooleanType()
    *       | IntegerType()
    *       | Identifier()
    */
   public R visit(Type n, A argu) {
      R _ret=null;
      String type = (String) n.f0.accept(this, null);
      return (R) type;
   }

   /**
    * f0 -> "int"
    * f1 -> "["
    * f2 -> "]"
    */
   public R visit(ArrayType n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      n.f1.accept(this, null);
      n.f2.accept(this, null);
      String type = "int[]";
      return (R) type;
   }

   /**
    * f0 -> "boolean"
    */
   public R visit(BooleanType n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      String type = "boolean";
      return (R) type;
   }

   /**
    * f0 -> "int"
    */
   public R visit(IntegerType n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      String type = "int";
      return (R) type;
   }

   /**
    * f0 -> Block()
    *       | AssignmentStatement()
    *       | ArrayAssignmentStatement()
    *       | IfStatement()
    *       | WhileStatement()
    *       | PrintStatement()
    */
   public R visit(Statement n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> "{"
    * f1 -> ( Statement() )*
    * f2 -> "}"
    */
   public R visit(Block n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      n.f1.accept(this, null);
      n.f2.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> Identifier()
    * f1 -> "="
    * f2 -> Expression()
    * f3 -> ";"
    */
   public R visit(AssignmentStatement n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      n.f1.accept(this, null);
      n.f2.accept(this, null);
      n.f3.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> Identifier()
    * f1 -> "["
    * f2 -> Expression()
    * f3 -> "]"
    * f4 -> "="
    * f5 -> Expression()
    * f6 -> ";"
    */
   public R visit(ArrayAssignmentStatement n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      n.f1.accept(this, null);
      n.f2.accept(this, null);
      n.f3.accept(this, null);
      n.f4.accept(this, null);
      n.f5.accept(this, null);
      n.f6.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> "if"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Statement()
    * f5 -> "else"
    * f6 -> Statement()
    */
   public R visit(IfStatement n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      n.f1.accept(this, null);
      n.f2.accept(this, null);
      n.f3.accept(this, null);
      n.f4.accept(this, null);
      n.f5.accept(this, null);
      n.f6.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> "while"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Statement()
    */
   public R visit(WhileStatement n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      n.f1.accept(this, null);
      n.f2.accept(this, null);
      n.f3.accept(this, null);
      n.f4.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> "System.out.println"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> ";"
    */
   public R visit(PrintStatement n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      n.f1.accept(this, null);
      n.f2.accept(this, null);
      n.f3.accept(this, null);
      n.f4.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> AndExpression()
    *       | CompareExpression()
    *       | PlusExpression()
    *       | MinusExpression()
    *       | TimesExpression()
    *       | ArrayLookup()
    *       | ArrayLength()
    *       | MessageSend()
    *       | PrimaryExpression()
    */
   public R visit(Expression n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "&"
    * f2 -> PrimaryExpression()
    */
   public R visit(AndExpression n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      n.f1.accept(this, null);
      n.f2.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "<"
    * f2 -> PrimaryExpression()
    */
   public R visit(CompareExpression n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      n.f1.accept(this, null);
      n.f2.accept(this, null);
      return _ret;
    }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "+"
    * f2 -> PrimaryExpression()
    */
   public R visit(PlusExpression n, A argu) {
       R _ret=null;
       n.f0.accept(this, null);
       n.f1.accept(this, null);
       n.f2.accept(this, null);
       return _ret;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "-"
    * f2 -> PrimaryExpression()
    */
   public R visit(MinusExpression n, A argu) {
       R _ret=null;
       n.f0.accept(this, null);
       n.f1.accept(this, null);
       n.f2.accept(this, null);
       return _ret;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "*"
    * f2 -> PrimaryExpression()
    */
   public R visit(TimesExpression n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      n.f1.accept(this, null);
      n.f2.accept(this, null);
      return _ret;
   }
   /**
    * f0 -> PrimaryExpression()
    * f1 -> "["
    * f2 -> PrimaryExpression()
    * f3 -> "]"
    */
   public R visit(ArrayLookup n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      n.f1.accept(this, null);
      n.f2.accept(this, null);
      n.f3.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "."
    * f2 -> "length"
    */
   public R visit(ArrayLength n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      n.f1.accept(this, null);
      n.f2.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "."
    * f2 -> Identifier()
    * f3 -> "("
    * f4 -> ( ExpressionList() )?
    * f5 -> ")"
    */
   public R visit(MessageSend n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      n.f1.accept(this, null);
      n.f2.accept(this, null);
      n.f3.accept(this, null);
      n.f4.accept(this, null);
      n.f5.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> Expression()
    * f1 -> ( ExpressionRest() )*
    */
   public R visit(ExpressionList n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      n.f1.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> ","
    * f1 -> Expression()
    */
   public R visit(ExpressionRest n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      n.f1.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> IntegerLiteral()
    *       | TrueLiteral()
    *       | FalseLiteral()
    *       | Identifier()
    *       | ThisExpression()
    *       | ArrayAllocationExpression()
    *       | AllocationExpression()
    *       | NotExpression()
    *       | BracketExpression()
    */
   public R visit(PrimaryExpression n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public R visit(IntegerLiteral n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> "true"
    */
   public R visit(TrueLiteral n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> "false"
    */
   public R visit(FalseLiteral n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> <IDENTIFIER>
    */
   public R visit(Identifier n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      return (R) n.f0.toString();

   }

   /**
    * f0 -> "this"
    */
   public R visit(ThisExpression n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> "new"
    * f1 -> "int"
    * f2 -> "["
    * f3 -> Expression()
    * f4 -> "]"
    */
   public R visit(ArrayAllocationExpression n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      n.f1.accept(this, null);
      n.f2.accept(this, null);
      n.f4.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> "new"
    * f1 -> Identifier()
    * f2 -> "("
    * f3 -> ")"
    */
   public R visit(AllocationExpression n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      n.f2.accept(this, null);
      n.f3.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> "!"
    * f1 -> Expression()
    */
   public R visit(NotExpression n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      return _ret;
   }

   /**
    * f0 -> "("
    * f1 -> Expression()
    * f2 -> ")"
    */
   public R visit(BracketExpression n, A argu) {
      R _ret=null;
      n.f0.accept(this, null);
      n.f2.accept(this, null);
      return _ret;
   }

}
