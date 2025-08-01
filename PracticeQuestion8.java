import java.util.Scanner;
public class PracticeQuestion8 {
   public static void main(String[] args){
     System.out.print("Enter any no to print its table:");
        Scanner obj = new Scanner(System.in);
        int no = obj.nextInt();
        int i = 1; //looping variable
        while(i <= 10){
            System.out.printf("%d x %d = %d\n",no,i,no*i);
            i++;
        }
   }
}
