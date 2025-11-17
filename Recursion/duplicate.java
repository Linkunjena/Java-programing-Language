public class duplicate {
    public static void removeduplicate(String st, int idx, StringBuilder newStr, boolean[] map){


        if(idx == st.length()){

            System.out.print(newStr);
            return ;


        }

        char currCh = st.charAt(idx);
        if(map[currCh - 'a'] == true){
removeduplicate(st, idx+1, newStr, map);
        }else{
                map[currCh - 'a'] = true;
                removeduplicate(st, idx+1, newStr.append(currCh), map);
        }
    
    }
    public static void main(String[] args) {
        String str = "apnacollege";
        int idx = 0; 
        StringBuilder newStr = new StringBuilder("");
        boolean[] map = new boolean[26];

        removeduplicate(str, idx, newStr, map);
    }
}
