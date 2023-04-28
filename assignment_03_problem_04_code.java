//aliaa mamdouh 20216557
import java.util.Scanner; 
public class assignment_03_problem_03_code{ 
     public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int t = input.nextInt();
    while (t-- > 0) {
       
        int x = input.nextInt();
        int y = input.nextInt();
        int sum = 0;
        for (int i = x; y > 0; i++) {
            if (i % 2 != 0) {
                sum += i;
                y--;
            }
        }
        System.out.println( sum);
    }
}
}