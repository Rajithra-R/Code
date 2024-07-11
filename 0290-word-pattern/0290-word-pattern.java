class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");
        if(pattern.length() != words.length)  return false;
        Map<Character,String> h1 = new HashMap<>();
        Map<String,Character> h2 = new HashMap<>();
        for(int i=0;i<pattern.length();i++)
        {
            char c = pattern.charAt(i);
            String str = words[i];
            if(h1.containsKey(c))  // key is present
            {
                if(!h1.get(c).equals(str))   // if matching string is not found
                {
                    return false;
                }
            }
            else   // put it to that char
            {
                    h1.put(c,str);
            }
            
            if(h2.containsKey(str)) 
            {
                if(!h2.get(str).equals(c))   // if matching string is not found
                {
                    return false;
                }
            }
            else   // put it to that char
           {
                    h2.put(str,c);
           }
            
        }
        return true;
    }
}