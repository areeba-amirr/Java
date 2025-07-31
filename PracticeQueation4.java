import java.util.Scanner;
public class PracticeQueation4 {
    public static void main(String[] args){
        System.out.println("Enter any character:");
        Scanner obj = new Scanner(System.in);
        char ch = obj.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("UpperCase");
        }
        else if(ch >= 'a' && ch <= 'z'){
            System.out.println("LowerCase");
        } 
        else{
            System.out.println("Special Character");
        }

    }
}
