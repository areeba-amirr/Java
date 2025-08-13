package JavaPackage;
class Calculator{
    public int add(int no1,int no2){
        return no1+no2;
    }
    public int add(int no1,int no2,int no3){
        return no1+no2+no3;
    }
}
public class OOPsPractQue2 {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.print("Sum Of Two Numbers:");
        System.out.println(obj.add(6, 9));
        System.out.print("Sum Of Three Numbers:");
        System.out.println(obj.add(6, 9,7));
    }
}
