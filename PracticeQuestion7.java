import java.util.Scanner;
public class PracticeQuestion7 {
    public static void main(String[] args ){
        Scanner obj = new Scanner(System.in);
        System.out.println("******************CURRENCY CONVERTER**************");
        System.out.print("Enter your ammount in PKR:");
        float amount = obj.nextFloat();
        System.out.print("Enter Currency Code (USD,EURO,GDP,SAR,AED,CAD):");
        String code = obj.next();
        switch(code){
            case "USD": System.out.printf("%f PKR = %f USD",amount,amount/278); break;
            case "EURO": System.out.printf("%f PKR = %f EURO",amount,amount/304); break;
            case "GDP": System.out.printf("%f PKR = %f GDP",amount,amount/356); break;
            case "SAR": System.out.printf("%f PKR = %f SAR",amount,amount/74); break;
            case "AED": System.out.printf("%f PKR = %f AED",amount,amount/76); break;
            case "CAD": System.out.printf("%f PKR = %f CAD",amount,amount/205); break;
            default : System.out.println("Invalid Choice!!!!");
        }
    }
}
