public class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize max and current sum with the first element
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Choose the current element or extend the existing subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            
            // Update the global maximum sum found so far
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}
