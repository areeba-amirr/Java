package JavaPackage;
class bank{ 
    private int accId;
    private String accName;
    int salary;
//Constructor is a special method
public bank(){  //Constructor
    System.out.println("CONSTRUCTER");
    accId = 101;
    accName = "Areeba Amir";
    salary = 70000;
}
public bank(int i,String n,int s){
    accId = i;
    accName = n;
    salary = s;
}
    //setter
    public void setId(int i){
        accId = i;
    }
    public void setName(String n){
        accName = n;
    }
     public void setSalary(int s){
        salary = s;
    }
    
    //getter
    public int getId(){
        return accId;
    }
    public String getName(){
        return accName;
    }
     public int getSalary(){
        return salary;
    }
}
public class Constructors {
    public static void main(String[] args) {
    bank emp = new bank(1,"Sara",30000);
    // emp.setId(101);
    // emp.setName("Areeba");
    // emp.setSalary(40000);
    System.out.println(emp.getId());
    System.out.println(emp.getName());
    System.out.println(emp.getSalary());
    }
}
