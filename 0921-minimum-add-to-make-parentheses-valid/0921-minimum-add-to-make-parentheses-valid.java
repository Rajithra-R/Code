class Solution {
    public int minAddToMakeValid(String s) {
        int a = 0;
        int b = 0;
        for(int i=0;i<s.length();i++)
        {
            b += s.charAt(i) == '(' ? 1 : -1;
            if(b == -1)
            {
                a += 1;
                b += 1;
            }
        }
        return a + b;
    }
}