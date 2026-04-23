import java.util.*;
// Time Complexity: O(nlogn) due to sorting
// Space Complexity: O(n) due to the additional array used for sorting
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach
/*1. Create a 2D array to store the elements of the input array along with their original indices.
2. Sort the 2D array based on the values of the elements.
3. Initialize two pointers, one at the beginning of the sorted array (left) and one at the end of the sorted array (right).
4. While the left pointer is less than the right pointer, calculate the sum of the elements at the left and right pointers.
5. If the sum is less than the target, move the left pointer to the right to increase the sum.
6. If the sum is equal to the target, return the original indices of the elements at the left and right pointers.
7. If the sum is greater than the target, move the right pointer to the left to decrease the sum.
8. If no such pair is found after the loop, return [-1, -1].*/
package Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] arr = new int[nums.length][2];
        for(int i=0;i<nums.length;i++)
        {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr,(a,b)->(a[0]-b[0]));
        int left = 0;
        int right = nums.length-1;
        while(left < right)
        {
            int sum = (arr[left][0]+arr[right][0]);
            if(sum < target)
            {
                left++;
            }
            else if( sum == target)
            {
                // int i = arr[left][1];
                return new int[] {Math.min(arr[left][1],arr[right][1]),Math.max(arr[left][1],arr[right][1])};
            }
            else if(sum>target)
            {
                right--;
            }
        }
        return new int[] {-1, -1};
    }
}