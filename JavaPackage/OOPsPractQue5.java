package JavaPackage;
class Animals1{
    void sound(){
        System.out.println("I can produce sound");
    }
}
class Cats extends Animals1{
    @Override
    void sound(){
        System.out.println("I do Meow Meow");
    }
}
class Dogs extends Animals1{
    @Override
    void sound(){
        System.out.println("I do Bhou Bhou");
    }
}
public class OOPsPractQue5 {
    public static void main(String[] args) {
        Animals1 aObj = new Cats();
        aObj.sound();
        Animals1 bObj = new Dogs();
        bObj.sound();
    }
}
