import syntaxtree.*;
import visitor.*;
import java.util.*;


public class P4 {
   public static void main(String [] args) {
      try {
         Node root = new MiniIRParser(System.in).Goal();
         //System.out.println("Program parsed successfully");
         Object tempStart = root.accept(new GJNoArguDepthFirst());
         Object a =  root.accept(new GJDepthFirst(), tempStart);
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
}
