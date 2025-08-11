package JavaPackage;
class One{
    // int a;
    // //setter
    // public void setA(int a){
    //     this.a = a;
    // }
    // //getter
    // public int getA(){
    //     return this.a; //or direct return a }
    One(int a){
        System.out.println(a + " One Constructor");
    }
    One(){
        System.out.println("One Constructor");
    }
    }
class Two extends One{
    Two(int a){
        // super(a);
        System.out.println(a+" Two Constructor");
    }
    Two(){
        System.out.println("Two Constructor");
    }
}
public class ThisAndSuperKeyWord {
    public static void main(String[] args) {
        // One obj = new One();
        // obj.setA(10);
        // System.out.println(obj.getA());     
        Two obj2 = new Two(3);
    }
}
