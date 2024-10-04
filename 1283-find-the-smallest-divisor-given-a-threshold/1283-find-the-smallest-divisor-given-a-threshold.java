class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int c = 0;
        int mid = 0;
        int max = Integer.MIN_VALUE;
        int ans = -1;
        for(int k=0;k<nums.length;k++)
        {
             max = Math.max(max,nums[k]);
        }
        int low = 1;
        int high = max;
        while(low <= high)
        {
            mid = (low+high)/2;
            if(sum_of_div(nums,mid) <= threshold)  // if u get an answer then look for a little small value if possible
            {
                ans = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return ans;
    }
    public int sum_of_div(int nums[],int mid)
    {
        int sum = 0;
        for(int i =0;i<nums.length;i++)
        {
            sum += Math.ceil((double)nums[i] /(double) mid);
        }
        return sum;
    }
}