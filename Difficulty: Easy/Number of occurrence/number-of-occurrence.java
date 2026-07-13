class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int count=0;
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
}
