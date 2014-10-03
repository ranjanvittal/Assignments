package visitor;
import syntaxtree.*;
import java.util.*;

public class GJDepth<R,A> extends GJDepthFirst<R,A> {

   //
   SymbolTable symboltable;
   Stack<Enumeration> argumentsList = new Stack<Enumeration>();
   String printValue = "";
   Hashtable<String, Integer> currentIdentifiers = new Hashtable<String, Integer>();
   CompressedTable currentCompressedTable;
   boolean inClass = false;
   int lastUsedTemp = 20;
   int lastUsedLabel = 2;
   // boolean isBasic(String type) {
   //    return type.equals("int") || type.equals("boolean") || type.equals("int[]");
   // }

   public GJDepth(Object returns){
      this.compressedGlobal = ((Returns) returns).compressedGlobal;
      this.global = ((Returns) returns).global;
   }

  void addArgumentsAstemp(Vector<Argument> arguments) {
      lastUsedTemp = 1;
      int i= 0 ;
      while(i < arguments.size()) {
        String argumentName = arguments.get(i).name;
        currentIdentifiers.put(argumentName, new Integer(lastUsedTemp));
        i++;
        lastUsedTemp++;
      }
      lastUsedTemp += 10;
      currentIdentifiers.put("this", new Integer(0));
   }


  // void makeArray(int arraytemp, int expressiontemp) {
  //   String expression = temp(expressiontemp);
  //   String array = temp(arraytemp);
	 //  printValue += move + array + hallocate + times + " 4 " + plus + expression + " 1 \n";
	 //  String iterator = temp(lastUsedTemp++);
  //   printValue += move + iterator + " 4 \n";
  //   String labelStart = label(lastUsedLabel++);
  //   String labelEnd = label(lastUsedLabel++);
  //   printValue += labelStart + cjump + lt + iterator + times + plus + expression + " 1 4 " + labelEnd + "\n";
  //   printValue += hstore + plus + array + iterator + " 0 0 \n";
  //   printValue += move + iterator + plus + iterator + " 4 \n";
  //   printValue += jump + labelStart + "\n";
  //   printValue += labelEnd + hstore + array + " 0 " + times + expression + " 4 \n";
  //   printValue += ret + array + "\n";
  //   printValue += end;
  // }

