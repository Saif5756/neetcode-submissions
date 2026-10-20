class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int[] ans = new int[m+n];
       int index=0;
        int l=0;
       for(int i = 0;i<m;i++ ){
        
        ans[index]=nums1[i];
        index++;
       }
       
       for(int j = 0; j<n;j++){

            ans[index]=nums2[j];
            index++;
       
       }
       Arrays.sort(ans);
        for(int k=0;k<ans.length;k++,l++){
            nums1[k]=ans[l];
        }
           
    }
}
