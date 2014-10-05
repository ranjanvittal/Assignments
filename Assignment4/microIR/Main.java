import syntaxtree.*;
import visitor.*;
import java.util.*;


public class Main {
   public static void main(String [] args) {
      try {
         Node root = new microIRParser(System.in).Goal();
         System.out.println("Program parsed successfully");
         //Object tempStart = root.accept(new GJNoArguDepthFirst());
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
}
