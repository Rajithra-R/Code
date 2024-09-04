// n = 3 => 1+1+1 ; 1+2 ; 2+1 =>3  // n=4 => 5
// n = 5 => 1+1+1+1+1 ; 1+1+1+2 ; 1+1+2+1 ; 1+2+1+1 ; 2+1+1+1 ; 2+2+1 ; 1+2+2 ; 2+1+2 => 8
// This is an anothere version of FIBONACCI SERIES
// Upto n=3  => no of steps is 3 itself then for n=4 -> 5; n=5 ->8; n=6 -> 13.......

class Solution {
    public int climbStairs(int n) { 
       int a = 0;
       int b = 1;
        int sum = 0;
       for(int i=0;i<n;i++)
       {
           sum = a+b;
           a = b;
           b = sum;
       }
        return sum;
    }
}