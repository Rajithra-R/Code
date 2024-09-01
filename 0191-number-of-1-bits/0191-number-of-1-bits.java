// if u need to count the set bits or 1 bits  => n & (n-1) and stop when n reaches 0
// eg : n = 11 => 1 0 1 1 -> perform and operation with n-1 until n becomes 0 
// 11 & 10 => 1011 & 1010 =>1010 -> count =1;
// 10 & 9  => 1010 & 1001 =>1000 -> count =2;
// 8 & 7   => 1000 & 0111 =>0000 -> count = 3;
// as n = 0 stop the loop

class Solution {
    public int hammingWeight(int n) {
      /*  int count = 0;
        while(n != 0)
        {
            n &= (n-1);
            count++;
        }
        return count;  */
        int x=0;
        StringBuilder b = new StringBuilder();
        while( n > 0)
        {
             
            x = n%2;
            b.append(x);
            n = n/2;
        }
        int c = 0;
        //int  y = Integer.parseInt(b.reverse().toString());
        String s = b.reverse().toString();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '1')
            {
                c++;
            }
        }
        return c;
    }
}