//aliaa mamdouh 20216557
import java.util.Scanner; 
public class assignment_03_problem_03_code{ 
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;
        for (int i = 1; i <= num * 4; i++){
            if (count == 3){
                System.out.println("PUM");
                count = 0;
                continue;
            }
            System.out.printf("%d ", i);
            count += 1;
        }
    }
}