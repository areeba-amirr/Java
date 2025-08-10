import java.util.Scanner;
public class PracticeQuestion15 {
    static Scanner obj = new Scanner(System.in);
    static void primeNumbers(int limit){
        boolean isPrime = true;
        if(limit == 1){
            System.out.println("Neither Prime Nor Composite");
        }
        else{
        for(int i = 2; i <= limit/2;i++){
         if(limit % i == 0){
            isPrime = false;
            break;
         }
         else{
            isPrime = true;
         }
        }
        if(!(isPrime)){
            System.out.println(limit + " Composite Number");
        }
        else{
            System.out.println(limit + " Prime Number");
        }}

    }
    public static void main(String[] args) {
       System.out.print("Enter Any Number:");
       int num = obj.nextInt();
       primeNumbers(num); 
    }
}
