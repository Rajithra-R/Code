class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> h = new HashMap<>();  // for each char and count of word in magazine
        for(char c :magazine.toCharArray())
        {
            h.put(c,h.getOrDefault(c,0) + 1);
        }
        // check if char in ransomNote is present in map if so then reduce the count
        // if not or if count == 0 then return false
        // get out of loop and return true
        for(char c : ransomNote.toCharArray())
        {
            if(!h.containsKey(c) || h.get(c) == 0) // if char is not found or count == 0
            {
                return false;
            }
            // else if it has then decrement the count
            h.put(c,h.get(c) - 1);
        }
        return true;
    }
}