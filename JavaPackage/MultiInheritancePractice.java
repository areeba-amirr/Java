package JavaPackage;
class School{
School(){ //constructor
    System.out.println("School Constructor");
}
School(int area){ //constructor
    System.out.println(area +" School Constructor");
}
}
class Rooms extends School{
Rooms(){ //constructor
    System.out.println("Rooms Constructor");
}
Rooms(int totalRoom , int area){ //constructor
    super(area);
    System.out.println(totalRoom+ " Rooms Constructor");
}
}
class std extends Rooms{
std(){ //constructor
    System.out.println("Student Constructor");
}
std(int totalStd , int rooms,int area){ //constructor
    super(rooms,area);
    System.out.println(totalStd+" Student Constructor");
}
}
public class MultiInheritancePractice {
    public static void main(String[] args) {
        // School sObj = new School();
        // Rooms rObj = new Rooms();
        std stdObj = new std(100,50,1500);
    }
}
