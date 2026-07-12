class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        int n=arr.length;
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(min>arr[i]){
                return false;
            }
            min=arr[i];
        }
        return true;
    }
}