//aliaa mamdouh 20216557
import java.util.Scanner; 
public class assignment_03_problem_02_code{ 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int a = 0, b = 1;
       
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
