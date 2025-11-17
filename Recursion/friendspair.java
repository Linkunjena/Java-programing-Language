public class friendspair {
    public static int pair(int n){
if(n==1 || n==2){
    return n;
}

        //kaam
     int    fnm1 = pair(n-1);
      int   fnm2 = pair(n-2);
     int    pairways = (n-1)*fnm2;
        int totalWays = fnm1 + pairways;
        return totalWays;
    }
    public static void main(String[] arg){
System.out.println(pair(4));
    }
    
}
