class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int m =0;
        boolean present[] = new boolean[n+1];
        for(int i : nums)
        {
            present[i] = true;
        }
        for(int i = 0;i<=n;i++)
        {
            if(!present[i])
            {
                return i;
            }
        }
        return -1;
    }
}