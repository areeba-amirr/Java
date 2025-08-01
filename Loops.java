import java.util.Scanner;
public class Loops {
    public static void main(String[] args){
        //While Loop(Pre Testing Loop)
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        // int i = 1; //initialization 
        // while(i <= num){ //condition
        //     System.out.printf("%d\n",i);
        //     i++; //updation
        // }
        //Do While Loop (Post Testing Loop)
        // int i = 1; //initialization
        // do{
        //     System.out.printf("%d\n",i); 
        //     i++; //updation
        // }
        // while(i <= num); //condition
        //For Loop (Definite Loop)
        //intialization;condition;updation
        for(int i = 1; i <= num; i++){
            System.out.printf("%d\n",i);
        }
    }
}
 