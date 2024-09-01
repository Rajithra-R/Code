class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int res = -1;
        for(int i : nums)
        {
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(h.get(nums[i]) == 1)
               {
                   res = nums[i];
               }
        }
               return res;
    }
}