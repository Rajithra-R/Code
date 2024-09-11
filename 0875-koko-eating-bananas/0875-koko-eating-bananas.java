class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        int ans = Integer.MAX_VALUE;
        for(int i : piles)
        {
            max = Math.max(max,i);
        }
        int low = 1;
        int high = max;
        while(low <= high)
        {
            int mid = (low+high)/2;
            int totaltime = Find(piles,mid);
            if(totaltime <= h)
            {
                ans = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return ans;
    }
    public  int Find(int piles[],int hour)
    {
        int totaltime = 0;
        for(int i=0;i<piles.length;i++)
        {
            totaltime += Math.ceil((double)piles[i]/(double)hour);
        }
        return totaltime;
    }
}

// ensure use ceil and double