//This is a parent Class of diferent package
package JavaPackage; 

public class Animal {
    private int no1;
        public int no2;
        int no3;
        protected int no4;
    //setters
    public void setN1(int no1){
        this.no1 = no1;
    }
    public void setN2(int no2){
        this.no2 = no2;
    }
    //Getters
     public int getN1(){
       return this.no1;
    }
    public int getN2(){
       return this.no2;
    }
    public void eat(){
        System.out.println("I can eat");
    }
    public void display(int no2 ,int no4){
        this.no2 = no2;
        this.no4 = no4;
        System.out.println(this.no2);
        System.out.println(this.no4);
    }
    public static void main(String[] args) {
        
    }
}
