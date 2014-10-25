import syntaxtree.*;
import visitor.*;
import java.util.*;


public class Main {
   public static void main(String [] args) {
      try {
         Node root = new microIRParser(System.in).Goal();
         //System.out.println("Program parsed successfully");
         Object labels = root.accept(new GJDepthFirst(), null);
         Object inAndOut = root.accept(new GJDepth(labels), null);
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
}
