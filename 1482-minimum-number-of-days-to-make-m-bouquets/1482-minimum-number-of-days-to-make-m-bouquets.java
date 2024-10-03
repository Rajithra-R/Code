class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n < m*k) return -1;
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n;i++)
        {
            min = Math.min(min,bloomDay[i]);
            max = Math.max(max,bloomDay[i]); 
        }
        
        int low = -1;
        int high = max;
        
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(possible(bloomDay,mid,m,k))
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return possible(bloomDay, low, m, k) ? low : -1;
    }
    public boolean possible(int[] bloomDay,int val,int m, int k)
    {
        int c = 0;
        int no_of_day = 0;
        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i] <= val)
            {
                c++;
            }
            else
            {
                 no_of_day += (c/k);
                c = 0;
            }
        }
        no_of_day += (c/k); // if only blooms and no other non blooms after the bloom,to include that
        return no_of_day >= m;
        
    }
}