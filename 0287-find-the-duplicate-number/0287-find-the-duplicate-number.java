class Solution {
    public int findDuplicate(int[] nums) {
       /* int slow = nums[nums[0]];
        int fast = nums[nums[nums[0]]];
        while(slow != fast)
        {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        slow = nums[0];
        while(slow != fast)
        {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;*/
        HashMap<Integer,Integer> h = new HashMap<>();
       for(int i : nums)
        {
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(int i : nums)
        {
            if(h.get(i) > 1)
            {
                return i;
            }
        }
        return -1;
    }
}

