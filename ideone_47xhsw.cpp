class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer>mp= new HashMap<>();
        //mp[element]= index  mp[nums[i] ]= i
        int n = nums.length;  
        int ans[]= new int[2];
        for( int i=0;i<n;i++)
        {
            int other = target - nums[i];
            if( mp.containsKey(other)==true)
            {
                ans[0]= mp.get(other);
                ans[1]= i;
                break;
            }
            else
            {
                mp.put( nums[i], i );
            }
        }
        return ans;
    }
}