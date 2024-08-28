// Logic => BFS
/*
have a queue
have a set -> initialize the set with the elements in the wordlist
initially add the startword with level 1 into the q
until q becomes empty => pick the word and level and pop it off
check if the word is the last word then return the level
try out other combinations
and check if any combination reside in the set => if yes then remove it from the set and add to the queue
*/

class Solution {
    static class Pair{
        String str;
        int level;
        Pair(String str,int level)
        {
            this.str = str;
            this.level = level;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)) return 0;
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord,1));
        Set<String> h= new HashSet<>();
        for(int i=0;i<wordList.size();i++)
        {
            h.add(wordList.get(i));
        }
        while(!q.isEmpty())
        {
            String str = q.peek().str;
            int level = q.peek().level;
            q.remove();
            
            if(str.equals(endWord)) return level;
            for(int i=0;i<str.length();i++)
            {
                for(char c='a';c<='z';c++)
                {
                    char[] ch_arr = str.toCharArray();
                    ch_arr[i] = c;
                    String s = new String(ch_arr);
                    if(h.contains(s))
                    {
                        h.remove(s);
                        q.add(new Pair(s,level+1));
                    }
                }
            }
        }
        return 0;
    }
}