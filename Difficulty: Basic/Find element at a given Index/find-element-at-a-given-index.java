class Solution {
    public int findElementAtIndex(int i, int[] arr) {
        // code here
        int n=arr.length;
        int ans=0;
        for(int j=0;j<n;j++){
            if(j==i){
                ans=arr[j];
            }
        }
        return ans;
    }
}