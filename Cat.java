//Child Class of different package
import JavaPackage.Animal; //import java packagae for inheritance
public class Cat extends Animal{
    public void voice(){
        System.out.println("MEOW");
    }
    public static void main(String[] args) {
        Cat cObj = new Cat();
        cObj.voice();
        cObj.eat();
        // cObj.no1 = 1; //error beacuse access modifier is private
        cObj.no2 = 1;
        cObj.no4 = 2;
        // cObj.no3 = 3; //error beacuse access modifier is default
        cObj.display(cObj.no2,cObj.no4);
        //inherit getters and setters
        cObj.setN1(10);
        cObj.setN2(20);
        System.out.println(cObj.getN1());
        System.out.println(cObj.getN2());
    }
}
