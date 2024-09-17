
//O(n * m)

class Solution {
    public String countAndSay(int n) {
        String cur = "1";
        for(int j=1;j<n;j++)
        {
            String res = "";
            int i = 0;
            while(i< cur.length())
            {
                int count = 1;
                 while(i < cur.length()-1 && cur.charAt(i) == cur.charAt(i+1))  
                // need not check for last ele as last ele dont have i+1
                 {
                        count ++;
                        i++;
                 }
                res += Integer.toString(count) + cur.charAt(i);
                i++;
            }
            cur = res;
        }
        return cur;
    }
}