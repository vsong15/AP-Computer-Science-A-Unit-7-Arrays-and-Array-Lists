import java.util.*;
public class MazeRunnerShell
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      String[][]board=buildBoard();//must write a return method
      showBoard(board);//must write
      System.out.println("What lane would you like to Escape through?(0-4)");
      int choice = scan.nextInt();
      ArrayList <Integer> lanes = new ArrayList <Integer>();
      if(mazeRun(board,choice)){//must write
         System.out.println("FREEDOM!  You escaped!");
      }
      else
         System.out.println("um... death");
      showBoard(board);
      for (int i = 0; i <board.length; i++)
         if (mazeRun(board, i))
            lanes.add(i);
      if(lanes.size() > 0 || mazeRun(board,choice))
         System.out.println("Lane(s) "+lanes+" lead to freedom!");
      else 
         System.out.println("No lanes lead to freedom this board was rigged!");
   }
	//method to create a board(most involved)
   public static String[][] buildBoard()
   {
      String[][]board = new String[5][7];
      for (int r = 0; r < board.length; r++){
         for(int c = 0; c < board[0].length; c++)
            board[r][c] = "   ";
         int x = (int)(Math.random()*7);
         board[r][x] = " | ";
         int y = (int)(Math.random()*7);
         while (y == x )
            y = (int)(Math.random()*7);
         board[r][y] = " @ ";
         int z = (int)(Math.random()*7);
         while (z == x || z == y)
            z = (int)(Math.random()*7);
         board[r][z] = " ^ ";
      }
      return board;
   }
   
	//method to display a board(easy)
   public static void showBoard(String[][]b)
   {
      for(int r = 0; r < b.length; r++){
         for (int c = 0; c < b[0].length; c++){
            System.out.print(b[r][c]);
         }
         System.out.println();
      }
   }
   
	//method to determine if there was an escape(med)
   public static boolean mazeRun(String[][]b,int r)
   {
      for(int c = 0; c < b[0].length; c++){
         if (b[r][c].equals(" | "))
            return false;
         else if (b[r][c].equals(" ^ ") && r!= 0){
            b[r][c] = " M ";
            r--;
         }
         else if (b[r][c].equals(" @ ") && r!= 4){
            b[r][c] = " M ";
            r++;
         }
         else
            b[r][c] = " M ";
      }
      return true;
   }
}