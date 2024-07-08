class Solution {
    public int divide(int dividend, int divisor) {
        // initially handle the overflow case
        if(dividend == 1<<31 && divisor == -1)  
            return Integer.MAX_VALUE;
        int sign = (dividend >= 0) == (divisor >= 0) ? 1 : -1;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int res = 0;
        while(dividend - divisor >= 0)
        {
            int count = 0;
            while(dividend - (divisor << 1 << count) >= 0)
            {
                count++;
            }
            res += 1<< count;
            dividend -= divisor << count;
        }
        return sign * res;
        
    }
}