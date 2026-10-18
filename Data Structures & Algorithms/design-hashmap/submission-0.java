class MyHashMap {
    HashMap<Integer,Integer> ans = new HashMap<>();
   
    
    public void put(int key, int value) {
        ans.put(key, value);
    }
    
    public int get(int key) {
     if(ans.containsKey(key)){
        return ans.get(key);
     }else{
        return -1;
     }
    }
    
    public void remove(int key) {
        ans.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */