class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" +");   
        // the reason why dont we use trim here is that there may be more than 1 spaces in the middle of string resulting in error
        StringBuilder b = new StringBuilder();
        for(int i = words.length-1;i>=0;i--)
        {
            b.append(words[i]);
            b.append(" ");
        }
        return b.toString().trim();
    }
}


//s.split(" +")  - For example, s = "a b c" would result in ["a", "b", "c"]
// s.split(" ")  - For example, s = "a b c" would result in ["a", "", "b", "", "", "c"]