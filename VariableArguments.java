public class VariableArguments {
    //only single VarArgs is allowed in single method 
    static int sum(int ...arr){ //arr is an array (by default)
        int sum = 0;
        for(int i = 0;i <= arr.length-1;i++){
            sum += arr[i];
        }
        //or
        // for(int element : arr){
        //     sum += element;
        // }
        return sum;
    }
    static void name(String ...arr){
        for(String element : arr){
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        //************************VARIABLE ARGUMENTS OR VarArgs***************
        int result = sum(1,2,3,4,5,8,7,6,9);
        System.out.println(result);   
        name("Areeba","Haris","Hassnain","Hania");  
    }
}
