import syntaxtree.*;
import visitor.*;
import java.util.*;


public class Main {
   public static void main(String [] args) {
      try {
         Node root = new MiniJavaParser(System.in).Goal();
         //System.out.println("Program parsed successfully");
         Object a =  root.accept(new GJNoArguDepthFirst());
         root.accept(new GJNoArgu(a));
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
}
