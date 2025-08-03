import java.util.Scanner;
public class Loops {
    public static void main(String[] args){
        //While Loop(Pre Testing Loop)
        // Scanner obj = new Scanner(System.in);
        // int num = obj.nextInt();
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
        // for(int i = 1; i <= num; i++){
        //     System.out.printf("%d\n",i);
        // }
        //BREAK
        // for(int i = 1;i <= 10; i++){
        //     if (i == 6) break; //terminate the loop
        //     System.out.println(i);
        // }
        // System.out.println("Loop End");
        //Continue
        //  for(int i = 1;i <= 10; i++){
        //     if (i == 4) continue; //only skip this iteration
        //      System.out.println(i);
        // }
        // System.out.println("Loop End");
        //*****************NESTED LOOPS**************
        // for(int i=1;i <= 3;i++){ //outer loop
        //     for(int j=1;j <= 3;j++){ //inner loop
        //         System.out.print(i + " " + j + " ");
        //     }
        // }
        // for(int i=1;i <= 3;i++){
        //     for(int j = 1;j <= 3;j++){
        //         if(i == 2 && j == 2){
        //             break;
        //         }
        //         System.out.println(i + " " + j);
        //     }
        // }
         outside: for(int i=1;i <= 3;i++){
           inside: for(int j = 1;j <= 3;j++){
                if(i == 2 && j == 2){
                    // break outside;
                     break inside;
                }
                System.out.println(i + " " + j);
            }
        }

    }
}
 