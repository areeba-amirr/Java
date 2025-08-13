package JavaPackage;
import java.util.Scanner;
class book{
    String tittle;
    String author;
    float price;
}
public class OOPsPractQue1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        book b1 = new book();
        book b2 = new book();
        System.out.print("Enter Book One Tittle:");
        b1.tittle = obj.nextLine();
        System.out.print("Enter Book One Author:");
        b1.author = obj.nextLine();
        System.out.print("Enter Book One Price:");
        b1.price = obj.nextFloat();
        System.out.print("Enter Book Two Tittle:");
        obj.nextLine();
        b2.tittle = obj.nextLine();
        System.out.print("Enter Book Two Author:");
        b2.author = obj.nextLine();
        System.out.print("Enter Book Two Price:");
        b2.price = obj.nextFloat();
        System.out.println("BOOK ONE");
        System.out.println("Tittle : " +b1.tittle);
        System.out.println("Author : " +b1.author);
        System.out.println("Price : " +b1.price);
        System.out.println("-------------------------------------");
        System.out.println("BOOK TWO");
        System.out.println("Tittle : " +b2.tittle);
        System.out.println("Author : " +b2.author);
        System.out.println("Price : " +b2.price);
    }
}
