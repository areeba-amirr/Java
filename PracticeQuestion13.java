import java.util.Scanner;
public class PracticeQuestion13 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        int no = number;
        int reverse = 0;
        while( number != 0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        if(no == reverse){
            System.out.println(no+ " is Palindrome");
        }
        else{
            System.out.println(no + " is not Palindrome");
        }
    }
}
