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
public class GJDepth2<R,A> extends GJDepth<R,A> {

	public GJDepth2(Object labels) {
		super(labels);
	}

//
   // Auto class visitors--probably don't need to be overridden.
   //
   Hashtable<String, Integer> thirdArgumentForMethods = new Hashtable<String, Integer>();
   int maxArg;
   
   public class ArgsPassed2 {
	   Hashtable<String, Hashtable<Integer, String>> allocateForMethod;
	   Hashtable<String, Integer> stackSlots;
	   Hashtable<String, Hashtable<Integer, String>>  savedRegistersForMethod;
	   Hashtable<String, Integer> argumentCount;
	   Hashtable<String, Hashtable<Integer, Integer>> spillForMethod;
	   Hashtable<String, Integer> thirdArgumentForMethods;
   }
   
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
    * f0 -> "MAIN"
    * f1 -> StmtList()
    * f2 -> "END"
    * f3 -> ( Procedure() )*
    * f4 -> <EOF>
    */
   public R visit(Goal n, A argu) {
      R _ret=null;
      ArgsPassed arg = (ArgsPassed) argu;
      n.f0.accept(this, argu);
      stmtCount++;
      currentMethod = "main";
      maxArg = 0;
      //labels = new Hashtable<String, Integer>();
      n.f1.accept(this, argu);
      thirdArgumentForMethods.put(currentMethod, maxArg);
      n.f2.accept(this, argu);
      stmtCount++;
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      //printHash(labels);
      //printLabels(argumentCount);
      ArgsPassed2 arg2 = new ArgsPassed2();
      arg2.allocateForMethod = arg.allocateForMethod;
      arg2.argumentCount = arg.argumentCount;
      arg2.savedRegistersForMethod = arg.savedRegistersForMethod;
      arg2.spillForMethod = arg.spillForMethod;
      arg2.stackSlots = arg.stackSlots;
      arg2.thirdArgumentForMethods = thirdArgumentForMethods;
      
      printAllFromDepth2(arg2);
      return (R) arg2;
   }

   public void printAllFromDepth2(ArgsPassed2 arg2) {
     print("printing allocated");
     printStringIntString(arg2.allocateForMethod);
     print("\n");
     print("printing saved");
     printStringIntString(arg2.savedRegistersForMethod);
     print("\n");
     print("printing spills");
     printStringIntInt(arg2.spillForMethod);
     print("\n");
     print("argument count");
     printLabels(arg2.argumentCount);
     print("\n");
     print("stack slots");
     printLabels(arg2.stackSlots);
     print("\n");
     print("third argument");
     printLabels(arg2.thirdArgumentForMethods);
   }
   
   public void printStringIntString(
		Hashtable<String, Hashtable<Integer, String>> stringIntString) {
	// TODO Auto-generated method stub
	   Enumeration method = stringIntString.keys();
	   while(method.hasMoreElements()) {
		   String name = (String) method.nextElement();
		   print(name + " : \n");
		   printIntString(stringIntString.get(name));
	   }	
   }

   public void printIntString(Hashtable<Integer, String> hashtable) {
	// TODO Auto-generated method stub
		Enumeration method = hashtable.keys();
	   while(method.hasMoreElements()) {
		   Integer name = (Integer) method.nextElement();
		   print(name + " : " + hashtable.get(name));
	   }
	   print("\n");
   }
   
   public void printIntInt(Hashtable<Integer, Integer> hashtable) {
		// TODO Auto-generated method stub
			Enumeration method = hashtable.keys();
		   while(method.hasMoreElements()) {
			   Integer name = (Integer) method.nextElement();
			   print(name + " : " + hashtable.get(name));
		   }
		   print("\n");
	   }

