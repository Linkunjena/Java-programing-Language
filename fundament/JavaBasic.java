import java.util.Scanner;

public class JavaBasic {
    public static void main(String[] args) {
  
       Scanner scn = new Scanner(System.in);
       System.out.println("Enter cost of pen");
       float pen = scn.nextFloat();
       System.out.println("Enter the cost of pencil");
       float pencil = scn.nextFloat();
       System.out.println("Enter the cost of eraser");
       float eraser  = scn.nextFloat();

       float ans = (pen + pencil + eraser) ;
       System.out.println("Total cost is: "+ ans);


       float total = ans + (0.18f + ans);

       System.out.println(" The final answer is: "+ total);


       byte b = 4;
       char c = 'a';
       short s = 523;
       int i = 1000;
       float f = 3.14f;
       double d = 99.9954;

       double n = (f * b) + (i % c ) - (d * s);
       System.out.println(n);


    }
}