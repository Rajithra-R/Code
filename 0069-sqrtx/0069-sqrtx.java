// Approach is Binary Search

class Solution {
    public int mySqrt(int x) {
        long low = 0;
        long high = x;
        long ans = 0;
        while(low <= high)
        {
            long mid = (low+high) / 2;
            if(mid * mid <= x)
            {
                ans = mid; // if equal then that will be ur answer
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return (int)ans;
    }
}