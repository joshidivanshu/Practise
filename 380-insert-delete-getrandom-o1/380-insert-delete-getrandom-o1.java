class RandomizedSet {
    ArrayList<Integer> arr;
    HashMap<Integer,Integer> map;
    Random rand;
    public RandomizedSet() {
        arr = new ArrayList<Integer>();
        map = new HashMap<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if(!map.containsKey(val))
        {
            arr.add(val);
            map.put(val,arr.size()-1);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val))
        {
            int indx = map.get(val);
            int lastIndx = arr.size()-1;
            if(indx != lastIndx)
            {
                int lastValue = arr.get(lastIndx);
                arr.set(indx, lastValue);
                map.put(lastValue, indx);
            }
            arr.remove(lastIndx);
            map.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        return arr.get(rand.nextInt(arr.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */