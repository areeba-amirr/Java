package JavaPackage;
interface I1{
     int age = 21; //public static final
    abstract public void show();
    default void greet(){
        System.out.println("Hello");
    }
    static void greeting(){
        System.out.println("Hi");
    }
}
interface I2{
void display();  
}
class Test implements I1,I2{
    @Override
    public void show(){
        System.out.println("Hello");
    }
    @Override
    public void display(){
        System.out.println("Override Method");
    }
} 
public class Interfaces {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        System.out.println(I1.age);
        t.greet();
        I1.greeting();
        t.display();

    }
}
