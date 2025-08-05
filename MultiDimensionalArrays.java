import java.util.Scanner;
public class MultiDimensionalArrays {
    public static void main(String[] args) {
        // ***********************2D Array********************
        //Syntax
        //datatype [][] nameofarray = new datatype[sizeofrows][sizeofcolumns];
        //initialization
        //nameofarray [row No][col No] = value;
        //nameofarray [row No][col No] = value;
        //nameofarray [row No][col No] = value;
        int [][] marks = new int[3][3];
        marks[0][0] = 10;
        marks[0][1] = 20;
        marks[0][2] = 30;
        marks[1][0] = 40;
        marks[1][1] = 50;
        marks[1][2] = 60;
        marks[2][0] = 70;
        marks[2][1] = 80;
        marks[2][2] = 90;
        // System.out.println(marks.length);//length of an array
        // System.out.println(marks[0].length); //length of each row
        // for(int i = 0; i <= marks.length-1;i++){
        //     for(int j = 0;j <= marks.length-1;j++){
        //         System.out.print(marks[i][j]+ " ");
        //     }
        //     System.out.printf("\n");
        // }
        //For Each loop
        for(int [] innerArray : marks){
            for(int element : innerArray){
                System.out.println(element);
            }
        }
        //User Input
        // int [][] age = new int[4][4];
        Scanner obj = new Scanner(System.in);
        // for(int i = 0;i <= age.length-1; i++){
        //     for(int j = 0;j <= age.length-1; j++ ){
        //     age[i][j] = obj.nextInt();
        //     }
        // }
        //  for(int i = 0;i <= age.length-1; i++){
        //     for(int j = 0;j <= age.length-1; j++ ){
        //     System.out.print(age[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // String [][] name = { {"Areeba","Haris"},
        // {"Hasnain","Hania","Aamir"},
        // {"Sana"}
        // };
        // for(int i = 0;i <= name.length-1; i++){
        //     for(int j = 0;j <= name[i].length-1; j++){
        //     System.out.print(name[i][j] + " ");
        // }
        // System.out.println();
        // }
        System.out.print("Enter No of Rows:");
        int rows = obj.nextInt();
        System.out.print("Enter No of Coloumns:");
        int col = obj.nextInt();
        obj.nextLine();//to consume empty lines
        String [][] subjects = new String[rows][col];
        for(int i = 0; i < subjects.length; i++){
            for(int j = 0 ;j < subjects[i].length;j++){
                System.out.print("Enter value:");
                subjects[i][j] = obj.nextLine();
            }
        }
        for(int i = 0;i < subjects.length;i++){
            for(int j = 0;j < subjects[i].length;j++){
                System.out.print(subjects[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
