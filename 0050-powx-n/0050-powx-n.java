class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        } 
        else if (n < 0) {
            if (n == Integer.MIN_VALUE) {  // Special case to handle overflow
                n += 1;  // Increase n by 1 to avoid overflow
                x = 1 / x;
                return (1 / x) * myPow(x, -n);
            } else {
                x = 1 / x;
                n = -n;
            }
        }

        if (n % 2 == 0) {  // if n is even
            return myPow(x * x, n / 2);
        } else {  // if n is odd
            return x * myPow(x, n - 1);
        }
    }
}