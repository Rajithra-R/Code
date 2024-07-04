class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> h = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            h.put(c,h.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> q = new PriorityQueue<>((a,b) -> (h.get(b) - h.get(a)));
        for(char ch : h.keySet())
        {
            q.add(ch);
        }
        StringBuilder b = new StringBuilder();
        while(q.size() > 0) // until queue have elements do
        {
            char c = q.poll();
            for(int i=0;i<h.get(c);i++) // if a's freq = 3 then append 3 a's
            {
                b.append(c);
            }
        }
        return b.toString();
    }
}