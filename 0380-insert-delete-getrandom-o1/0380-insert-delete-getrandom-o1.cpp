class RandomizedSet {
    vector<int> v;
    unordered_map<int,int> m; //to store val and key
public:
    RandomizedSet() {
        
    }
    
    bool insert(int val) {
        if(m.find(val)!=m.end())  //ele already present
            return false;
        v.push_back(val); // add val to vector
        m[val] = v.size()-1;  // since it is added at end,map value of number is the last index
        return true;
    }
    
    bool remove(int val) {
        if(m.find(val)==m.end())  //ele not present
            return false;
        int i = m[val];
        int last = v.back();
        v[i]=last;
        m[last]=i;
        v.pop_back();
        m.erase(val);
        return true;
        
        
    }
    
    int getRandom() {
        return v[rand()%v.size()];
    }
};

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet* obj = new RandomizedSet();
 * bool param_1 = obj->insert(val);
 * bool param_2 = obj->remove(val);
 * int param_3 = obj->getRandom();
 */