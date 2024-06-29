class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim(); // to remove the spaces inthe front and back of the sentences if have...
        int count = 0;
        for(int i = str.length()-1;i>=0;i--)
        {
            if(str.charAt(i) != ' ')
            {
                count++;
            }
            else
            {
                break;
            }
        }
        return count;
    }
}