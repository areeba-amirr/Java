package JavaPackage;
class Student{
    int a = 1; //default 
    public int b = 2; //public
    private int c = 3; //private
    protected int d = 4; //protected
    public void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
public class AcessModifiers {
    public static void main(String[] args) {
        Student std = new Student();
        std.display();
        System.out.println(std.a);
        System.out.println(std.b);
        // System.out.println(std.c); //as it's access modifier is private
        System.out.println(std.d);        
    }
}
