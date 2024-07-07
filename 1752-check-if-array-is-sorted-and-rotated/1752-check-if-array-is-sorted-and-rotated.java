class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++) 
        {
            if(nums[i] > nums[(i+1) % n])
            {
                count++; //if the array is rotated only once the count will be incremented [3,4,5,1,2]...{5,1}
            }
            if(count > 1) return false;
        }
        return true;
    }
}