class Solution {
    public int removeDuplicates(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++)
        {
            if(i<nums.length-1 && nums[i] == nums[i+1])
            {
                continue;
            }
            else
            {
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}

/*
the reason for that the loop can be ended before last ele but it is not done because if the last element o=is not a duplicate then it should be printed , so loop is checking till the last . 
dont check the last only when there is a duplicate
*/