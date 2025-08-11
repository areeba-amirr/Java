package JavaPackage;
//Custom Class 1
class Parent{
    Parent(){
        System.out.println("Parent Class Constructor");
    }
    Parent(int num){
        System.out.println(num +" Parent Class Constructor");
    }
    Parent(int no1,int no2){
        System.out.println(no1 +" Parent Class Constructor " + no2);
    }
}
//Custom Class 2
class Child extends Parent{
    Child(){
        System.out.println("Child Class Constructor");
    }
    Child(int no){
        super(no);
        System.out.println(no +" Child Class Constructor");
    }
    Child(int no1, int no2,int no3){
        // super(no2);
        super(no2,no3); 
        // super(no1+no2);
        // super(2*no2);
        System.out.println(no2 +" Child Class Constructor " + no1 );
    }
}
//Custom Class 3
class Grandchild extends Child{
    Grandchild(){
        System.out.println("Grand Child Constructor");
    }
    //  Grandchild(int num){
    //     super(num);
    //     System.out.println(num +" Grand Child Constructor");
    // }
    Grandchild(int no1,int no2){
        super(no1);
        System.out.println(no2+" Grand Child Constructor");
    }
}
public class InheritanceConstructors {
    public static void main(String[] args) {
        // Parent pObj = new Parent(2);
        // Child cObj = new Child(4,6,7);
        Grandchild gcObj = new Grandchild(2,4);
    }
}
