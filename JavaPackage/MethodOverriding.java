package JavaPackage;
class Vehicles{
    public void start(){
        System.out.println("Vehicle Starts");
    }
    protected int sum(int a,int b){
        return a+b;
    }
    String fullName(String name){
        return name;
    }
    protected void greet(){
        System.out.println("Hello Areeba!");
    }
}
class Car extends Vehicles{
    @Override
    public void start(){
        System.out.println("Bike Starts");
    }
    @Override
    public int sum(int a,int b){
        return a-b;
    }
    @Override
    protected String fullName(String name){
        return name;
    }
    @Override
    public void greet(){
        System.out.println("Hi Areeba!");
    }
    public void info(){
        System.out.println("Car Starts");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
    Vehicles veh = new Vehicles();
    Car c = new Car();
    // veh.start();
    c.info();
    c.start();
System.out.println(c.sum(9,4));
System.out.println(c.fullName("Areeba Muhammad Aamir"));
c.greet();
    }
    
}
