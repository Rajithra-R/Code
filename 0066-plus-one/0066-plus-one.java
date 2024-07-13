class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1;i>=0;i--)  // traverse using a reverse loop
        {
            // if digits are less than 9 then simply increment the last digit
            // if digit == 9  then set the last digit as 9 and the 2nd digit will be automatically incremented as it fall under the if condition
            
            if(digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        // if there is only one dig in the array and that is 9 then create anew array of size n+1
        // this can fit for array with any number of 9's 
        // because {9} => {1,0}
        // {9,9} => {1,0,0}
        int[] newarr = new int[n+1];
        newarr[0] = 1; // as it contains all dig as 0 by default
        return newarr;
    }
}