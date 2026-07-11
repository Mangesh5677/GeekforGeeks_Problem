class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int n=arr.length;
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                index=i;
                break;
            }
        }
        return index;
    }
}