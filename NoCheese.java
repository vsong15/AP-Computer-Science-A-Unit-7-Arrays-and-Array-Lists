import java.util.*;
import java.io.*;
public class NoCheese{
   public static void main (String[]args) throws Exception{
   //create file scanner
      Scanner file = new Scanner(new File("pizzaList.txt"));
   
   //create keyboard scanner
      Scanner kb = new Scanner (System.in);
      
   //create pizza array list
      ArrayList <Pizza> party = new ArrayList <Pizza>();
      
   //in loop bake all pizzas( while... hasNext() )
      while (file.hasNext()){
         party.add(new Pizza(file.next(),file.nextInt(), file.nextDouble()));
      }
      System.out.println(party);
   
   //ask user for bad topping
      System.out.println("Enter a bad topping to remove");
      String badTop = kb.next();
      
    //run static method
      System.out.println(removeTopping(party, badTop));
   }
   //static method to throw given topping
   public static ArrayList removeTopping (ArrayList<Pizza> p , String b){
      ArrayList <Pizza> newParty = new ArrayList <Pizza>();
      for (int i = 0; i < p.size() ; i++){
         if(p.get(i).getTopping().toLowerCase().contains(b.toLowerCase())==false){
            newParty.add(p.get(i));
         }
      }
      return newParty;
   }
}