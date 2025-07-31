import java.util.Scanner;
public class IfElseStatements {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int age = obj.nextInt();
        //IF Statement
        // if(age > 18){
        //     System.out.println("Eligible to Vote");
        // }
        //IF ELSE Statement
        // if(age >= 18){
        //     System.out.println("Eligible to vote");
        // }
        // else{
        //     System.out.println("Not Eligible to vote");
        // }
        //NESTED IF Statement
        // if(age >= 18){
        //     if(age <= 60){
        //         System.out.println("Eligible to Vote");
        //     }
        //      else{
        //     System.out.println("Not Eligible");
        // }
        // }
        // else{
        //     System.out.println("Not Eligible");
        // }
        // int a = 30 , b = 20;
        // if(a >= b){
        //     if(b <= 30){
        //         System.out.println("Both Conditions Satisfied");
        //     }
        //     else {
        //         System.out.println("B is not Greater than or equal to 30");
        //     }
        // }
        // else{
        //     System.out.println("A is not greater than or eqaul to B");
        // }
        //IF ELSE IF LADDER Statement
        if(age == 18){
            System.out.println("You are teenager");
        }
        else if(age < 18){
            System.out.println("You are Kid");
        }
        else if(age >18 && age < 60){
            System.out.println("You are an Adult");
        }
        else{
            System.out.println("You are Senior Citizen");
        }

    }
}
