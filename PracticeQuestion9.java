import java.util.Scanner;
public class PracticeQuestion9 {
    public static void main(String[] args){
        System.out.print("Enter any number to csalculate its Factorial:");
        Scanner obj = new Scanner(System.in);
        int no = obj.nextInt();
        int fact = 1;
        for(int i = 1; i <= no ;i++){
            fact *= i;
        }
        System.out.printf("Factorial of %d is %d",no,fact);

    }
}
