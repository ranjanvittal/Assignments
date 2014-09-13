package visitor;
import syntaxtree.*;
import java.util.*;

public class GJNoArgu<R> extends GJNoArguDepthFirst<R> {

   //
   SymbolTable symbolTable;
   Stack<Enumeration> argumentsList = new Stack<Enumeration>();

   boolean isBasic(String type) {
      return type.equals("int") || type.equals("boolean") || type.equals("int[]");
   }

   boolean typeEquals(String a, String b) {
       if(a.equals(b))
           return true;

       String parent = global.get(b).parent;
       if(!parent.equals("main"))
           return typeEquals(a, parent);
       return false;
   }

   boolean auxCycleCheck(String a,String b) {
        if(a.equals("main")){
            return true;
        }
        if(!global.containsKey(a)) {
            return false;
        }
        if(a.equals(b)) {
            return false;
        }
        return auxCycleCheck(global.get(a).parent, b);
   }

   void cycleCheck() {
       Enumeration globalEnum = global.keys();
        while(globalEnum.hasMoreElements()) {
          String g  = (String) globalEnum.nextElement();
          if(!auxCycleCheck(global.get(g).parent, g))
              cryError("cycleExists");
        }
   }

   boolean compare(Signature a, Signature b) {
        if(typeEquals(a.returnType, b.returnType)) {
            Enumeration vEnum1 = a.arguments.elements();
            Enumeration vEnum2 = b.arguments.elements();
            while(vEnum1.hasMoreElements() && vEnum2.hasMoreElements()){
                Argument argument1 = (Argument) vEnum1.nextElement();
                Argument argument2 = (Argument) vEnum2.nextElement();
                if(!argument1.type.equals(argument2.type))
                    return false;
            }
            if(vEnum1.hasMoreElements() || vEnum2.hasMoreElements())
                return false;
            return true;
        }
        return false;
    }


   public GJNoArgu(Object global){
      this.global = (Hashtable<String, SymbolTable>) global;
   }

