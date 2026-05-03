// Time Complexity: O(n)
// Space Complexity: O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : forgetting keyword for hashmap
// Your code here along with comments explaining your approach
/*
1. Create a hashmap to store the value and index of the elements in the array.
2. Iterate through the array and for each element, calculate the difference between the target and the current element.
3. Check if the difference is present in the hashmap. If it is, return the indices of the current element and the element corresponding to the difference in the hashmap.
4. If the difference is not present in the hashmap, add the current element and its index to the hashmap.
5. If no such pair is found after iterating through the entire array, return [-1, -1].
*/package Arrays;
import java.util.HashMap;
import java.util.Map;   
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mpp = new HashMap <> ();
        int n = nums.length;
        for(int i = 0;i<n;i++)
        {
            // int num = nums[i]
            int more = target - nums[i];
            if(mpp.containsKey(more))
            {
                return new int[] {mpp.get(more),i};

            }
            mpp.put(nums[i],i);
    
        }
        return new int[] {-1,-1};
    }

}