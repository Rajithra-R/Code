
// one child can have cookie >= greed factor
// initially sort both the arrays..
// maintain 2 pointers for each array
// and compare if the cookiee can be assigned to the child(i.e greed array) or not
// if yes then move both the pointers(l++ and r++)
// if not then moove the s's pointer.(l++)
// finally return the index of the size array when the left ponter reaches the end of the array

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        int left = 0;  // for s
        int right = 0;  // for g
        Arrays.sort(g);
        Arrays.sort(s);
        while(left < m && right < n ) // traverse the size array till last
        {
            if(g[right] <= s[left]) // that means that size can satify the greed factor
            {
                right++;
            }
            left++;
        }
        return right;
    }
}