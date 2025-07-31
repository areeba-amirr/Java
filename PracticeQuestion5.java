import java.util.Scanner;
public class PracticeQuestion5 {
    public static void main(String[] args){
       System.out.println("Enter your elictricity units:");
       Scanner obj = new Scanner(System.in);
       int units = obj.nextInt();
       int totalBill;
       if(units <= 100){
        totalBill = 5*units;
       }
       else if(units > 100 && units <= 200){
        totalBill = 10*units;
       }
       else if(units > 200 && units <=300){
        totalBill = 15*units;
       }
       else{
        totalBill = 20*units;
       }
       System.out.printf("Total Bill: %d",totalBill);

    }
}
