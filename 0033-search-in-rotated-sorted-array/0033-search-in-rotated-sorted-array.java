class Solution {
    public int search(int[] nums, int target) {
         int l = 0;
        int h = nums.length - 1;
        
        // Check if target is equal to the last element separately
        if (nums[h] == target) {
            return h;
        }
        
        while (l <= h) {
            int mid = (l + h) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                if ( target > nums[h] && nums[h] >=nums[mid]) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if ( target < nums[l] && nums[l] <= nums[mid]  ) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }
        }
        return -1;
    }
}