class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        int max=-1;
        int second_max=-1;
        for(int i=0;i<n;i++){
                if(max<arr[i]){
                    second_max=max;
                    max=arr[i];
                }else if(arr[i]>second_max  && arr[i]!=max){
                 second_max=arr[i];
                }
        }
     return second_max;
    }
}