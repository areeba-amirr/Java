import java.util.Scanner;
public class PracticeQuestion12 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Rows:");
         int row = obj.nextInt();
        System.out.print("Enter Cols:");
        int col = obj.nextInt();
        int countEven = 0,countOdd = 0;
        obj.nextLine();
        int [][] num = new int[row][col];
        for(int i = 0;i <= num.length-1;i++){
            for(int j = 0;j <= num[i].length-1;j++){
                System.out.print("Enter ["+ i +"]["+ j +"]");
                num [i][j]= obj.nextInt();
                if(num[i][j]%2 == 0){
                    ++countEven;
                }
                else{
                    ++countOdd;
                }
                
            }
        }
        int [] evenArr = new int[countEven];
        int [] oddArr = new int[countOdd];
        int eIndex = 0,oIndex = 0;
         for(int i = 0;i <= num.length-1;i++){
            for(int j = 0;j <= num[i].length-1;j++){
                if(num[i][j]%2 == 0){
                   evenArr[eIndex++] = num[i][j];
                }
                else{
                  oddArr[oIndex++] = num[i][j];            
                }
                
            }
        }
        System.out.println("Total Even Numbers:"+ countEven);
        for(int i = 0 ; i <= evenArr.length-1; i++){
            System.out.print(evenArr[i]+ " ");
        }
        System.out.println();
        System.out.println("Total Odd Numbers:"+ countOdd);
        for(int i = 0 ; i <= oddArr.length-1; i++){
            System.out.print(oddArr[i]+ " ");
        }
    }
}
