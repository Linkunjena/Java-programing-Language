class Pair
{
    String word;
    int step;
    Pair( String word, int step)
    {
         this.word=word;
         this.step=step;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        Queue<Pair>q= new LinkedList<>();
        q.add( new Pair(beginWord,1) );

        // put all the given words inside the hashset so that searching a word
        // is efficinet for us
        HashSet<String>hs = new HashSet<>(wordList);
        hs.remove( beginWord);

        while( q.size()>0 )
        {
            Pair p = q.remove();

            String curr= p.word;
            int steps = p.step;

            if( curr.equals( endWord)==true)
            {
                return steps;
            }

            for( int i=0;i<curr.length();i++)
            {
                char arr[]= curr.toCharArray();

                // we will try all characters from a to z for the ith position
                for( char ch='a';ch<='z';ch++)
                {
                    // this means for the ith position 
                    // we are trying all characters from a to z
                    arr[i]=ch; 

                    String temp = new String(arr);

                    if( hs.contains( temp)== true)
                    {
                         q.add(  new Pair( temp, steps+1) );
                         hs.remove(temp);
                    }
                }
            }


        }

        // if we could never make the end word 
        return 0;
    }
}