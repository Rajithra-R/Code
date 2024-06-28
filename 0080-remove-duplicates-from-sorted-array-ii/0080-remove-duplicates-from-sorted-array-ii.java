class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i =0;i<nums.length;i++)
        {
            if(i==0 || i==1)
            {
             nums[count] = nums[i];
                    count++;   
            }
            if(i >= 2 && nums[count-2] != nums[i]) //
                {
                    nums[count] = nums[i];
                    count++;
                }
            
            
        }
        return count;
    }
}