class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        //[1,1,0,1,1,1] ->count = 0
        // -> c=1 ->m=1;
        // -> c=2 ->m=2;
        //as sson as 0 encounters that means one set of consecutive ones is over therefore change count to 0
        // -> c=0 
        // -> c=1 // dont update the maxcount
        // -> c=2 
        // -> c=3 ; m = 3
        //return 3
        int count = 0;
        int max_count = 0;
        for(int num : nums)
        {
            if(num == 1)
            {
                count++;
            }
            else
            {
                count = 0;
            }
            max_count = Math.max(max_count,count);
        }
        return max_count;
    }
}