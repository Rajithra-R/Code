// the problem is that u can put char in the string  t into stirng s so that u get the same string t
// Eg : s - egg; t - add => replace e with a means that all e's should be replaced with a's and g 's with d's  so that we get add(i.e string t)
// in another case s - foo ; t - bar => u can replace f with b and o with a for both o's means that the res = 'baa' but t = 'bar' so false
// Approach : use hash map of char,char => key is char in s and value is char in t
// Pick a char from s and t and check whether they exist in the hashmap...if not add ...if yes check for the value is correctly mapped...
// if yes then return true else false
// containsValue - chacke if the key is mapped to one key or more  

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> h = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(h.containsKey(s.charAt(i)))
            {
                if(!h.get(s.charAt(i)).equals(t.charAt(i)))
                {
                    return false;
                }
            }
            else
            {
                if(h.containsValue(t.charAt(i)))  // if the same key is mapped to 2/more char of t then return false
                {
                    return false;
                }
            }
            h.put(s.charAt(i),t.charAt(i));
        }
        return true;
    }
}