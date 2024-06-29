class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" +");
        StringBuilder b = new StringBuilder();
        for(int i = words.length-1;i>=0;i--)
        {
            b.append(words[i]);
            b.append(" ");
        }
        return b.toString().trim();
    }
}