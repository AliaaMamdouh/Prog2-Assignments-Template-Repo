//aliaa mamdouh 20216557
import java.util.Scanner; 
public class assignment_04_problem_04_code{ 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int[] arr = new int[n];
      
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
      
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                   
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
      
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}