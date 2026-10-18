class Solution {
    public String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs);
        String pre="";
        for (int i=0; i<strs[0].length();i++){
            if(strs[0].charAt(i) != strs[strs.length - 1].charAt(i)){
                return pre;
            }
            pre+=strs[0].charAt(i);
        }
        return pre;
    }
}