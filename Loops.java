import java.util.Scanner;
public class Loops {
    public static void main(String[] args){
        //While Loop
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        // int i = 1; //initialization 
        // while(i <= num){ //condition
        //     System.out.printf("%d\n",i);
        //     i++; //updation
        // }
        //Do While Loop
        // int i = 1; //initialization
        // do{
        //     System.out.printf("%d\n",i); 
        //     i++; //updation
        // }
        // while(i <= num); //condition
        //For Loop
        //intialization;condition;updation
        for(int i = 1; i <= num; i++){
            System.out.printf("%d\n",i);
        }
    }
}
 