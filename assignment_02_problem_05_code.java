//aliaa mamdouh 20216557
import java.util.Scanner; 
public class assignment_02_problem_05_code{ 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int t = input.nextInt();
        while (t-- > 0) {
          
            int x = input.nextInt();
            boolean isPrime = true;
            if (x < 2) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(x); i++) {
                    if (x % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not");
            }
        }
    }
}