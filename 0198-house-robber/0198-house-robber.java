class Solution {
    public int rob(int[] nums) {
       int n =nums.length;
       int prev1 = nums[0];
       int prev2 = 0;
       int cur = 0;
       for(int i=1;i<n;i++)
       {
           int pick = nums[i];
           if(i-2 >= 0)
           {
               pick += prev2;
           }
           int notpick = 0 + prev1;
           cur = Math.max(pick,notpick);
           prev2 = prev1;
           prev1 = cur;
       }
        return prev1;
    }
}

