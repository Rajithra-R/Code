public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int rev = 0;
        for(int i=0;i<32;i++)
        {
            rev <<= 1; // reserve a space
            rev |= (n & 1); // (n&1 - gives the last number).... append the last number to rev using  OR operator
            n >>= 1; // remove the last number;
        }
        return rev;
    }
}