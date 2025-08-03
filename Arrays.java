public class Arrays {
    public static void main(String[] args){
        //******************ARRAYS******************
        //declaration
        //datatype [] nameofArray;
        //declaration + Memory Allocation
        //datatype [] nameofArray = new dataType[size of array or length];
        //declaratin + initialization
        //dataType [] nameofArray = {1st element , 2nd element ,....};
        //Indexing of array sarts from 0 and ends at size-1
        //1st Method of decalring array
        // int [] marks ;
        // marks = new int[5];
        // marks[0] = 44;
        // marks[1] = 84;
        // marks[2] = 24;
        // marks[3] = 88;
        // marks[4] = 64;
        // System.out.println(marks[3]);
        //2nd Method of Declaring Array
        // int [] age = {16,25,13,9,33}; //array will allocate memory automatically
        // System.out.println(age[2]);
        //Length of an array
        // int size = age.length;
        // System.out.println(size);
        // System.out.println(age.length);
        float [] height = {5.4f,6.1f,3.4f,5.3f,4.9f,4.8f};
        System.out.println(height[4]);
        System.out.println(height.length);
        //Transversing element of an array (vissiting every element of array)
        float [] marks = {89.0f,56.9f,39.8f,67.4f,78.9f};
        for(int i = 0 ; i < marks.length;i++){
            System.out.println(marks[i]);
        }
        //reverse 
        for(int i = marks.length-1 ; i >= 0; i--){
            System.out.println(marks[i]);
        }
    }
}
