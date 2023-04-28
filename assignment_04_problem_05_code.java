//aliaa mamdouh 20216557
import java.util.Scanner; 
public class assignment_04_problem_05_code{ 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int t = input.nextInt();
        while (t-- > 0) {
          
            int n = input.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            int minSum = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int sum = arr[i] + arr[j] + j - i;
                    if (sum < minSum) {
                        minSum = sum;
                    }
                }
            }
            System.out.println( minSum);
        }
    }
}