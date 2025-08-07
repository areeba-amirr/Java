import java.util.Scanner;
//Custom Class
class Student{ 
    //attributes
    int id; 
    String name;
    int age;
    //method 
    public void displayDetails(){
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);

    }
    public void attendance(){
       System.out.println("Present"); 
    }
}
//another custom class
class Employee{
    int id;
    String name;
    int salary;
     public void displayDetails(){
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);

    }
}
//only single public class is use in one program
public class ObjectOrientdProgramming {
   static Scanner obj = new Scanner(System.in);
    public static void main(String[] args) {
        // *******************CUSTOM CLASS****************
        //Syntax to use class
        //className objName = new className();
        Student std1 = new Student();
        std1.id = 101;
        std1.name = "Areeba Amir";
        std1.age = 18;
        // System.out.println(std1.id);
        // System.out.println(std1.name);
        // System.out.println(std1.age);
        System.out.println("STUDENT 1");
        std1.displayDetails();
        std1.attendance();
        System.out.println("STUDENT 2");
        Student std2 = new Student();
        std2.id = 102;
        std2.name = "Haris Amir";
        std2.age = 20;
        std2.displayDetails();
        std2.attendance();
        System.out.println("EMPLOYESSSSS");
        Employee emp1 = new Employee();
        int id = obj.nextInt();
        emp1.id = id;
        obj.nextLine();
        String name = obj.nextLine();
        emp1.name = name;
        int salary = obj.nextInt();
        emp1.salary = salary;
        emp1.displayDetails();
    }
}
