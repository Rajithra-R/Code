class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int cur = nums[i];
            if(h.containsKey(cur) && i - h.get(cur) <= k) // as per the gn qn
            {
                return true;
            }
            h.put(cur,i);
        }
        return false;
    }
}