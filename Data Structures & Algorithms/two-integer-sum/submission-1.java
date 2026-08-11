class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Outer loop picks the first number
        for (int i = 0; i < nums.length; i++) {
            // Inner loop picks the second number (always ahead of i)
            for (int j = i + 1; j < nums.length; j++) {
                // If they add up to the target, return their indices
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        // Return an empty array if no pair is found
        return new int[] {};
    }
}
