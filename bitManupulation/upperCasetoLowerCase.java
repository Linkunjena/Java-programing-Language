package bitManupulation;

public class upperCasetoLowerCase {
    public static void main(String[] args) {
        char  ch = 'a';

        char ans =(char) (ch & ~32);
        System.out.println(ans);
    }
    
}
