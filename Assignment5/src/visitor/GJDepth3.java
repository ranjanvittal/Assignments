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
public class GJDepth3<R,A> extends GJDepth2<R,A> {
   //
   // Auto class visitors--probably don't need to be overridden.
   //

   
	String printValue = "";
   
   public GJDepth3(Object labels) {
		super(labels);
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
      ArgsPassed2 required = (ArgsPassed2) argu;
      stmtCount = 0;
      this.allocateForMethod = required.allocateForMethod;
	  this.spillForMethod = required.spillForMethod;
	  this.savedRegistersForMethod = required.savedRegistersForMethod;
	  this.argumentCount = required.argumentCount;
	  this.thirdArgumentForMethods = required.thirdArgumentForMethods;
	  this.stackSlots = required.stackSlots;
      n.f0.accept(this, argu);
      currentMethod = "main";
      int firstArgu = argumentCount.get(currentMethod);
      int secondArgu = stackSlots.get(currentMethod);
      int thirdArgu = thirdArgumentForMethods.get(currentMethod);
      printValue += "MAIN" + "[" + firstArgu + "][" + secondArgu + "][" + thirdArgu + "]\n";
      registerAllocated = allocateForMethod.get(currentMethod);
      spilledArg = spillForMethod.get(currentMethod);
      savedRegisters = savedRegistersForMethod.get(currentMethod);
      astore(savedRegisters, firstArgu);
      stmtCount++;
      n.f1.accept(this, argu);
      aload(savedRegisters, firstArgu);
      n.f2.accept(this, argu);
      stmtCount++;
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      print(printValue);
      return _ret;
   }

   public void astore(Hashtable<Integer, String> savedRegisters, int argCount) {
	// TODO Auto-generated method stub
	   int size = savedRegisters.size();
	   print(size);
	   int i = 0;
	   int ct = 0;
	   if(argCount > 4) {
		   ct = argCount - 3;
	   }
	   while(i < size) {
		   printValue += "ASTORE SPILLED ARG" + ct++ + "s" + i + "\n";
		   i++;
	   }
   }

   public void aload(Hashtable<Integer, String> savedRegisters, int argCount) {
		// TODO Auto-generated method stub
		   int size = savedRegisters.size();
		   int i = 0;
		   int ct = 0;
		   if(argCount > 4) {
			   ct = argCount - 3;
		   }
		   while(i < size) {
			   printValue += "ALOAD " + "s" + i + "SPILLED ARG" + ct++ + "\n";
			   i++;
		   }
	}
/**
    * f0 -> ( ( Label() )? Stmt() )*
    */
   public R visit(StmtList n, A argu) {
      R _ret=null;
      Vector<Node> n1 = n.f0.nodes;
      int i = 0;
      while(i < n1.size()) {
        stmtCount++;
        NodeSequence n2 = (NodeSequence) n1.elementAt(i);
        NodeOptional n3 = (NodeOptional) n2.elementAt(0);
        String label = (String) n3.accept(this, argu);

        if(n3.present()) {
            printValue += label + " : " + "\n";
        }
        n2.accept(this, argu);
        i++;
     }
      
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
      n.f1.accept(this, argu);
      int firstArgu = argumentCount.get(currentMethod);
      int secondArgu = stackSlots.get(currentMethod);
      int thirdArgu = thirdArgumentForMethods.get(currentMethod);
      printValue += currentMethod + "[" + firstArgu + "][" + secondArgu + "][" + thirdArgu + "]\n"; 
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
      astore(savedRegisters, firstArgu);
      n.f4.accept(this, argu);
      aload(savedRegisters, firstArgu);
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
      printValue += "NOOP\n";
      return _ret;
   }

   /**
    * f0 -> "ERROR"
    */
   public R visit(ErrorStmt n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      printValue += "ERROR\n";
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
      int temp = (Integer) n.f1.accept(this, argu);
      
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
      printValue += "JUMP " + (String) n.f1.accept(this, argu) + "\n";
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
      return n.f1.accept(this, argu);
   }

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public R visit(IntegerLiteral n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      return (R) Int(n.f0.toString());
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
