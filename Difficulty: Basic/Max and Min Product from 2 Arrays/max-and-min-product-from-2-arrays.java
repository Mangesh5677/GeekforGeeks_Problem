
class Solution {

    public long minMaxProduct(int[] arr1, int[] arr2) {
        // code here
        int n=arr1.length;
        int m=arr2.length;
         int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
        }
        for(int j=0;j<m;j++){
            if(arr2[j]<min){
                min=arr2[j];
            }
        }
        return 1L * max * min;
    }
}