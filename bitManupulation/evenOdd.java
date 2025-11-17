package bitManupulation;

public class evenOdd {
    
    public static void checkOddeven(int n){
        int bitMask =1;
        if((n & bitMask)== 0){
System.out.println("This number is even.");
        }else{
            System.out.println("This number is odd");
        }
    }
    public static void main(String[] args){
        checkOddeven(5);
    }
}
