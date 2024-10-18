class Solution {
    public int[] applyOperations(int[] nums) {
        int c = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(i < nums.length-1 && nums[i] == nums[i+1])
            {
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
               // c++;
            }
            else
            {
                continue;
            }
        }
        int a[] = moveZeroes(nums);
        return a;
    }
    public int[] moveZeroes(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i] != 0)
            {
                nums[count] = nums[i];
                count++;
            } 
        }
        for(int i=count;i<n;i++)
        {
            nums[i] = 0;
        }
        return nums;
}
}