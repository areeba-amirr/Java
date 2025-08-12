package JavaPackage;
/*For Abstract Methods
 
public abstract returnType methodName (parameter list);
                    or
abstract public returnType methodName (parameter list); (better approach)

For Abstract Clsass
abstract class classNasmre{}
 */
abstract class Vehicle{
    abstract public void start();
}
class car1 extends Vehicle{
    @Override
     public void start(){
        System.out.println("Car Starts");
     }
}
class bike1 extends Vehicle{
    @Override
    public void start(){
        System.out.println("Bike Starts");//Method Signature
     }
}
public class Abstract {
    public static void main(String[] args) {
      car1 cObj = new car1();
      cObj.start();
      bike1 bObj = new bike1();
      bObj.start();
    //   Vehicle v = new Vehicle;// error
       Vehicle vObj = new car1();
       vObj.start();
       Vehicle vObj1 = new bike1();
       vObj1.start();
}
}
