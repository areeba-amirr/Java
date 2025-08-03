public class ForEachLoop {
    public static void main(String[] args){
        //****************FOR EACH LOOP****************
        //Syntax
        //for(datatype nameofvariable : nameofArray){
        //}
        //variable must be of same type as array
        String [] names = {"Areeba","Haris","Hasnain","Hania"};
            for( String element : names){
                System.out.println(element);
            }
        int [] rollNo = {21,33,24,56,78,45,32,45,77,86,89};
        for( int variable : rollNo){
            System.out.println(variable);
        }   
    }
}
