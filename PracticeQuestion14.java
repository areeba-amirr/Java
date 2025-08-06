import java.util.Scanner;
public class Practicequestion14 {
    static Scanner obj = new Scanner(System.in);
    static boolean searchElement(int []arr ,int key){
        for(int i = 0;i <= arr.length-1;i++){
            if(key == arr[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.print("Enter Size of array:");
        int size = obj.nextInt();
        System.out.println("******Enter an array*******");
        int []arr = new int[size];
       for(int i = 0;i <= arr.length-1; i++){
        System.out.print("Enter [" + i +"]:");
        arr[i]=obj.nextInt();
       }
       System.out.print("Enter Searching Number:");
       int search = obj.nextInt();
       System.out.println("Present : "+ searchElement(arr, search));
    }
}
