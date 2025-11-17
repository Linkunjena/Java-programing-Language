class Solution {
    public int[] frequencySort(int[] nums) 
    {
        HashMap<Integer,Integer>mp= new HashMap<>();

        int n = nums.length;

        for( int i=0;i<n;i++)
        {
             if( mp.containsKey(nums[i])==false)
             {
                mp.put( nums[i], 1);
             }
             else
             {
                // mp[nums[i]]++
                mp.put( nums[i], mp.get(nums[i])+1 );
             }
        }

        Integer arr[]= new Integer[n];
        for( int i=0;i<n;i++)
        {
             arr[i]= nums[i];
        }

        Arrays.sort( arr, new Comparator<Integer>() 
        {
            public int compare(Integer a, Integer b)
            {
                int freqA = mp.get(a);
                int freqB = mp.get(b);

                if( freqA==freqB)
                {
                    // if the freq is same then arrange in descending order
                    return b-a; // dec order
                }
                else
                {
                    // when freq are diff
                    // arrange in inc order of freq
                    return freqA- freqB;
                }
            }
        } );
      
        for( int i=0;i<n;i++)
        {
             nums[i]= arr[i];
        }
        return nums;

    }
}