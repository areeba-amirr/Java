import java.util.Scanner;
public class PracticeQuestion6 {
    public static void main(String[] args){
    System.out.println("**********CALCULATOR***************");
     Scanner obj = new Scanner(System.in);
      System.out.print("Enter First Number:");
      int no1 = obj.nextInt();
      System.out.print("Enter Second Number:");
      int no2 = obj.nextInt();
      System.out.print("Enter any arithmetic operator to perform opeartion:");
      char operator = obj.next().charAt(0);
      switch(operator){
        case '+':
        System.out.printf("Addition:%d",no1+no2); break;
        case '-':
        System.out.printf("Substraction:%d",no1-no2); break;
        case '*':
        System.out.printf("Multiplication:%d",no1*no2); break;
        case '/':
        System.out.printf("Division:%d",no1/no2); break;
        case '%':
        System.out.printf("Modulus:%d",no1%no2); break;
        default : System.out.println("Invalid Choice!");
      }

    }
}
