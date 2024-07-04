class Solution {
    public boolean search(int[] nums, int target) {
        
        // implement same as Search in Rotated Sorted Array I
        
        int l = 0;
        int h = nums.length - 1;
        
        // Check if target is equal to the last element separately
        if (nums[h] == target) {
            return true;
        }
        
        while (l <= h) {
            int mid = (l + h) / 2;
            if (nums[mid] == target) {
                return true;
            } 
            // if repeatations found in the array in mid , low , high then shrink the array by moving low and high
            // continue doing that until the repeatations are removed
            if(nums[l] == nums[mid] && nums[mid] == nums[h])
            {
                l++;
                h--;
                continue;
            }
            //it is guarenteed that one half is definitely sorted
            // left half is sorted  
            else if (nums[l] <= nums[mid]) {
                // eg : [1,2,3,4,5] => l < mid =>left part is sorted
                if (nums[l] <= target && target <= nums[mid]) {  // target is at the left move right pointer
                    h = mid - 1; 
                } else {
                    l = mid + 1;
                }
            } 
            //right half is sorted
            else {
                //eg : [5,6,7,2,3,4,5]  => mid = 2 < 5 hence right part is sorted
                if (nums[mid] <= target && target <= nums[h]  ) {    //target is at the right move left pointer
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }
        }
        return false;
    }
}