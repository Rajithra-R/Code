class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        // keep traversing from the last in all while loops
        while(i >= 0 && nums[i] >= nums[i+1])  // stop when u find a num less than the next
        {
            i--;  // until that u decrement
        }
        if(i >= 0)
        {
            int j = nums.length-1;
            while(j >= 0  && nums[j] <= nums[i]) // stop when u find a num greater than i
            {
                j--;  //   until that u decrement
            }
            swap(nums,i,j);   // swap i,j
        }
        reverse(nums,i+1); // reverse the rest of the array from i (i+1)
    }
    public void swap( int nums[],int i,int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int nums[],int start)
    {
        int end = nums.length-1;
        while(start < end)
        {
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}