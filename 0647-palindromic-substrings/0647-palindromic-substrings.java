//O(N ^ 2)

class Solution {
    public int countSubstrings(String s) {
        if(s.length() == 0) return 0;
        int n = s.length();
        int res = 0;
        char c[] =  s.toCharArray();
        for(int i=0;i<n;i++)
        {
            //check for both odd length - (i,i) & even length - (i,i+1)
            res += isPalindrome(i,i,c);
            res += isPalindrome(i,i+1,c);
            
        }
        return res;
    }
    public int isPalindrome(int start,int end,char c[])
    {
        int count =0;
        while(start >= 0 && end < c.length && c[start] == c[end])
        {
            count++;
            start--; // move left
            end++;    // move right
        } 
        return count;
    }
}