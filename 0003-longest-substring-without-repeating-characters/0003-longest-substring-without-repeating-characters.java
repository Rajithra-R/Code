class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h = new HashSet<>();
        int max = 0;
        int low = 0;
        int high = 0;
        while(high < s.length())
        {
            if(!h.contains(s.charAt(high))) // if the char not in the hash
            {
                h.add(s.charAt(high));   // add the char to the hash
                high++;                  // increment the pointer
                max = Math.max(max,high-low);   // max is maximum of max and the size of the substring
            }
            else  // already present...pop out and move high
            {
                h.remove(s.charAt(low));
                low++;    
            }
            // its of if u reverse the pointers too hight as low or low as high
        }
        return max;
    }
}