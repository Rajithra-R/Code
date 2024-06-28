class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int point = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(point == 0)
            {
                candidate = nums[i];
            }
            if(candidate == nums[i])
            {
                point++;
            }
            else
            {
                point--;
            }
        }
        return candidate;
    }
}