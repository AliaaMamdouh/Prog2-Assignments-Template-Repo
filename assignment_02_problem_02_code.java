//aliaa mamdouh 20216557
import java.util.Scanner; 
public class assignment_02_problem_02_code
{  
   
    public static void main(String arg[])
    {  
        		Scanner scanner = new Scanner(System.in); 
 
        int n= scanner.nextInt();
         
        for (int i = 1; i <= 12; ++i)
            System.out.println(n + " * " + i +
                               " = " + n * i);
    }
}