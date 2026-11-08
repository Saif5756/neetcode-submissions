class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        char s2;
        char s1;
         for(int i=0; i<Math.max(word1.length(), word2.length());i++){
                if(i<word1.length()){
                    s1=word1.charAt(i);
                    ans.append(s1);
                }
                if(i<word2.length()){
                    s2=word2.charAt(i);
                    ans.append(s2);
                }
         }

            return ans.toString();
    }
}
    
