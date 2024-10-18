class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        int n = nums.length;
        //initially nerver mind the zeros
        // if a non zero ele comes then put it in count and increment count
        //after all non zero ele is traversed 
        //put zero for all the remaining elements
        for(int i=0;i<n;i++)
        {
            if(nums[i] != 0)
            {
                nums[count] = nums[i];
                count++;
            } 
        }
      /*  while(count < n) // all the remaining elements
        {
            nums[count] = 0;
            count++;
        } */
        for(int i=count;i<n;i++)
        {
            nums[i] = 0;
        }
    }
}