class Solution {
    public String minWindow(String s, String t) {
       if (s.length() < t.length()) return "";

        // Array to keep the frequency of characters in t
        int[] tFreq = new int[128];
        for (char c : t.toCharArray()) tFreq[c]++;

        // Array to keep the frequency of characters in the current window
        int[] windowFreq = new int[128];
        int left = 0, right = 0, minLen = Integer.MAX_VALUE, start = 0;
        int matchCount = 0;

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            windowFreq[rightChar]++;
            if (tFreq[rightChar] > 0 && windowFreq[rightChar] <= tFreq[rightChar]) {
                matchCount++;
            }

            while (matchCount == t.length()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                windowFreq[leftChar]--;
                if (tFreq[leftChar] > 0 && windowFreq[leftChar] < tFreq[leftChar]) {
                    matchCount--;
                }
                left++;
            }
            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    
    }
}