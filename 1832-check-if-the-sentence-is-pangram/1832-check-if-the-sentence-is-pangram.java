class Solution {
    public boolean checkIfPangram(String sentence) {
    sentence = sentence.toLowerCase();
    Set<Character> h = new HashSet<>();
    for(char c : sentence.toCharArray())
    {
        if(c >= 'a' && c <= 'z')
        {
            h.add(c);
        }
    }
    if(h.size() == 26)
    {
        return true;
    }
    else{
        return false;
    }
    }
}