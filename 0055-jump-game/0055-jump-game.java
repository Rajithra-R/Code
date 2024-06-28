class Solution {
    public boolean canJump(int[] nums) {
        int last = nums.length - 1;
        for( int i= nums.length -2 ;i>=0;i--)
        {
            if(i+nums[i] >= last) //if u can reach the last pos
            {
                last = i; //change ur des to i;
            }
        }
        return last ==0; // true only if des has reached the 1st pos
    }
}