class Solution {
    public int coin(int[] arr) {
        // code here
        int n=arr.length;
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}