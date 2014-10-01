package visitor;
import syntaxtree.*;
import java.util.*;

public class GJDepth<R,A> extends GJDepthFirst<R,A> {

   //
   SymbolTable symbolTable;
   Stack<Enumeration> argumentsList = new Stack<Enumeration>();

   boolean isBasic(String type) {
      return type.equals("int") || type.equals("boolean") || type.equals("int[]");
   }

   boolean typeEquals(String a, String b) {
       if(a.equals(b))
           return true;
       if(isBasic(a) || isBasic(b)) {
            return false;
        }
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


   public GJDepth(Object global){
      this.global = (Hashtable<String, SymbolTable>) global;
   }

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
      cycleCheck();
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
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
   public R visit(MainClass n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
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
      String methodType = (String) n.f1.accept(this, argu);
      if(!global.containsKey(methodType))
          cryError("Improper return type" + methodType);
      String methodName = (String) n.f2.accept(this, argu);
      Signature methodSign = (Signature) currentSymbolTable.getSignature(methodName);
      String parent = currentSymbolTable.parent;
      currentSymbolTable = methodSign.symbolTable;
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      n.f5.accept(this, argu);
      n.f6.accept(this, argu);
      n.f7.accept(this, argu);
      n.f8.accept(this, argu);
      n.f9.accept(this, argu);
      String expType = (String) n.f10.accept(this, argu);
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
      n.f11.accept(this, argu);
      n.f12.accept(this, argu);
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
      String type = (String) n.f0.accept(this, argu);
      if(!global.containsKey(type))
          cryError("Improper argument type");
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
      String type = (String) n.f0.accept(this, argu);
      if(!global.containsKey(type))
          cryError("No type like " + type);
      return (R) type;
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
      String type = "int[]";
      return (R) type;
   }

   /**
    * f0 -> "boolean"
    */
   public R visit(BooleanType n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      String type = "boolean";
      return (R) type;
   }

   /**
    * f0 -> "int"
    */
   public R visit(IntegerType n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
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
      String name = (String) n.f0.accept(this, argu);
      String type = "main";
      R type1 = currentSymbolTable.getVariable(name);
      if(type1 != null)
          type = (String) type1;
      else
          cryError("No variable like " + name);
      n.f1.accept(this, argu);
      String expType = (String) n.f2.accept(this, argu);
      if(!typeEquals(type, expType))
          cryError("Id exp does not match");
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
      R type1 = currentSymbolTable.getVariable(name);
      if(type1 != null)
          type = (String) type1;
      else
          cryError("not variable");
      if(!type.equals("int[]"))
          cryError("not array");
      n.f1.accept(this, argu);
      type = (String) n.f2.accept(this, argu);
      if(!type.equals("int"))
          cryError("not int");
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      type = (String) n.f5.accept(this, argu);
      if(!type.equals("int"))
          cryError("not int");
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
      String type = (String) n.f2.accept(this, argu);
      if(!type.equals("boolean"))
          cryError("not boolean");
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      n.f5.accept(this, argu);
      n.f6.accept(this, argu);
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
      String type = (String) n.f2.accept(this, argu);
      if(!type.equals("boolean"))
          cryError("not boolean");
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
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
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      String type = (String) n.f2.accept(this, argu);
      if(!type.equals("int"))
          cryError("can only print int");
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
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
      _ret = n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "&"
    * f2 -> PrimaryExpression()
    */
   public R visit(AndExpression n, A argu) {
       String type1 = (String) n.f0.accept(this, argu);
       n.f1.accept(this, argu);
       String type2 = (String) n.f2.accept(this, argu);
       if(!(type1.equals("boolean") && type2.equals("boolean")))
          cryError("And exp error");
       return (R) "boolean";
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "<"
    * f2 -> PrimaryExpression()
    */
   public R visit(CompareExpression n, A argu) {
       String type1 = (String) n.f0.accept(this, argu);
       n.f1.accept(this, argu);
       String type2 = (String) n.f2.accept(this, argu);
       if(!(type1.equals("int") && type2.equals("int")))
          cryError("Greater than exp error");
       return (R) "boolean";
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "+"
    * f2 -> PrimaryExpression()
    */
   public R visit(PlusExpression n, A argu) {
       String type1 = (String) n.f0.accept(this, argu);
       n.f1.accept(this, argu);
       String type2 = (String) n.f2.accept(this, argu);
       if(!(type1.equals("int") && type2.equals("int")))
          cryError("Plus exp error");
       return (R) "int";
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "-"
    * f2 -> PrimaryExpression()
    */
   public R visit(MinusExpression n, A argu) {
       String type1 = (String) n.f0.accept(this, argu);
       n.f1.accept(this, argu);
       String type2 = (String) n.f2.accept(this, argu);
       if(!(type1.equals("int") && type2.equals("int")))
          cryError("Minus Exp error");
       return (R) "int";
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "*"
    * f2 -> PrimaryExpression()
    */
   public R visit(TimesExpression n, A argu) {
       String type1 = (String) n.f0.accept(this, argu);
       n.f1.accept(this, argu);
       String type2 = (String) n.f2.accept(this, argu);
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
   public R visit(ArrayLookup n, A argu) {
       String type1 = (String) n.f0.accept(this, argu);
       n.f1.accept(this, argu);
       String type2 = (String) n.f2.accept(this, argu);
       if(!(type1.equals("int[]") && type2.equals("int")))
          cryError("Array lookup error");
       return (R) "int";
   }
   /**
    * f0 -> PrimaryExpression()
    * f1 -> "."
    * f2 -> "length"
    */
   public R visit(ArrayLength n, A argu) {
      String type1 = (String) n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
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
   public R visit(MessageSend n, A argu) {
      R _ret=null;
      String type = (String) n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      if(isBasic(type))
          cryError("Message Send Error1");
      SymbolTable symbolTable1 = global.get(type);
      String methodName = (String) n.f2.accept(this, argu);
      _ret = symbolTable1.getSignature(methodName);
      if(_ret == null)
          cryError("Message Send error2");
      Signature sign = (Signature) _ret;
      Vector<Argument> v = sign.arguments;
      Enumeration arguments = v.elements();
      argumentsList.push(arguments);
      //System.out.println(methodName);
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      n.f5.accept(this, argu);
      if(argumentsList.peek().hasMoreElements()) {
          cryError("Message Send error3");
      }
      argumentsList.pop();
      return (R) sign.returnType;
   }

   /**
    * f0 -> Expression()
    * f1 -> ( ExpressionRest() )*
    */
   public R visit(ExpressionList n, A argu) {
      R _ret=null;
      String type =(String) n.f0.accept(this, argu);
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
      String type = (String) n.f1.accept(this, argu);
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
public R visit(PrimaryExpression n, A argu) {
      R pval2 = (R) n.f0.accept(this, argu);
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
   public R visit(IntegerLiteral n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      return (R) (String) "int";
   }

   /**
    * f0 -> "true"
    */
   public R visit(TrueLiteral n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      return (R) (String) "boolean";
   }

   /**
    * f0 -> "false"
    */
   public R visit(FalseLiteral n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      return (R) (String) "boolean";
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
      return (R) "this";
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
      String exp = (String) n.f3.accept(this, argu);
       if(exp.equals("int")){
           n.f4.accept(this, argu);
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
   public R visit(AllocationExpression n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      String type = (String) n.f1.accept(this, argu);
      if(global.containsKey(type)){
           n.f2.accept(this, argu);
           n.f3.accept(this, argu);
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
   public R visit(NotExpression n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      String exp = (String) n.f1.accept(this, argu);
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
   public R visit(BracketExpression n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      _ret = n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      String type = (String) _ret;
      if(isBasic(type))
          return _ret;
      else {
          Argument argument = new Argument("main", type);
          return (R) argument;
      }
   }

}
