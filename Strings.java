import java.util.Scanner;
public class Strings {
  public static void main(String[] args){
    System.out.println("****************STRINGS******************");
    //initializing string as class
    // String obj = new String("Hello world");
    // System.out.println(obj);
    //initializing as Datatype
    // String fullName = "Areeba Aamir";
    // System.out.println(fullName);
    //Format Specifiers
    Scanner obj = new Scanner(System.in);
    // String name = obj.nextLine();
    // int age = obj.nextInt();
    // float height = obj.nextFloat();
    // char group = obj.next().charAt(0);
    // System.out.printf("My name is %s\n",name);
    // System.out.printf("My age is %d\n",age);
    // System.out.printf("My height is %f\n",height);
    // System.out.printf("My group is %c",group);
    String message = obj.nextLine();
    System.out.println(message);
    //************Built-in Methods in Strings***************
    int strLen = message.length(); //Calculate length of the string
    String lowerCase = message.toLowerCase(); //Convert whole string into lower case
    String upperCase = message.toUpperCase(); //Convert whole string into upper case
    String untrim = "       Hello Areeba      ";
    String trimString = untrim.trim();//trim extra spaces from string
    char characaterFromString = message.charAt(0); //find character at desired index number
    int indexOfch = message.indexOf('b');//Find the index of given character
    int indexofstr = message.indexOf("am");//find index of given string
    int  indexFromch = message.indexOf('a',2); //find index no of given character but searching starts from given index
    int indexFromstr = message.indexOf("ee",1);//find index no of given string but searching starts from given index
    String subStringMessage = message.substring(3,8);//Bring string from given starting and ending index
    String replaceChar = message.replace('b','B');//Replace old character with new one
    String replaceString = message.replace("Areeba Aamir","Hi Cutie"); //Replace old string from New string
    boolean startString = message.startsWith("Ar");//Check if string starts from given characters ,returns true if correct and false if wrong
    boolean endString = message.endsWith("ir");//Check if string ends with given characters ,returns true if correct and false if wrong
    boolean checkString = message.equals("Areeba Aamir");//Compare both strings(Case sensitive) ,return true if correct and false if wrong
    boolean ignoreCaseSensitivity = message.equalsIgnoreCase("areeba AamIr"); //Compare both strings(Ignore Case sensitivity) ,return true if correct and false if wrong
    System.out.println(strLen);
    System.out.println(lowerCase);
    System.out.println(upperCase);
    System.out.println(untrim);
    System.out.println(trimString);
    System.out.println(characaterFromString);
    System.out.println(indexOfch);
    System.out.println(indexofstr);
    System.out.println(indexFromch);
    System.out.println(indexFromstr);
    System.out.println(subStringMessage);
    System.out.println(replaceChar);
    System.out.println(replaceString);
    System.out.println(startString);
    System.out.println(endString);
    System.out.println(checkString);
    System.out.println(ignoreCaseSensitivity);
    }  
}
