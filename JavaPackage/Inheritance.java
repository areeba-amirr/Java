package JavaPackage;
class Base{ //Parent Class
    public int a;
    protected int b;
    private int c;
    int d;
    //Setter for d
    public void setC(int d){
        this.d = d;
    }
    public int getC(){
        return this.d;
    }
}
class Derived extends Base{ //Child Class
    public int e;
}
//Another for practice
class Subjects{ //parent class
   public String sub;
}
class members extends Subjects{ //child class 
    int id; //default
   public  String name;
   public void display(int id,String name , String sub){
    this.id = id;
    this.name = name;
    this.sub = sub;
    System.out.println("Id : "+ this.id);
     System.out.println("Name : "+ this.name);
      System.out.println("Subject : "+ this.sub);
   }
}
public class Inheritance {
   public static void main(String[] args) {
     Base bs = new Base();
    Derived de = new Derived();
    de.a= 1;
    de.b= 2;
    de.e = 8;
    // de.c=7; //error because it is private
    de.setC(2);
    System.out.println(de.getC());
    de.d=6;
    System.out.println(de.a);
    System.out.println(de.b);
    System.out.println(de.d);
    System.out.println(de.e);
    members mem = new members();
    mem.id = 101;
    mem.name = "Areeba";
    mem.sub = "Maths";
    mem.display(mem.id,mem.name,mem.sub);
   }
}

