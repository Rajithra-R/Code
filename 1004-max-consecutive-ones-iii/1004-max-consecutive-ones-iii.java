class Solution {
    public int longestOnes(int[] nums, int k) {
        int zerocount = 0;
        int max_len = 0;
        int start = 0;
        int end = 0;
        for(end = 0;end < nums.length ;end++)
        {
    //check for zeros  ... if zero occur increment the zerocount else end will get incremented in the for loop 
            if(nums[end] == 0)  // only if zero increment the count
            {
                zerocount++;
            }
            while(zerocount > k)
            {
                if(nums[start] == 0)  // only if zero decrement count
                {
                    zerocount--;
                }
                start++;
            }
            max_len = Math.max(max_len,end-start+1); //end-start+1 - windowsize
        }
        return max_len;
    }
}