import java.util.*;
public class TestList{
   public static void main (String[]args){
   
      ArrayList <String> list = new ArrayList <String>();   
      for(int i = 0; i < 100; i++){
         int x = (int)(Math.random()*3+1); //3-1+1+1
         if(x == 1) 
            list.add("dog");
         if (x == 2)
            list.add("cat");
         if(x == 3)
            list.add("bird");   
      }
      System.out.println(list);
      for (int x = 0; x < list.size(); x++){
         if(list.get(x).equals("cat")){
            list.remove(x);
            x--;
         }
      }
      System.out.println(list);
      
      ArrayList <Integer> intList = new ArrayList <Integer>();
      intList.add(32);
      System.out.println(intList.get(0));
      intList.remove(0);
      
      for(int i = 0; i < 100; i++){
         int x = (int)(Math.random()*161-0-80); //max - min + 1 + first number
         intList.add(x);
      }
      System.out.println(intList);
      for (int i = 0; i < intList.size(); i++){
         if (intList.get(i) < 0){
            System.out.println(intList.remove(i));//returns and removes negative number
            i--;
         }
      }
      System.out.println(intList);
      for(int i = 0; i < intList.size(); i++){
         if (intList.get(i)%2 == 0 )
            intList.set(i, 111);
      }
      System.out.println(intList);
   }
}