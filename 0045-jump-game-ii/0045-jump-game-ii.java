class Solution {
    public int jump(int[] nums) {
        int total = 0;
        int des = nums.length-1;
        int cov =0,last =0;
        if(nums.length == 1)
            return 0;
        for(int i=0;i<nums.length;i++)
        {
            cov = Math.max(cov,i+nums[i]);  //till which point to move
            if(i == last)    //if i has reached the end of the current window
            {
                last = cov;   // start moving to next window by fixing the target
                total++;
            
            if(cov >= des)
            {
                return total;
            }
            }
            
        }
        return total++;
    }
}