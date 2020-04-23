import java.util.*;
public class DemoArrayList{
   public static void main (String []args){
      ArrayList<String> list = new ArrayList <String>();
      list.add("cat");
      System.out.println(list);
      //list[0] = "cat";
      list.add("dog");
      list.add("bird");
      list.add(1,"owl");
      list.remove(2);
      System.out.println(list.size());
      System.out.println(list);
   }
}