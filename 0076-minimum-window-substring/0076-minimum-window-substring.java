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
            window[c1]++;  // increment the frq and check for validity
            if (t_arr[c1] > 0 && window[c1] <= t_arr[c1]) { //move upto a string become valid
                count++;    //  count is use to keep up the validity
            }

            while (count == t.length()) {   // that means that all char in t is encountered so the substr now we have is valid
                if (right - left + 1 < minLen) {    // update min and reduce count
                    minLen = right - left + 1;
                    start = left;
                }

                char c2 = s.charAt(left);
                window[c2]--;   // decrement count
                if (t_arr[c2] > 0 && window[c2] < t_arr[c2]) {  // traverse until it become invalid
                    count--; //and decrement count i.e if there are 2 char in t and 1 is decremented then the substr become invalid 
                }
                left++;
            }
            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}