class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int i =0;
        while(i < words.length)
        {
            int count = words[i].length();   // length of 1st word
            int j = i+1;    // move to next word
            while(j < words.length)  // check for each word
            {
                if(count + 1 + words[j].length() > maxWidth) 
                // check if adding the word exceeds the maxwidth
                // count - length of 1 st word
                // 1 - space
                //words[j].length() - length of 2nd word
                {
                    break;
                }
                else //otherwise add the space and the len of next word to first word
                {
                    count += 1 + words[j].length();
                }
                j++; // go to next word
            }
            // put the current words in a stringbuilder
            StringBuilder s = new StringBuilder();
            s.append(words[i]);  // put 1st word
           int  d = j - i - 1;
            if(j == words.length || d ==0) // reached end of word or there is only one word 
            {
                for(int k = i+1 ;k<j;k++)  // if it is the last word
                {
                    s.append(" ");  // add a space then append the word
                    s.append(words[k]);   // put nxt word
                }
                for(int k=s.length();k<maxWidth;k++)
                {
                    s.append(" "); //if it is the only word then add spaces at the end
                }
            }
            else  // calculate the spaces
            {
                int spaces = (maxWidth - count) / d;
                int extra = (maxWidth - count) % d;
                for(int k=i+1;k<j;k++)
                {
                    for(int m=spaces;m>0;m--)
                    {
                        s.append(" ");
                    }
                    if(extra > 0)
                    {
                        s.append(" ");
                        extra--;
                    }
                    s.append(" ");
                    s.append(words[k]);
                }
            }
            res.add(s.toString());
            i=j;
        }
        return res;
    }
}