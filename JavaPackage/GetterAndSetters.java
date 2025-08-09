package JavaPackage;
class office{
    int id;
    String name;
    //setter for id
    public void setId(int i){
        id = i;
    }
    //getter for id
    public int getId(){
        return id;
    }
    //setter for name
    public void setName(String n){
        name = n;
    }
    //getter for name
    public String getName(){
        return name;
    }
}
public class GetterAndSetters {
    public static void main(String[] args) {
        office emp1 = new office();
        emp1.setId(101);
        emp1.setName("Areeba");
        System.out.println(emp1.getId());
        System.out.println(emp1.getName());
        
    }
 
}
