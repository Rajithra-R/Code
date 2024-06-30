class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        //initaillay assumed for 2 candidates as results can have only 2 candidates at the most
        int cand1 = -1;
        int cand2 = -1;
        int c1 = 0;
        int c2 = 0;
        for(int i=0;i<nums.length;i++)
        {
        if(nums[i] == cand1)   // if same number increment the count
        {
            c1++;
        }
        else if(nums[i] == cand2)
        {
            c2++;
        }
        else if(c1 == 0)  // for the first time
        {
            cand1 = nums[i];
            c1 = 1;
        }
        else if(c2 == 0)  // for the next new number
        {
            cand2 = nums[i];
            c2 = 1;
        }
        else
        {
            c1--;
            c2--;    //inoredr to accomodate the 3rd candidate
        }
        }
        // again count the 2 candidates in complete array and check if they appear > n/3 times
        c1 = 0;
        c2 = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == cand1)
            {
                c1++;
            }
            else if(nums[i] == cand2)
            {
                c2++;
            }  
        }
        int n = nums.length;
        if(c1 > n/3)
        {
            res.add(cand1);
        }
        if(c2 > n/3)
        {
            res.add(cand2);
        }
        return res;
    }
}