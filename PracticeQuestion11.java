import java.util.Scanner;
public class PracticeQuestion11 {
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
       System.out.print("Enter Rows:");
       int row = obj.nextInt();
       System.out.print("Enter Coloumns:");
       int col = obj.nextInt();
       obj.nextLine();
       int sum = 0;
       int [][] arr = new int[row][col];
       for(int i = 0;i <= arr.length-1;i++ ){
        for(int j = 0; j <= arr[i].length-1;j++){
            System.out.print("Enter [" + i +"][" + j +"]:");
            arr[i][j] = obj.nextInt();
            sum += arr[i][j];
        }
       }
       System.out.println("Sum:"+ sum);
    }
}
