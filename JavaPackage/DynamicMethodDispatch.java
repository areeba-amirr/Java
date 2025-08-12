package JavaPackage;
class Phone{
    public void call(){
       System.out.println("Calling Using Phone"); 
    }
    protected String callerName(){
        return "Areeba";
    }
}
class SmartPhone extends Phone{
    @Override
    public void call(){
       System.out.println("Calling Using SmartPhone"); 
    }
    @Override
    public String callerName(){
        return "Areeba Aamir";
    }
    public void selfie(){
        System.out.println("Taking Selfie");
    }
}
public class DynamicMethodDispatch {
//Dynamic Method Dispatch or Run Time Polymorphism
    public static void main(String[] args){
    Phone Obj = new Phone();
    // pObj.call();
    //parentClass obj = new childClass(); allowed
    Phone pObj = new SmartPhone();
    pObj.call();
    System.out.println(Obj.callerName()); //Areeba
    System.out.println(pObj.callerName()); //Areeba Aamir
    // pObj.selfie(); error bcz this is not overridon method
    //Only override method will work with this object

    //ChildClass obj = new childClass();not allowed
    // SmartPhone sObj = new Phone();
    // sObj.call();
    }
}

