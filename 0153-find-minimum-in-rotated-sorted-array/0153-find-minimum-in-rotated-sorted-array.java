class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            // Check if mid element is less than the high element
            if (nums[mid] < nums[high]) {
                high = mid; // the minimum is in the left part
            } else {
                low = mid + 1; // the minimum is in the right part
            }
        }

        // After the loop, low should be pointing to the minimum element
        return nums[low];
    }
}