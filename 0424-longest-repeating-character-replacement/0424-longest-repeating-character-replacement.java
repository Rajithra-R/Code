class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int left = 0;
        int right = 0;
        int[] freq = new int[26];
        for(right = 0;right<s.length();right++)
        {
             freq[s.charAt(right) - 'A']++;
            max= Math.max(max,freq[s.charAt(right) - 'A']);
            // shrink window by decreasing count and increasing left
            if(max + k < right - left + 1)
            {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            
        }
        return right - left;
    }
}