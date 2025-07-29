//Read marks of 5 subject from user along with their name and age and calculate sum,avg ,and percentage
import java.util.Scanner;
public class PracticeQuestion1 {
    public static void main(String[] args){
        System.out.print("Enter Your Name:");
        Scanner val1 = new Scanner(System.in);
        String fullName = val1.nextLine();
        System.out.print("Enter Your Age:");
        Scanner val2 = new Scanner(System.in);
        int age = val2.nextInt();
        System.out.print("Enter subject 1 marks:");
        Scanner val3 = new Scanner(System.in);
        float marks1 = val3.nextFloat();
        System.out.print("Enter subject 2 marks:");
        Scanner val4 = new Scanner(System.in);
        float marks2 = val4.nextFloat();
        System.out.print("Enter subject 3 marks:");
        Scanner val5 = new Scanner(System.in);
        float marks3 = val4.nextFloat();
        System.out.print("Enter subject 4 marks:");
        Scanner val6 = new Scanner(System.in);
        float marks4 = val6.nextFloat();
        System.out.print("Enter subject 5 marks:");
        Scanner val7 = new Scanner(System.in);
        float marks5 = val7.nextFloat();
        float sum = marks1 + marks2 + marks3 + marks4 + marks5;
        float avg = sum/5;
        float percentage = (sum*100)/500;
        System.out.print("Name:");
        System.out.println(fullName);
        System.out.print("Obtained Marks:");
        System.out.println(sum);
        System.out.print("Average:");
        System.out.println(avg);
        System.out.print("Percentage:");
        System.out.println(percentage);


    }
   
}
