import java.util.Scanner;
public class ParcticeQuestion2 {
    public static void main(String[] args){
        System.out.println("*************Swapping of Two Numbers*************");
        Scanner obj = new Scanner(System.in);
        int no1 = obj.nextInt();
        int no2 = obj.nextInt();
        System.out.print("Before Swapping:");
        System.out.print(no1);
        System.out.println(no2);
        // int temp = no1;
        // no1 = no2;S
        // no2 = temp;
        //or
        // no1 = (no1 * no2);
        // no2 = no1/no2;
        // no1 = no1/no2;
        //or
        no1= no1 + no2;
        no2 = no1 - no2;
        no1 = no1 - no2;
        System.out.print("After Swapping:");
        System.out.print(no1);
        System.out.println(no2);
    }
}
