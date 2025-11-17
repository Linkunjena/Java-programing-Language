

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class lonelyEle {
    public static List<Integer> findLone(int[] nums){
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for(int i=0; i<n; i++){

            if((i==0|| nums[i] - nums[i-1] > 1) && (i==n-1 || nums[i+1] - nums[i] >1)){
                ans.add(nums[i]);
            } 
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {10, 6, 5, 8};
        // lonelyEle obj = new lonelyEle();
        System.out.println(findLone(arr));
    }
}
