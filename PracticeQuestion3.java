import java.util.Scanner;
public class PracticeQuestion3 {
    public static void main(String[] args){
        System.out.print("Enter your marks:");
        Scanner obj = new Scanner(System.in);
        int marks = obj.nextInt();
        if(marks >= 90 && marks <= 100){
            System.out.println("A+ Grade");
        }
        else if(marks >= 80 && marks < 90){
            System.out.println("A Grade");
        }
        else if(marks >= 70 &&  marks < 80){
            System.out.println("A- Grade");
        }
        else if(marks >= 60 && marks < 70){
            System.out.println("B Grade");
        }
        else if(marks >= 50 && marks < 60){
            System.out.println("C Grade");
        }
        else if(marks >= 40 && marks < 50){
            System.out.println("D Grade");
        }
        else{
            System.out.println("Failed!");
        }

    }
}
