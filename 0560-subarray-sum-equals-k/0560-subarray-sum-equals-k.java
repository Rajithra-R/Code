class Solution {
    public int subarraySum(int[] nums, int k) {
        // use a hashmap
        // key - value = sum - freq
        // check if sum - k is present in the map 
        // if yes then add its freq to the count 
        // else put ith into the map and finally return the count
        // initially add a sum of 0 and freq of 1 to the map
        
        HashMap<Integer,Integer> h = new HashMap<>();
        h.put(0,1);
        int count = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
            if(h.containsKey(sum - k))
            {
                count += h.get(sum - k);
            }
            h.put(sum,h.getOrDefault(sum,0)+1);
        }
        return count;
    }
}