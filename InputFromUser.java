import java.util.Scanner; //Package for Scanner
public class InputFromUser {
    public static void main(String[] args) {
        System.out.println("**********READ INPUT FRON USER********");
        System.out.print("Enter Your Age:");
        Scanner obj = new Scanner(System.in); //obj is an object (can be any name)
        int age = obj.nextInt(); //using nextInt()because input value will be an integer
        System.out.print("Your Age :");
        System.out.println(age);
        System.out.print("Enter Your Name:");
        Scanner input = new Scanner(System.in);
        // String name = input.next(); //next()only read word prior to space
        // System.out.println("Your Name is");
        // System.out.println(name);
        String fullName = input.nextLine(); //nextLine() reads complete line
        System.out.print("Your Name:");
        System.out.println(fullName);
        System.out.print("Enter Your Height");
        Scanner value = new Scanner(System.in);
        float height = value.nextFloat();  //nextFloat()to read float
        System.out.println("Your Height:");
        System.out.println(height);
        System.out.print("Enter Your Group");
        Scanner val = new Scanner(System.in);
        char group = val.next().charAt(0); //.charAt(index) use to read character from user,here 0 represnets index 
        System.out.print("Your Group:");
        System.out.print(group);
    }
}
