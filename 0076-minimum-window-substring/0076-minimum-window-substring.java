class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        // Array to keep the frequency of characters in t
        int[] t_arr = new int[128];
        for (char c : t.toCharArray()) t_arr[c]++;

        // Array to keep the frequency of characters in the current window
        int[] window = new int[128];
        int left = 0, right = 0, minLen = Integer.MAX_VALUE, start = 0;
        int count = 0;

        while (right < s.length()) {
            char c1 = s.charAt(right);
            window[c1]++;
            if (t_arr[c1] > 0 && window[c1] <= t_arr[c1]) {
                count++;
            }

            while (count == t.length()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char c2 = s.charAt(left);
                window[c2]--;
                if (t_arr[c2] > 0 && window[c2] < t_arr[c2]) {
                    count--;
                }
                left++;
            }
            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}