//aliaa mamdouh 20216557
import java.util.Scanner; 
public class assignment_02_problem_04_code{ 
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        int rows =scr.nextInt();
     
        for (int i = rows; i >= 1; --i) {
          for (int j = 1; j <= i; ++j) {
            System.out.print("*");
          }
          System.out.println();
        }
      }
    }
    