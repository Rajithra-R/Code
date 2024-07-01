class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n =  nums.length;
        if(n == 1)
        {
            return nums[0];
        }
        int sum = 0;
        for(int i=0;i<n;i++)  // get the sum of the array
        {
            sum += nums[i];
        }
        int cur_max = nums[0];
        int cur_min = nums[0];
        int max = nums[0];
        int min = nums[0];
        for(int i=1;i<n;i++)
        {
            cur_max = Math.max(cur_max + nums[i],nums[i]);
            max = Math.max(max,cur_max);
            cur_min = Math.min(cur_min + nums[i],nums[i]);
            min = Math.min(min,cur_min); 
        }
        if(min == sum)   // all are negative values
        {
            return max;
        }
        
        return Math.max(max,sum-min);
    }
}