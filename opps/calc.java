package opps;

public class calc {
    public static void main(String args[]){

        Calculate cal = new Calculate();
        System.out.println(cal.sum(5, 10));
        System.out.println(cal.sum((float)4.5, (float)8.0));
        System.out.println(cal.sum(4, 5, 6));

    }
  static  class Calculate{
        int sum(int a, int b){
            return a+b;
        }


        float sum(float a, float b){
            return a+b;
        }


        int sum(int a, int b, int c){
            return a+b+c;
        }
    }
}
