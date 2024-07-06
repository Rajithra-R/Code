
// get each number in loop anyway  the first number is 0 that has no ones hence always zero so give the 1st number of the answer array as 0
// in the for loop convert each number to binary string using the default fn (Integer.toBinaryString(i))
// then send that string into another fn to and check if that string has 1 and count the number of ones

class Solution {
    public int[] countBits(int n) {
     int ans[] = new int[n+1]; 
     ans[0] = 0;
     for(int i=1;i<=n;i++)
     {
         String bin = Integer.toBinaryString(i);
         int ones = CountOnes(bin);
         ans[i] = ones;
     }
     return ans;
    }
    public int CountOnes(String bin)
    {
        int count = 0;
        for(int i=0;i<bin.length();i++)
        {
            if(bin.charAt(i) == '1')
            {
                count++;
            }
        }
        return count;
    }
}