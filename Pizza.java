public class Pizza{

   private String topping;
   private int size;
   private double cost; 

   public Pizza (String t, int s, double c){
      topping = t;
      size = s;
      cost = c;
   }
   
   public Pizza(){
      topping = "plain";
      size = 10;
      cost = 0.99;
   }
   
   public String getTopping(){
      return topping;
   }
   
   public int getSize(){
      return size;
   }
      
   public double getCost(){
      return cost;
   }
   
   public void setTopping(String t){
      topping = t;
   }
  
   public void setSize(int s){
      size = s;
   }
   
   public void setCost(double c){
      cost = c;
   }
   
   public boolean equals(Pizza other){
      return this.topping.equals(other.topping) && size == other.size && cost == other.cost;
   }
   
   public String toString(){
      return size+" inch "+topping+" Pizza will cost $"+cost;     
   }
}