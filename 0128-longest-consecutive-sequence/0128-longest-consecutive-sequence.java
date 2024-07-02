class Solution {
    public int longestConsecutive(int[] nums) {
        int max_len = 0;
        HashMap<Integer,Boolean> h = new HashMap<>();
        // initialize the hashmap's boolean field to false
        for(int i : nums)
        {
            h.put(i,Boolean.FALSE);
        }
        for(int i : nums)
        {
            int cur_len = 1;  //even one number has length 1
            //check for forward elements
            
            int next = i + 1;
            while(h.containsKey(next) && h.get(next) == false)
            {
                cur_len++;
                h.put(next,Boolean.TRUE);
                next++;// sfurther check for next elements
            }
            //check for previous elements
            
            int prev = i - 1;
            while(h.containsKey(prev) && h.get(prev) == false)
            {
                cur_len++;
                h.put(prev,Boolean.TRUE);
                prev--;
            }
            
            max_len = Math.max(cur_len,max_len);
        }
        return max_len;
    }
}