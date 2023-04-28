//aliaa mamdouh 20216557
import java.util.Scanner; 
public class assignment_02_problem_03_code{ 
    Scanner scr= new Scanner(System.in);
    
    int rows =scr.nextInt();
 
    for (int i = 1; i <= rows; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
