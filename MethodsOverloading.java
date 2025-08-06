public class MethodsOverolading {
    static void changeVariable(int no){
        no = 25;
    }
    static void changeArrayElements(int [] marks){
        marks[0] = 33;
    }
    //Method Overloading
    static int sumOfNum(int no1,int no2){
        int result = no1 + no2;
        return result;
    }
    static int sumOfNum(int no1, int no2, int no3){
        int result = no1 + no2 + no3;
        return result;
    }
    static void greet(){
        System.out.println("Hello");
    }
    static void greet(String name){
        System.out.println("Hello " + name);
    }
    static void greet(String name , String name1){
        System.out.println("Hello " + name + " " +name1);
    }
    public static void main(String[] args) {
       //Change Value of a Variable
    //    int age = 20;
    //    System.out.println("Actual Age:"+ age);
    //    changeVariable(age);
    //    System.out.println("Age after changing:"+ age); 
       //no change occur cause passing copy of actual value
       //Change value of an array
    //    int [] marks = {21,22,23,24,25};
    //    System.out.println("marks at 0 index before changing"+ marks[0]);
    //    changeArrayElements(marks);
    //     System.out.println("marks at 0 index after changing"+ marks[0]);
        //change occurs cause when we pass array in function, its indexes will pass that actually point the actual value
        //***********************METHOFD OVERLOADING********************
        //Two or motre methods can be off same name but their parameters must not have similar
        int num1 = 20 ,num2 = 30 ,num3 = 40;
        System.out.println("Sum of Two Numbers:"+sumOfNum(num1, num2));
        System.out.println("Sum of Three Numbers:"+sumOfNum(num1, num2, num3));
        greet();
        greet("Areeba");
        greet("Areeba", "Amir");
    }
}