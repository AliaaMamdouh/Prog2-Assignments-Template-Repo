//aliaa mamdouh 20216557
import java.util.Scanner; 
public class assignment_03_problem_01_code{ 
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
         int rows = scr.nextInt();
     int k =0;
      
         for (int i = 1; i <= rows; ++i, k = 0) {
           for (int space = 1; space <= rows - i; ++space) {
             System.out.print(" ");
           }
      
           while (k != 2 * i - 1) {
             System.out.print("*");
             ++k;
           }
      
           System.out.println();
         }
       }
     }