   public void printStringIntInt(
			Hashtable<String, Hashtable<Integer, Integer>> stringIntInt) {
		// TODO Auto-generated method stub
		   Enumeration method = stringIntInt.keys();
		   while(method.hasMoreElements()) {
			   String name = (String) method.nextElement();
			   print(name + " : ");
			   printIntInt(stringIntInt.get(name));
		   }	
	   }
/**
    * f0 -> ( ( Label() )? Stmt() )*
    */
   public R visit(StmtList n, A argu) {
      R _ret=null;
      // Vector<Node> n1 = n.f0.nodes;
      // int i = 0;
      // while(i < n1.size()) {
      //   stmtCount++;
      //   NodeSequence n2 = (NodeSequence) n1.elementAt(i);
      //   NodeOptional n3 = (NodeOptional) n2.elementAt(0);
      //   String label = (String) n3.accept(this, argu);

      //   if(n3.present()) {
      //       //print(label);
      //       //print(stmtCount);
      //       labels.put(label, stmtCount);
      //   }
      //   n2.accept(this, argu);
      //   i++;
      // }
      n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> Label()
    * f1 -> "["
    * f2 -> IntegerLiteral()
    * f3 -> "]"
    * f4 -> StmtExp()
    */
   public R visit(Procedure n, A argu) {
      R _ret=null;
      currentMethod = (String) n.f0.accept(this, argu);
      stmtCount++;
      maxArg = 0;
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      //printLabels(thirdArgumentForMethods);
      thirdArgumentForMethods.put(currentMethod, maxArg);
      return _ret;
   }

   /**
    * f0 -> NoOpStmt()
    *       | ErrorStmt()
    *       | CJumpStmt()
    *       | JumpStmt()
    *       | HStoreStmt()
    *       | HLoadStmt()
    *       | MoveStmt()
    *       | PrintStmt()
    */
   public R visit(Stmt n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "NOOP"
    */
   public R visit(NoOpStmt n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "ERROR"
    */
   public R visit(ErrorStmt n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "CJUMP"
    * f1 -> Temp()
    * f2 -> Label()
    */
   public R visit(CJumpStmt n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "JUMP"
    * f1 -> Label()
    */
   public R visit(JumpStmt n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "HSTORE"
    * f1 -> Temp()
    * f2 -> IntegerLiteral()
    * f3 -> Temp()
    */
   public R visit(HStoreStmt n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "HLOAD"
    * f1 -> Temp()
    * f2 -> Temp()
    * f3 -> IntegerLiteral()
    */
   public R visit(HLoadStmt n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "MOVE"
    * f1 -> Temp()
    * f2 -> Exp()
    */
   public R visit(MoveStmt n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "PRINT"
    * f1 -> SimpleExp()
    */
   public R visit(PrintStmt n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> Call()
    *       | HAllocate()
    *       | BinOp()
    *       | SimpleExp()
    */
   public R visit(Exp n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "BEGIN"
    * f1 -> StmtList()
    * f2 -> "RETURN"
    * f3 -> SimpleExp()
    * f4 -> "END"
    */
   public R visit(StmtExp n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      stmtCount++;
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      stmtCount++;
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      stmtCount++;
      return _ret;
   }

   /**
    * f0 -> "CALL"
    * f1 -> SimpleExp()
    * f2 -> "("
    * f3 -> ( Temp() )*
    * f4 -> ")"
    */
   public R visit(Call n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      int a = n.f3.nodes.size();
      if(a > maxArg) maxArg = a;
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "HALLOCATE"
    * f1 -> SimpleExp()
    */
   public R visit(HAllocate n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> Operator()
    * f1 -> Temp()
    * f2 -> SimpleExp()
    */
   public R visit(BinOp n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "LT"
    *       | "PLUS"
    *       | "MINUS"
    *       | "TIMES"
    */
   public R visit(Operator n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> Temp()
    *       | IntegerLiteral()
    *       | Label()
    */
   public R visit(SimpleExp n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "TEMP"
    * f1 -> IntegerLiteral()
    */
   public R visit(Temp n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public R visit(IntegerLiteral n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> <IDENTIFIER>
    */
   public R visit(Label n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      return (R) n.f0.toString();
   }

}
