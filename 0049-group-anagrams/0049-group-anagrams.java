class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h = new HashMap<>();
        for(String s : strs)
        {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            //key is string
            String k = String.valueOf(c);
            //value is a array list
            if(!(h.containsKey(k)))
            {
                h.put(k,new ArrayList<>());
            }
            h.get(k).add(s);
        }
        return new ArrayList<>(h.values());   // convert hash map to arraylist
    }
}