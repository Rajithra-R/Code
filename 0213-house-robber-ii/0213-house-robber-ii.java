class Solution {
    public int rob1(int[] nums)
    {
        int prev1 = nums[0];
        int prev2 = 0;
        for(int i=1;i<nums.length;i++)
        {
            int pick = nums[i];
            if(i-2 >= 0)
            {
                pick += prev2;
            }
            int notpick = 0 + prev1;
            int cur = Math.max(pick,notpick);
            prev2 = prev1;
            prev1 = cur;
        }
        return prev1;
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] temp1 = new int[n];  // array to store values except 1st house
        int[] temp2 = new int[n];  // array to store values except last house
        if(n == 1)
        {
            return nums[0];
        }
        for(int i=0;i<n;i++)
        {
            if(i > 0) //  except 1st house
            {
                temp1[i] = nums[i];
            }
            if(i < n-1) // except last house
            {
                 temp2[i] = nums[i];
            }
        }
        return Math.max(rob1(temp1),rob1(temp2));
        
    }
}