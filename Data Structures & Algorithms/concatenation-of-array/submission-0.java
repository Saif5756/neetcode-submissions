class Solution {
    public int[] getConcatenation(int[] nums) {
        int index=0;
        int [] ans = new int[nums.length*2];
        for(int i=0; i<nums.length;i++ , index++){
            ans[index]=nums[i];
        }
        for(int j = 0; j<nums.length;j++,index++){
            ans[index]=nums[j];
        }
        return ans;
    }
}