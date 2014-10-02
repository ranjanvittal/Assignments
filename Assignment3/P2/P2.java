import syntaxtree.*;
import visitor.*;
import java.util.*;


public class P2 {
   public static void main(String [] args) {
      try {
         Node root = new MiniJavaParser(System.in).Goal();
         //System.out.println("Program parsed successfully");
         Object a =  root.accept(new GJDepthFirst(), null);
         //root.accept(new GJDepth(a), null);
         //System.out.println("Hello");
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
}
