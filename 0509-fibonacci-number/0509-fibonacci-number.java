class Solution {
    public int fib(int n) {
        if(n <= 0) return 0;
        if(n ==1)  return 1;
        else return fib(n-1)+fib(n-2); 
        
    }
}

/*
       int a = 0, b = 1, sum;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
*/