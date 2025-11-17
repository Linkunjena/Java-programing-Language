public class duplicateremove {
    public static void removeduplicate(boolean[] map, String st, int idx, StringBuilder newst){
if(idx == st.length()){
    System.out.println(newst);
    return ;
}



        char currch = st.charAt(idx);

        if(map[currch - 'a'] == true){
removeduplicate(map, st, idx+1, newst);
        }else{
            map[currch- 'a'] = true;
            removeduplicate(map, st, idx+1, newst.append(currch));
        }

    }
    public static void main(String[] args) {
        boolean map[] = new boolean[26];
        String st = "apnacollege";
        int idx = 0;
         StringBuilder newst = new StringBuilder();

       removeduplicate(map, st, idx, newst);
    }
}
