public class natural {
    public static int naturalSum(int n){
if(n==0){
    return 1;
}

        int sum = naturalSum(n-1);
      int   findSum = sum +n;
      return findSum;
    }
public static void main(String[] args) {

    System.out.println(naturalSum(5));
    


    
}
    
} 
