public class Recursion {
    static void greet(int count){
        if(count < 5){ //base case
            System.out.println("Hello World! "+ count);
            count++;
            greet(count); //recursive call
        }
    }
    static int factorial(int no){
        int fact = 1;
        if(no >= 1){
            fact = no * factorial(no-1);
        }
        return fact;
    }
    public static void main(String[] args) {
        //***************RECURSION******************
        int count = 0;
        greet(count);
        System.out.println("Factorial:"+ factorial(5));
    }
}
