class Solution {
    public int repeatedStringMatch(String a, String b) {
        int n  = b.length() / a.length();
        String s = a;  // substring that hold the initial 1st string
        int count = 1; // include the 1st string initially  
        for(int i =0;i<n+2;i++)
        {
            if(s.contains(b))   
      // at some cond it will definitely fall in this base case as we compare using s a new var
            {
                return count;
            }
            else
            {
                s = s+a; // add 1st string second time to a
                count++;  // further addition is done  in s and the counter is incremented
            }
        }
        return -1;
    }
}