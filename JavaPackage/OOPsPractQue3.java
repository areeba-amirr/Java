package JavaPackage;
import java.util.Scanner;
class Student1{
    private String name;
    private int marks;
    //Setter
    public void setName(String name){
        this.name = name;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }
    //getter
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
    public void display(String name ,int marks){
        System.out.println("Name : "+ name);
        System.out.println("Marks : "+ marks);
    }
}
public class OOPsPractQue3 {
    public static void main(String[] args) {
       Student1 sobj1 = new Student1(); 
       Student1 sobj2 = new Student1(); 
      Scanner obj = new Scanner(System.in);
       System.out.print("Name : ");
       sobj1.setName(obj.nextLine());
       System.out.print("Marks : ");
       sobj1.setMarks(obj.nextInt());
        obj.nextLine();
       System.out.print("Name : ");
       sobj2.setName(obj.nextLine());
       System.out.print("Marks : ");
       sobj2.setMarks(obj.nextInt());
      
       System.out.println("******Student 1 ********");
       sobj1.display(sobj1.getName(), sobj1.getMarks());
       System.out.println("******Student 2 ********");
       sobj2.display(sobj2.getName(), sobj2.getMarks());
    }
}
