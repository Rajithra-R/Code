// check for the odd digit in the str...maintain a max value to find the max length od the str...and a flag to indicate there is an odd value
// nums[i] - '0' means converting the corresponding character to integer and then check if it is odd or even
// if no odd exits then flag remains 0 and hence return ""  (empty str)
// update the max for every odd num's index and return the entire substring from 0 to that index...

class Solution {
    public String largestOddNumber(String num) {
        int max = 0;
        int flag = 0;
        for(int i=0;i<num.length();i++)
        {
            if((num.charAt(i)-'0') % 2 == 1) // odd
            {
                flag = 1;
                max = i;
            }
        }
        if(flag == 0) // no odd num exists
        {
            return "";
        }
        return num.substring(0,max+1);  // since the substring should have the digits from the beggining and last index is exclusive
        
    }
}

// If s.charAt(i) is '5', then s.charAt(i) - '0'
// If s.charAt(i) is 'c', then s.charAt(i) - 'a'