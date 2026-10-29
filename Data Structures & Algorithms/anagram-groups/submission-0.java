class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0) return  new ArrayList();
        Map<String,List<String>> map = new HashMap<>();
        for(String st:strs){
            char[] array= st.toCharArray();
            Arrays.sort(array);
            String key=String.valueOf(array);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList());
            }
            map.get(key).add(st);

        }
        return new ArrayList(map.values());
    }
}
