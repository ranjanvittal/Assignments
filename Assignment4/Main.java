import syntaxtree.*;
import visitor.*;
import java.util.*;


public class Main {
   public static void main(String [] args) {
      try {
         Node root = new MiniIRParser(System.in).Goal();
         //System.out.println("Program parsed successfully");
         Object a =  root.accept(new GJDepthFirst(), null);
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
}
