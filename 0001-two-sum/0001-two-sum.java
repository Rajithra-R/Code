class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();    
        for(int i = 0; i < nums.length; i++) {
            int req = target - nums[i];
            if(h.containsKey(req))
            {
                int[] arr = {h.get(req),i};
                return arr;
            }
            h.put(nums[i],i);
            
        }
        return null;
    }
}

