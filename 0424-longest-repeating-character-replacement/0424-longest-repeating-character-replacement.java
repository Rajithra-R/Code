class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxlen = 0;
        int maxrepcount = 0;
        HashMap<Character,Integer> h = new HashMap<>();
        for(right = 0; right < s.length();right++)
        {
            char c = s.charAt(right);
            h.put(c,h.getOrDefault(c,0)+1);
            maxrepcount = Math.max(maxrepcount,h.get(c));   // get the cur count or max count
           //  window = right - left + 1;
            int nonrep = (right - left + 1 )- maxrepcount;
            if(nonrep > k) // slide the window
            {
                h.put(s.charAt(left),h.get(s.charAt(left)) - 1); // subtract the count 
                left++;
            }
            maxlen = Math.max(maxlen,right - left +1);
        }
        return maxlen;
    }
}