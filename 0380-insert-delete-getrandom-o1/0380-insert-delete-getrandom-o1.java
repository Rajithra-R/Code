class RandomizedSet {
    private ArrayList<Integer> v;
    private HashMap<Integer, Integer> m;
    private Random rand;
    
    public RandomizedSet() {
        v = new ArrayList<>();
        m = new HashMap<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
         if (m.containsKey(val)) {
            return false;
        }
        v.add(val);
        m.put(val, v.size() - 1);
        return true;
    }
    
    public boolean remove(int val) {
         if (!m.containsKey(val)) {
            return false;
        }
        int index = m.get(val);
        int lastElement = v.get(v.size() - 1);
        v.set(index, lastElement);
        m.put(lastElement, index);
        v.remove(v.size() - 1);
        m.remove(val);
        return true;
    }
    
    public int getRandom() {
          return v.get(rand.nextInt(v.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */