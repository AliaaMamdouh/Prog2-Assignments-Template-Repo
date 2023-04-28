//aliaa mamdouh 20216557
import java.util.Scanner;
public class assignment_04_problem_02_code {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
     
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 10) {
                System.out.println("A[" + i + "] = " + arr[i]);
            }
        }
    }

}
