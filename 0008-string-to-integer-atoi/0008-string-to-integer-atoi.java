class Solution {
    public int myAtoi(String s) {
        int i =0;
        int sign = 1;
        int total = 0;
        int n = s.length();
        int d;
        // avoid the leading spaces 
        // if spaces come move i
       s = s.strip();
       if(s.isEmpty())
       {
           return 0;
       }
       sign = s.charAt(0) == '-' ? -1 : 1;
       if(s.charAt(0) == '+' || s.charAt(0) == '-')
       {
           s= s.substring(1); 
           //returns a string that removes the 1st character and s now will have characters from index 1 .
       }
        long num = 0;
        for(char c : s.toCharArray())
        {
            if(!Character.isDigit(c)) // if not a digit
                break;
            num = num * 10 + (c - '0');
            if(sign * num <= Integer.MIN_VALUE)
            {
                return Integer.MIN_VALUE;
            }
            if(sign * num >= Integer.MAX_VALUE)
            {
                return Integer.MAX_VALUE;
            }   
        }
        return sign * (int) num;
    }
}