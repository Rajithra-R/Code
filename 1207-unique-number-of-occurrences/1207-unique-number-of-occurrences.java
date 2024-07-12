class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> h1 = new HashMap<>();
        for(int i : arr)
        {
            h1.put(i,h1.getOrDefault(i,0) + 1);
        }
        Set<Integer> h2 = new HashSet<>(); // to check for Unique Number of Occurrences
        for(int i : h1.values())
        {
            if(!h2.add(i)) // add() returns false if the value already exist
            {
                return false;
            }
        }
        return true;
    }
}