class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1)
        {
            return s;
        }
        String str_new = "";
        for(int i=0;i<s.length();i++)
        {
        //for considering odd length substring
        int low = i;  // both from same point
        int high = i;
        while(low >= 0 && high < s.length() &&s.charAt(low) == s.charAt(high)) 
            // if both char equal then expand towrds left and right
        {
            low--;
            high++;
            
        }
        String str1 = s.substring(low+1,high);
        if(str1.length() > str_new.length())
        {
            str_new = str1;
        }
            
         //for considering even length substring
        low = i-1;  // one prev and one cur to make count as 2....
        high = i;
        while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) 
            // if both char equal then expand towrds left and right
        {
            low--;
            high++;
            if(low == -1 || high == s.length())
            {
                break;
            }
        }
        str1 = s.substring(low+1,high);
        if(str1.length() > str_new.length())
        {
            str_new = str1;
        }
        
        }
        return str_new;
         
    }
}