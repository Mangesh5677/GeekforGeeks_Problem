class Solution {

    static boolean canSplit(int arr[], int k, int maxSum) {

        int pieces = 1;
        int sum = 0;

        for(int num : arr){

            if(sum + num <= maxSum){
                sum += num;
            }
            else{
                pieces++;
                sum = num;
            }
        }

        return pieces <= k;
    }

    public int splitArray(int[] arr, int k) {

        int low = 0;
        int high = 0;

        for(int num : arr){
            low = Math.max(low, num);
            high += num;
        }

        int ans = high;

        while(low <= high){

            int mid = low + (high-low)/2;

            if(canSplit(arr, k, mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return ans;
    }
}