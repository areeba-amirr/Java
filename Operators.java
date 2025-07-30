import java.util.Scanner;
public class Operators {
    public static void main(String[] args){
        System.out.println("******************OPERATORS*****************");
        System.out.println("--------Arithmetic Operators--------");
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int no1 = obj1.nextInt();
        System.out.print("Enter Second Number:");
        int no2 = obj1.nextInt();
        System.out.print("Enter Third Number:");
        int no3 = obj1.nextInt();
        int sum = no1 + no2;
        int diff = no1 - no2;
        int multiply = no1 * no2;
        float div = no1 / no2;
        int mod = no1 % no2;
        System.out.print("Addition:");
        System.out.println(sum);
        System.out.print("Substraction:");
        System.out.println(diff);
        System.out.print("Multiplication:");
        System.out.println(multiply);
        System.out.print("Division:");
        System.out.println(div);
        System.out.print("Modulus:");
        System.out.println(mod);
        System.out.println(++no1); //Increment by 1 before print 
        System.out.println(no1++);//Increment by 1 after print
        System.out.println(no1);//Updated Value after increment
        System.out.println(--no1); //Decrement by 1 before print 
        System.out.println(no1--);//Decrement by 1 after print
        System.out.println(no1); //Update value after decrement
        System.out.println("--------Assignment Operators--------");
        no1 += no2; //no1 = no1 + no2;
        System.out.println(no1);
        no1 -= no2; //no1 = no1 - no2
        System.out.println(no1);
        no1 *= no2; //no1 = no1 * no2
        System.out.println(no1);
        no1 /= no2; //no1 = no1 / no2
        System.out.println(no1);
        no1 %= no2; //no1 = no1 % no 2
        System.out.println(no1);
        System.out.println("--------Comparison Operators--------"); 
        // //always returns boolean value (either true or false)
        System.out.println(no1 == no2);
        System.out.println(no1 < no2);
        System.out.println(no1 > no2);
        System.out.println(no1 <= no2);
        System.out.println(no1 >= no2);
        System.out.println(no1 != no2);
        System.out.println("--------Logical Operators--------"); 
        //always returns boolean value (either true or false)
        System.out.println(no1>no2 && no1>no3); 
        System.out.println(no1<no2 || no1>no3);
        System.out.println(!(no1==no2));

    } 
}