  // void makeLookup(String arraytemp, String expressiontemp) {
  //     printValue += begin;
  //     String val1 = temp(lastUsedTemp++);
  //     String val2 = temp(lastUsedTemp++);
  //     String val3 = temp(lastUsedTemp++);
  //     printValue += hload +  val1 +  plus + arraytemp + plus;
  //     printValue += begin;
  //     printValue += move + val3  + times + expressiontemp + " 4 ";
  //     String labelStart = label(lastUsedLabel++);
  //     printValue += cjump + minus + " 1 " + lt + val3 + arraytemp + labelStart;
  //     printValue += error;
  //     printValue += labelStart + noop;
  //     printValue += ret + val3;
  //     printValue += end;
  //     printValue += " 4  0 ";
  //     printValue += ret + val1;
  //     printValue += end;
  // }
   public R visit(NodeList n, A argu) {
      R _ret=null;
      int _count=0;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this, argu);
         _count++;
      }
      return _ret;
   }

   public R visit(NodeListOptional n, A argu) {
      if ( n.present() ) {
         R _ret=null;
         int _count=0;
         for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
            e.nextElement().accept(this, argu);
            _count++;
         }
         return _ret;
      }
      else
         return null;
   }

   public R visit(NodeOptional n, A argu) {
      if ( n.present() )
         return n.node.accept(this, argu);
      else
         return null;
   }

   public R visit(NodeSequence n, A argu) {
      R _ret=null;
      int _count=0;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this, argu);
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
      String ret;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      println(printValue);
      return _ret;
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
      n.f0.accept(this, argu);
      printValue += main;
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      n.f5.accept(this, argu);
      n.f6.accept(this, argu);
      n.f7.accept(this, argu);
      n.f8.accept(this, argu);
      n.f9.accept(this, argu);
      n.f10.accept(this, argu);
      n.f11.accept(this, argu);
      n.f12.accept(this, argu);
      n.f13.accept(this, argu);
      n.f14.accept(this, argu);
      n.f15.accept(this, argu);
      n.f16.accept(this, argu);
      printValue += end;
      return _ret;
   }

   /**
    * f0 -> ClassDeclaration()
    *       | ClassExtendsDeclaration()
    */
   public R visit(TypeDeclaration n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
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
      n.f0.accept(this, argu);
      currentClass = (String) n.f1.accept(this, argu);
      currentSymbolTable = global.get(currentClass);
      currentCompressedTable = compressedGlobal.get(currentClass);
      inClass = true;
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      n.f5.accept(this, argu);
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
      n.f0.accept(this, argu);
      currentClass = (String) n.f1.accept(this, argu);
      currentSymbolTable = global.get(currentClass);
      currentCompressedTable = compressedGlobal.get(currentClass);
      inClass = true;
      n.f2.accept(this, argu);
      n.f4.accept(this, argu);
      n.f5.accept(this, argu);
      n.f6.accept(this, argu);
      n.f7.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    * f2 -> ";"
    */
   public R visit(VarDeclaration n, A argu) {
      R _ret=null;
      String type = (String) n.f0.accept(this, argu);
      String name = (String) n.f1.accept(this, argu);
      if(!inClass) {
          currentIdentifiers.put(name, new Integer(lastUsedTemp));
          printValue += move + temp(lastUsedTemp++) + "0\n";
      }
      n.f2.accept(this, argu);
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
      n.f0.accept(this, argu);
      // String methodType = (String)
      n.f1.accept(this, argu);
      // if(!compressedGlobal.containsKey(methodType))
      //     cryError("Improper return type" + methodType);
      String methodName = (String) n.f2.accept(this, argu);
      Signature methodSign = (Signature) currentSymbolTable.getSignature(methodName);
      String parent = currentSymbolTable.parent;
      currentSymbolTable = methodSign.symbolTable;
      inClass = false;
      printValue += "\n" + currentCompressedTable.getMethod(methodName) + " ";
      printValue += "[ " + (methodSign.arguments.size()+1) + " ]\n";
      printValue += begin;
      addArgumentsAstemp(methodSign.arguments);
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      n.f5.accept(this, argu);
      n.f6.accept(this, argu);
      n.f7.accept(this, argu);
      n.f8.accept(this, argu);
      n.f9.accept(this, argu);
      printValue += ret;
      n.f10.accept(this, argu);
//      if(!parent.equals("main")) {
//          R existingMethod2 = compressedGlobal.get(parent).getSignature(methodName);
//          if(existingMethod2 != null) {
//              Signature existingMethod = (Signature) existingMethod2;
//              if(!compare(existingMethod, methodSign))
//                  cryError("improper overriding");
//          }
//      }
//      if(!typeEquals(methodType, expType))
//          cryError("Improper return Expression");
      n.f11.accept(this, argu);
      n.f12.accept(this, argu);
      printValue += end;
      currentSymbolTable = global.get(currentClass);
      return _ret;
   }

   /**
    * f0 -> FormalParameter()
    * f1 -> ( FormalParameterRest() )*
    */
   public R visit(FormalParameterList n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    */
   public R visit(FormalParameter n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      // if(!compressedGlobal.containsKey(type))
      //     cryError("Improper argument type");
      n.f1.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> ","
    * f1 -> FormalParameter()
    */
   public R visit(FormalParameterRest n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
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
      n.f0.accept(this, argu);
      // if(!compressedGlobal.containsKey(type))
      //     cryError("No type like " + type);
      return _ret;
   }

   /**
    * f0 -> "int"
    * f1 -> "["
    * f2 -> "]"
    */
   public R visit(ArrayType n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      //String type = "int[]";
      return _ret;
   }

   /**
    * f0 -> "boolean"
    */
   public R visit(BooleanType n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      //String type = "boolean";
      return _ret;
   }

   /**
    * f0 -> "int"
    */
   public R visit(IntegerType n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      //String type = "int";
      return _ret;
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
      n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "{"
    * f1 -> ( Statement() )*
    * f2 -> "}"
    */
   public R visit(Block n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
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
      Integer temp1;
      String name = (String) n.f0.accept(this, argu);
      if(currentIdentifiers.containsKey(name)) {
    	  temp1 = currentIdentifiers.get(name);
        printValue += move + temp(temp1.intValue());
      }
      else {
    	  temp1 = currentCompressedTable.fieldOffset(name);
        printValue += hstore + temp(0) + " " + temp1.intValue() + " ";
      }


//      if(type1 != null)
//          type = (String) type1;
//      else
//          cryError("No variable like " + name);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
//      if(!typeEquals(type, expType))
//          cryError("Id exp does not match");
      n.f3.accept(this, argu);
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
      String name = (String) n.f0.accept(this, argu);
      String type = "main";
      Integer temp1 = currentCompressedTable.fieldOffset(name);
      String array = temp(lastUsedTemp++);

      if(currentIdentifiers.containsKey(name)) {
        temp1 = currentIdentifiers.get(name);
        printValue += move + array + temp(temp1.intValue());
      }

      else {
        temp1 = currentCompressedTable.fieldOffset(name);
        printValue += hload + array + temp(0) + " " + temp1.intValue() + " ";
      }
      String size = temp(lastUsedTemp++);
      String index = temp(lastUsedTemp++);
      String offset = temp(lastUsedTemp++);
      String labelStart = label(lastUsedLabel++);
      printValue += hload + size + array + " 0 ";
      printValue += move + index;
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      printValue += move + offset + plus + times  + index + " 4 " + " 4 ";
      printValue += cjump + minus + 1 + lt + offset + size + labelStart + "\n";
      printValue += error;
      printValue += labelStart + noop;
      printValue += hstore + plus + array + offset + " 0 ";

//      if(type1 != null)
//          type = (String) type1;
//      else
//          cryError("not variable");
//      if(!type.equals("int[]"))
//          cryError("not array");

//      if(!type.equals("int"))
//          cryError("not int");
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      n.f5.accept(this, argu);
//      if(!type.equals("int"))
//          cryError("not int");
      n.f6.accept(this, argu);
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
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      String labelStart = label(lastUsedLabel++);
      String labelEnd = label(lastUsedLabel++);
      printValue += cjump;
      n.f2.accept(this, argu);
      printValue += labelStart;
//      if(!type.equals("boolean"))
//          cryError("not boolean");
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      printValue += jump + labelEnd + "\n";
      printValue += labelStart;
      n.f5.accept(this, argu);
      n.f6.accept(this, argu);
      printValue += labelEnd + noop;
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
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      // String type = (String)
      String labelStart = label(lastUsedLabel++);
      String labelEnd = label(lastUsedLabel++);
      printValue += labelStart + cjump;
      n.f2.accept(this, argu);
      // if(!type.equals("boolean"))
      //     cryError("not boolean");
      printValue += labelEnd;
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      printValue += jump + labelStart + "\n";
      printValue += labelEnd + noop;
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
      printValue += print;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      // if(!type.equals("int"))
      //     cryError("can only print int");
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> AndExpression()
    *       | CompareExpression()
    *       | plusExpression()
    *       | minusExpression()
    *       | timesExpression()
    *       | ArrayLookup()
    *       | ArrayLength()
    *       | MessageSend()
    *       | PrimaryExpression()
    */
   public R visit(Expression n, A argu) {
      R _ret=null;
      _ret = n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "&"
    * f2 -> PrimaryExpression()
    */
   public R visit(AndExpression n, A argu) {
       // String type1 = (String)
       printValue += times;
       n.f0.accept(this, argu);
       n.f1.accept(this, argu);
       // String type2 = (String)
       n.f2.accept(this, argu);
       // if(!(type1.equals("boolean") && type2.equals("boolean")))
       //    cryError("And exp error");
       return (R) "boolean";
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "<"
    * f2 -> PrimaryExpression()
    */
   public R visit(CompareExpression n, A argu) {
       // String type1 = (String)
       printValue += lt;
	     n.f0.accept(this, argu);
       n.f1.accept(this, argu);
       // String type2 = (String)
       n.f2.accept(this, argu);
       // if(!(type1.equals("int") && type2.equals("int")))
       //    cryError("Greater than exp error");
       return (R) "boolean";
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "+"
    * f2 -> PrimaryExpression()
    */
   public R visit(PlusExpression n, A argu) {
       // String type1 = (String)
       printValue += plus;
       n.f0.accept(this, argu);
       n.f1.accept(this, argu);
       // String type2 = (String)
       n.f2.accept(this, argu);
       // if(!(type1.equals("int") && type2.equals("int")))
       //    cryError("plus exp error");
       return (R) "int";
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "-"
    * f2 -> PrimaryExpression()
    */
   public R visit(MinusExpression n, A argu) {
       // String type1 = (String)
       printValue += minus;
       n.f0.accept(this, argu);
       n.f1.accept(this, argu);
       // String type2 = (String)
       n.f2.accept(this, argu);
       // if(!(type1.equals("int") && type2.equals("int")))
       //    cryError("minus Exp error");
       return (R) "int";
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "*"
    * f2 -> PrimaryExpression()
    */
   public R visit(TimesExpression n, A argu) {
       printValue += times;
       n.f0.accept(this, argu);
       n.f1.accept(this, argu);
       n.f2.accept(this, argu);
       // if(!(type1.equals("int") && type2.equals("int")))
       //    cryError("times Exp error");
       return (R) "int";
   }
   /**
    * f0 -> PrimaryExpression()
    * f1 -> "["
    * f2 -> PrimaryExpression()
    * f3 -> "]"
    */
   public R visit(ArrayLookup n, A argu) {
       printValue += begin;
       String array = temp(lastUsedTemp++);
       printValue += move + array ;
       n.f0.accept(this, argu);
       n.f1.accept(this, argu);
       String offset1 = temp(lastUsedTemp++);
       String offset = temp(lastUsedTemp++);
       String maxSize1 = temp(lastUsedTemp++);
       String loaded = temp(lastUsedTemp++);
       String maxSize = temp(lastUsedTemp++);
       printValue += move + offset1;
       n.f2.accept(this, argu);
       printValue += move + offset + plus + times + offset1 + " 4 4 ";
       printValue += print + offset;
       printValue += hload +  loaded +  plus + array + offset + " 0 \n";
       String labelStart = label(lastUsedLabel++);
       printValue += hload + maxSize1 + array + " 0 \n";
       printValue += move + maxSize + plus + times + maxSize1 + " 4 4 \n";
       printValue += cjump + minus + " 1 " + lt + offset +  maxSize + labelStart;
       printValue += error;
       printValue += labelStart + noop;
       printValue += ret + loaded;
       printValue += end;
       // if(!(type1.equals("int[]") && type2.equals("int")))
       //    cryError("Array lookup error");
       return (R) "int";
   }
   /**
    * f0 -> PrimaryExpression()
    * f1 -> "."
    * f2 -> "length"
    */
   public R visit(ArrayLength n, A argu) {
      // String type1 = (String)
      String currentArray = temp(lastUsedTemp++);
      String length = temp(lastUsedTemp++);
      printValue += begin;
      printValue += move + currentArray;
      n.f0.accept(this, argu);
      printValue += hload + length + currentArray + " 0 \n";
      printValue += ret + length + "\n";
      printValue += end;
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      // if(!type1.equals("int[]"))
      //     cryError("ArrayLength error");
      return (R) "int";
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
      printValue += call;
      printValue += begin;
      String identifier = temp(lastUsedTemp++);
      String vtable = temp(lastUsedTemp++);
      String vtableOffset = temp(lastUsedTemp++);
      printValue += move + identifier;
      String type = (String) n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      // if(isBasic(type))
      //     cryError("Message Send Error1");
      SymbolTable symboltable1 = global.get(type);
      CompressedTable compressedTable = compressedGlobal.get(type);
      printValue += hload + vtable + identifier + " 0 ";
      String methodName = (String) n.f2.accept(this, argu);
      int methodOffset = (compressedTable.methodOffset(methodName)).intValue();
      printValue += hload + vtableOffset + vtable + " " + methodOffset + " ";
      _ret = symboltable1.getSignature(methodName);
      printValue += ret + vtableOffset;
      printValue += end;
      printValue += " ( " + identifier;
//      if(_ret == null)
//          cryError("Message Send error2");
      Signature sign = (Signature) _ret;
//      Vector<Argument> v = sign.arguments;
//      Enumeration arguments = v.elements();
//      argumentsList.push(arguments);
      //System.out.println(methodName);
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      n.f5.accept(this, argu);
      printValue += " ) ";
      // if(argumentsList.peek().hasMoreElements()) {
      //     cryError("Message Send error3");
      // }
      // argumentsList.pop();
      return (R) sign.returnType;
   }

   /**
    * f0 -> Expression()
    * f1 -> ( ExpressionRest() )*
    */
   public R visit(ExpressionList n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      //System.out.println(arguments.length);
      //System.out.println("Here : " + type);
//      Enumeration arguments = argumentsList.peek();
//      if(arguments.hasMoreElements()) {
//        Argument argument = (Argument) arguments.nextElement();
//          if(!typeEquals(argument.type, type))
//              cryError("ExpressionList error1");
//      }
//      else
//          cryError("ExpressionList error2");

      n.f1.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> ","
    * f1 -> Expression()
    */
   public R visit(ExpressionRest n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      // String type = (String)
      n.f1.accept(this, argu);
//      Enumeration arguments = argumentsList.peek();
//      if(arguments.hasMoreElements()) {
//        Argument argument = (Argument) arguments.nextElement();
//          if(!typeEquals(argument.type, type))
//              cryError("ExpressionList error3");
//      }
//      else
//          cryError("ExpressionList error4");
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
	 R _ret = null;
      String name = (String) n.f0.accept(this, argu);
      if(n.f0.which == 3) {
    	  //println(name);
    	  if(currentIdentifiers.containsKey(name)) {
    		  printValue += temp(currentIdentifiers.get(name).intValue());
          return (R) currentSymbolTable.getVariableType(name);
    	  }
    	  else {
          String loaded = temp(lastUsedTemp++);
          printValue += begin;
    		  printValue += hload  + loaded + temp(0) + currentCompressedTable.fieldOffset(name) + " \n";
    	    printValue += ret + loaded;
          printValue += end;
          return (R) currentSymbolTable.getVariableType(name);
        }
      }
//      if(pval2 instanceof String) {
//        String pval = (String) pval2;
//        if(isBasic(pval))
//           return (R) pval;
//        if(pval.equals("this"))
//            return (R) currentClass;
//        R _ret = currentCompressedTable.getVariable(pval);
//        if(_ret == null)
//            cryError("Primary Expression error");
//        else
//            return _ret;
//      }
//      Argument pval1 = (Argument) pval2;
      return (R) name;
   }

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public R visit(IntegerLiteral n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      printValue += " " + n.f0.toString() + " ";
      return (R) "int";
   }

   /**
    * f0 -> "true"
    */
   public R visit(TrueLiteral n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      printValue += " 1 ";
      return (R) "boolean";
   }

   /**
    * f0 -> "false"
    */
   public R visit(FalseLiteral n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      printValue += " 0 ";
      return (R) "booelan";
   }

   /**
    * f0 -> <IDENTIFIER>
    */
   public R visit(Identifier n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
       return (R) n.f0.toString();

   }

   /**
    * f0 -> "this"
    */
   public R visit(ThisExpression n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      printValue += temp(0);
      return (R) currentClass;
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
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      String array = temp(lastUsedTemp++);
      String expression = temp(lastUsedTemp++);
      String iterator = temp(lastUsedTemp++);
      String labelStart = label(lastUsedLabel++);
      String labelEnd = label(lastUsedLabel++);
      printValue += begin;
      printValue += move + expression;
      n.f3.accept(this, argu);
      // makeArray(arraytemp, expressiontemp);
      printValue += move + array + hallocate + times + " 4 " + plus + expression + " 1 \n";
      printValue += move + iterator + " 4 \n";
      printValue += labelStart + cjump + lt + iterator + times + plus + expression + " 1 4 " + labelEnd + "\n";
      printValue += hstore + plus + array + iterator + " 0 0 \n";
      printValue += move + iterator + plus + iterator + " 4 \n";
      printValue += jump + labelStart + "\n";
      printValue += labelEnd + hstore + array + " 0 " + expression + "\n";
      printValue += ret + array + "\n";
      printValue += end;
//       if(exp.equals("int")){
//           n.f4.accept(this, argu);
//           return (R) "int[]";
//       }
      n.f4.accept(this, argu);
       //cryError("ArrayAllocationError");
       return (R) "int[]";
   }

   /**
    * f0 -> "new"
    * f1 -> Identifier()
    * f2 -> "("
    * f3 -> ")"
    */
   public R visit(AllocationExpression n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      String value = (String) n.f1.accept(this, argu);
      printValue += compressedGlobal.get(value).init(lastUsedTemp, lastUsedLabel);
      lastUsedTemp += 3;
      lastUsedLabel += 2;
      //cryError("AllocExpr error");
      return (R) value;
   }

   /**
    * f0 -> "!"
    * f1 -> Expression()
    */
   public R visit(NotExpression n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      // String exp = (String)
      printValue += minus + " 1 ";
      n.f1.accept(this, argu);
       // if(exp.equals("boolean")){
       //     return (R) "boolean";
       // }
       // cryError("NotExprError");
       return (R) "boolean";
   }

   /**
    * f0 -> "("
    * f1 -> Expression()
    * f2 -> ")"
    */
   public R visit(BracketExpression n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      _ret = n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      return _ret;
   }

}