   public R visit(NodeList n) {
      R _ret=null;
      int _count=0;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this);
         _count++;
      }
      return _ret;
   }

   public R visit(NodeListOptional n) {
      if ( n.present() ) {
         R _ret=null;
         int _count=0;
         for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
            e.nextElement().accept(this);
            _count++;
         }
         return _ret;
      }
      else
         return null;
   }

   public R visit(NodeOptional n) {
      if ( n.present() )
         return n.node.accept(this);
      else
         return null;
   }

   public R visit(NodeSequence n) {
      R _ret=null;
      int _count=0;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this);
         _count++;
      }
      return _ret;
   }

   public R visit(NodeToken n) { return null; }

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> MainClass()
    * f1 -> ( TypeDeclaration() )*
    * f2 -> <EOF>
    */
   public R visit(Goal n) {
      R _ret=null;
      cycleCheck();
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      System.out.print("Program type checked successfully");
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
   public R visit(MainClass n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
      n.f7.accept(this);
      n.f8.accept(this);
      n.f9.accept(this);
      n.f10.accept(this);
      n.f11.accept(this);
      n.f12.accept(this);
      n.f13.accept(this);
      n.f14.accept(this);
      n.f15.accept(this);
      n.f16.accept(this);
      return _ret;
   }

   /**
    * f0 -> ClassDeclaration()
    *       | ClassExtendsDeclaration()
    */
   public R visit(TypeDeclaration n) {
      R _ret=null;
      n.f0.accept(this);
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
   public R visit(ClassDeclaration n) {
      R _ret=null;
      n.f0.accept(this);
      currentClass = (String) n.f1.accept(this);
      currentSymbolTable = global.get(currentClass);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
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
   public R visit(ClassExtendsDeclaration n) {
      R _ret=null;
      n.f0.accept(this);
      currentClass = (String) n.f1.accept(this);
      currentSymbolTable = global.get(currentClass);
      n.f2.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
      n.f7.accept(this);
      return _ret;
   }

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    * f2 -> ";"
    */
   public R visit(VarDeclaration n) {
      R _ret=null;
      String type = (String) n.f0.accept(this);
      String name = (String) n.f1.accept(this);
      n.f2.accept(this);
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
   public R visit(MethodDeclaration n) {
      R _ret=null;
      n.f0.accept(this);
      String methodType = (String) n.f1.accept(this);
      if(!global.containsKey(methodType))
          cryError("Improper return type" + methodType);
      String methodName = (String) n.f2.accept(this);
      Signature methodSign = (Signature) currentSymbolTable.getSignature(methodName);
      String parent = currentSymbolTable.parent;
      currentSymbolTable = methodSign.symbolTable;
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
      n.f7.accept(this);
      n.f8.accept(this);
      n.f9.accept(this);
      String expType = (String) n.f10.accept(this);
      if(!parent.equals("main")) {
          R existingMethod2 = global.get(parent).getSignature(methodName);
          if(existingMethod2 != null) {
              Signature existingMethod = (Signature) existingMethod2;
              if(!compare(existingMethod, methodSign))
                  cryError("improper overriding");
          }
      }
      if(!typeEquals(methodType, expType))
          cryError("Improper return Expression");
      n.f11.accept(this);
      n.f12.accept(this);
      currentSymbolTable = global.get(currentClass);
      return _ret;
   }

   /**
    * f0 -> FormalParameter()
    * f1 -> ( FormalParameterRest() )*
    */
   public R visit(FormalParameterList n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      return _ret;
   }

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    */
   public R visit(FormalParameter n) {
      R _ret=null;
      String type = (String) n.f0.accept(this);
      if(!global.containsKey(type))
          cryError("Improper argument type");
      n.f1.accept(this);
      return _ret;
   }

   /**
    * f0 -> ","
    * f1 -> FormalParameter()
    */
   public R visit(FormalParameterRest n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      return _ret;
   }

   /**
    * f0 -> ArrayType()
    *       | BooleanType()
    *       | IntegerType()
    *       | Identifier()
    */
   public R visit(Type n) {
      R _ret=null;
      String type = (String) n.f0.accept(this);
      if(!global.containsKey(type))
          cryError("No type like " + type);
      return (R) type;
   }

   /**
    * f0 -> "int"
    * f1 -> "["
    * f2 -> "]"
    */
   public R visit(ArrayType n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      String type = "int[]";
      return (R) type;
   }

   /**
    * f0 -> "boolean"
    */
   public R visit(BooleanType n) {
      R _ret=null;
      n.f0.accept(this);
      String type = "boolean";
      return (R) type;
   }

   /**
    * f0 -> "int"
    */
   public R visit(IntegerType n) {
      R _ret=null;
      n.f0.accept(this);
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
   public R visit(Statement n) {
      R _ret=null;
      n.f0.accept(this);
      return _ret;
   }

   /**
    * f0 -> "{"
    * f1 -> ( Statement() )*
    * f2 -> "}"
    */
   public R visit(Block n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      return _ret;
   }

   /**
    * f0 -> Identifier()
    * f1 -> "="
    * f2 -> Expression()
    * f3 -> ";"
    */
   public R visit(AssignmentStatement n) {
      R _ret=null;
      String name = (String) n.f0.accept(this);
      String type = "main";
      R type1 = currentSymbolTable.getVariable(name);
      if(type1 != null)
          type = (String) type1;
      else
          cryError("No variable like " + name);
      n.f1.accept(this);
      String expType = (String) n.f2.accept(this);
      if(!typeEquals(type, expType))
          cryError("Id exp does not match");
      n.f3.accept(this);
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
   public R visit(ArrayAssignmentStatement n) {
      R _ret=null;
      String name = (String) n.f0.accept(this);
      String type = "main";
      R type1 = currentSymbolTable.getVariable(name);
      if(type1 != null)
          type = (String) type1;
      else
          cryError("not variable");
      if(!type.equals("int[]"))
          cryError("not array");
      n.f1.accept(this);
      type = (String) n.f2.accept(this);
      if(!type.equals("int"))
          cryError("not int");
      n.f3.accept(this);
      n.f4.accept(this);
      type = (String) n.f5.accept(this);
      if(!type.equals("int"))
          cryError("not int");
      n.f6.accept(this);
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
   public R visit(IfStatement n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      String type = (String) n.f2.accept(this);
      if(!type.equals("boolean"))
          cryError("not boolean");
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
      return _ret;
   }

   /**
    * f0 -> "while"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Statement()
    */
   public R visit(WhileStatement n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      String type = (String) n.f2.accept(this);
      if(!type.equals("boolean"))
          cryError("not boolean");
      n.f3.accept(this);
      n.f4.accept(this);
      return _ret;
   }

   /**
    * f0 -> "System.out.println"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> ";"
    */
   public R visit(PrintStatement n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      String type = (String) n.f2.accept(this);
      if(!type.equals("int"))
          cryError("can only print int");
      n.f3.accept(this);
      n.f4.accept(this);
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
   public R visit(Expression n) {
      R _ret=null;
      _ret = n.f0.accept(this);
      return _ret;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "&"
    * f2 -> PrimaryExpression()
    */
   public R visit(AndExpression n) {
       String type1 = (String) n.f0.accept(this);
       n.f1.accept(this);
       String type2 = (String) n.f2.accept(this);
       if(!(type1.equals("boolean") && type2.equals("boolean")))
          cryError("And exp error");
       return (R) "boolean";
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "<"
    * f2 -> PrimaryExpression()
    */
   public R visit(CompareExpression n) {
       String type1 = (String) n.f0.accept(this);
       n.f1.accept(this);
       String type2 = (String) n.f2.accept(this);
       if(!(type1.equals("int") && type2.equals("int")))
          cryError("Greater than exp error");
       return (R) "boolean";
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "+"
    * f2 -> PrimaryExpression()
    */
   public R visit(PlusExpression n) {
       String type1 = (String) n.f0.accept(this);
       n.f1.accept(this);
       String type2 = (String) n.f2.accept(this);
       if(!(type1.equals("int") && type2.equals("int")))
          cryError("Plus exp error");
       return (R) "int";
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "-"
    * f2 -> PrimaryExpression()
    */
   public R visit(MinusExpression n) {
       String type1 = (String) n.f0.accept(this);
       n.f1.accept(this);
       String type2 = (String) n.f2.accept(this);
       if(!(type1.equals("int") && type2.equals("int")))
          cryError("Minus Exp error");
       return (R) "int";
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "*"
    * f2 -> PrimaryExpression()
    */
   public R visit(TimesExpression n) {
       String type1 = (String) n.f0.accept(this);
       n.f1.accept(this);
       String type2 = (String) n.f2.accept(this);
       if(!(type1.equals("int") && type2.equals("int")))
          cryError("Times Exp error");
       return (R) "int";
   }
   /**
    * f0 -> PrimaryExpression()
    * f1 -> "["
    * f2 -> PrimaryExpression()
    * f3 -> "]"
    */
   public R visit(ArrayLookup n) {
       String type1 = (String) n.f0.accept(this);
       n.f1.accept(this);
       String type2 = (String) n.f2.accept(this);
       if(!(type1.equals("int[]") && type2.equals("int")))
          cryError("Array lookup error");
       return (R) "int";
   }
   /**
    * f0 -> PrimaryExpression()
    * f1 -> "."
    * f2 -> "length"
    */
   public R visit(ArrayLength n) {
      String type1 = (String) n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      if(!type1.equals("int[]"))
          cryError("ArrayLength error");
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
   public R visit(MessageSend n) {
      R _ret=null;
      String type = (String) n.f0.accept(this);
      n.f1.accept(this);
      if(isBasic(type))
          cryError("Message Send Error");
      SymbolTable symbolTable1 = global.get(type);
      String methodName = (String) n.f2.accept(this);
      _ret = symbolTable1.getSignature(methodName);
      if(_ret == null)
          cryError("Message Send error");
      Signature sign = (Signature) _ret;
      Vector<Argument> v = sign.arguments;
      Enumeration arguments = v.elements();
      argumentsList.push(arguments);
      //System.out.println(methodName);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      if(argumentsList.peek().hasMoreElements()) {
          cryError("Message Send error");
      }
      argumentsList.pop();
      return (R) sign.returnType;
   }

   /**
    * f0 -> Expression()
    * f1 -> ( ExpressionRest() )*
    */
   public R visit(ExpressionList n) {
      R _ret=null;
      String type =(String) n.f0.accept(this);
      //System.out.println(arguments.length);
      //System.out.println("Here : " + type);
      Enumeration arguments = argumentsList.peek();
      if(arguments.hasMoreElements()) {
        Argument argument = (Argument) arguments.nextElement();
          if(!typeEquals(argument.type, type))
              cryError("ExpressionList error1");
      }
      else
          cryError("ExpressionList error2");

      n.f1.accept(this);
      return _ret;
   }

   /**
    * f0 -> ","
    * f1 -> Expression()
    */
   public R visit(ExpressionRest n) {
      R _ret=null;
      n.f0.accept(this);
      String type = (String) n.f1.accept(this);
      Enumeration arguments = argumentsList.peek();
      if(arguments.hasMoreElements()) {
        Argument argument = (Argument) arguments.nextElement();
          if(!typeEquals(argument.type, type))
              cryError("ExpressionList error3");
      }
      else
          cryError("ExpressionList error4");
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
public R visit(PrimaryExpression n) {
      R pval2 = (R) n.f0.accept(this);
      if(pval2 instanceof String) {
        String pval = (String) pval2;
        if(isBasic(pval))
           return (R) pval;
        if(pval.equals("this"))
            return (R) currentClass;
        R _ret = currentSymbolTable.getVariable(pval);
        if(_ret == null)
            cryError("Primary Expression error");
        else
            return _ret;
      }
      Argument pval1 = (Argument) pval2;
      return (R) pval1.type;
   }

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public R visit(IntegerLiteral n) {
      R _ret=null;
      n.f0.accept(this);
      return (R) (String) "int";
   }

   /**
    * f0 -> "true"
    */
   public R visit(TrueLiteral n) {
      R _ret=null;
      n.f0.accept(this);
      return (R) (String) "boolean";
   }

   /**
    * f0 -> "false"
    */
   public R visit(FalseLiteral n) {
      R _ret=null;
      n.f0.accept(this);
      return (R) (String) "boolean";
   }

   /**
    * f0 -> <IDENTIFIER>
    */
   public R visit(Identifier n) {
      R _ret=null;
      n.f0.accept(this);
       return (R) n.f0.toString();

   }

   /**
    * f0 -> "this"
    */
   public R visit(ThisExpression n) {
      R _ret=null;
      n.f0.accept(this);
      return (R) "this";
   }

   /**
    * f0 -> "new"
    * f1 -> "int"
    * f2 -> "["
    * f3 -> Expression()
    * f4 -> "]"
    */
   public R visit(ArrayAllocationExpression n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      String exp = (String) n.f3.accept(this);
       if(exp.equals("int")){
           n.f4.accept(this);
           return (R) "int[]";
       }
       cryError("ArrayAllocationError");
       return _ret;
   }

   /**
    * f0 -> "new"
    * f1 -> Identifier()
    * f2 -> "("
    * f3 -> ")"
    */
   public R visit(AllocationExpression n) {
      R _ret=null;
      n.f0.accept(this);
      String type = (String) n.f1.accept(this);
      if(global.containsKey(type)){
           n.f2.accept(this);
           n.f3.accept(this);
           Argument argument = new Argument("main", type);
           return (R) argument;
       }
       cryError("AllocExpr error");
       return _ret;
   }

   /**
    * f0 -> "!"
    * f1 -> Expression()
    */
   public R visit(NotExpression n) {
      R _ret=null;
      n.f0.accept(this);
      String exp = (String) n.f1.accept(this);
       if(exp.equals("boolean")){
           return (R) "boolean";
       }
       cryError("NotExprError");
       return _ret;
   }

   /**
    * f0 -> "("
    * f1 -> Expression()
    * f2 -> ")"
    */
   public R visit(BracketExpression n) {
      R _ret=null;
      n.f0.accept(this);
      _ret = n.f1.accept(this);
      n.f2.accept(this);
      String type = (String) _ret;
      if(isBasic(type))
          return _ret;
      else {
          Argument argument = new Argument("main", type);
          return (R) argument;
      }
   }

}
