package JavaPackage;
import java.util.Scanner;
class Employees{
    protected String name;
    protected int marks;
}
class Manager extends Employees{
    protected String department;
    public void display(int marks,String name ,String dep){
        System.out.println("Name : "+ name);
        System.out.println("Marks : "+ marks);
        System.out.println("Department : "+ dep);
    }
}
public class OOPsPractQue4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Manager mobj = new Manager();
        System.out.print("Enter Name : ");
        mobj.name = obj.nextLine();
        System.out.print("Enter Marks : ");
        mobj.marks = obj.nextInt();
        obj.nextLine();
        System.out.print("Enter Department : ");
        mobj.department = obj.nextLine();
        System.out.println("------------------------------------");
        mobj.display(mobj.marks,mobj.name , mobj.department);
    
    }
}
