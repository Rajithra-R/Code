class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int cursum = 0;
        int minwindow = Integer.MAX_VALUE;   // infinity
        int low = 0;
        int high = 0;
        while(high < nums.length)
        {
            cursum += nums[high];
            high++;
            while(cursum >= target)
            {
                int windowsize = high - low;
                minwindow = Math.min(minwindow,windowsize);
                cursum -= nums[low];
                low++;
            }
        }
        return minwindow == Integer.MAX_VALUE ? 0 : minwindow;
    }
}