
class Solution {
    public String average(int arr[]) {
        // code here
        int n=arr.length;
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            count++;
        }
          double avg = (double) sum / n;

        return String.format("%.2f", avg);
    }
}