import syntaxtree.*;
import visitor.*;
import java.util.*;


public class Main {
   public static void main(String [] args) {
      try {
         Node root = new microIRParser(System.in).Goal();
         //System.out.println("Program parsed successfully");
         Object labels = root.accept(new GJDepthFirst(), null);
         Object argsPassed = root.accept(new GJDepth(labels), null);
         Object argsPassed2 = root.accept(new GJDepth2(labels), argsPassed);
         Object finish = root.accept(new GJDepth3(labels), argsPassed2);
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
}
