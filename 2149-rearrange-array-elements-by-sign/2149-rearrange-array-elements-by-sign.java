class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        int res[] = new int[nums.length];
        for(int i : nums)
        {
            if(i > 0) // pos
            {
                q1.offer(i);
            }
            if(i < 0) // neg
            {
                q2.offer(i);
            }
        }
        int i = 0;
        while(!q1.isEmpty() || !q2.isEmpty())
        {
            if(!q1.isEmpty()) 
            {
                res[i] = q1.poll();
                i++;
            }
            if(!q2.isEmpty())
            {
                res[i] = q2.poll();
                i++;
            }
           
        }
        return res;
    }
}