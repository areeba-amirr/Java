import java.util.Scanner;
public class Methods {
    // static int addNumbers(int a ,int b){ //here a and b are parameters(formal values)
    //     int sum = a + b;
    //     return sum;
    // }
    //   staic float multiply(float no1 , float no2){
    //     float product = no1 * no2;
    //     return product;
    // }
    //for object
        float multiply(float no1 , float no2){
        float product = no1 * no2;
        return product;
    }
    //function that take nothing and return nothing
   static void greetings(){
        System.out.println("Hello Areeba!");
    }
    //Fnction take nothing but return something
    static int squareOfNum(){
        Scanner obj2 = new Scanner(System.in);
        int a = obj2.nextInt();
        int square = a*a;
        return square;
    }
    //Function return nothing but take something
    static void multiplicationTable(int no){
        int i = 1;
        while(i <= 10){
            System.out.printf("%d x %d = %d\n",no,i, no*i);
            i++;
        }
    }
    public static void main(String[] args) {
        // **************METHODS*********************
        //Syntax (always define outside the main)
        //returnType methodName (datatype parameters){
        //block of code
        //}
        Scanner obj = new Scanner(System.in);
        // int a = obj.nextInt();
        // int b = obj.nextInt();
        // int result = addNumbers(a,b); //here a and b are arguments (actual values)
        // System.out.println("Sum:"+ result);
        // float result2 = multiply(6.9f,4.6f);
        // System.out.println("Product:"+ result2);
        //By objects
        //calssName objectName = new Methods();
    //     Methods obj1 = new Methods();
    //    float results = obj1.multiply(3.4f,4.5f);
    //    System.out.println("Product:"+ results);
    //    greetings();
    //    System.out.println("Square:"+squareOfNum());
       int number = obj.nextInt();
       multiplicationTable(number);
    }
}
