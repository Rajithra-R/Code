class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int left = 0;
        int start = 0;
        int rem =0;
        for(int i=0;i<gas.length;i++)
        {
            left += gas[i] - cost[i];
        }
        if(left < 0)
        {
            return -1;
        }
        for(int i=0;i<gas.length;i++)
        {
            int cur_gas = gas[i] + rem;
            int cur_cost = cost[i];
            rem = cur_gas - cur_cost;
            if(rem < 0)
            {
                rem = 0;
                start = i+1;
            }
        }
        return start;
    }
}