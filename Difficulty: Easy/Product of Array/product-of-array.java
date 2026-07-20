class Solution {
    public long product(long arr[]) {
        // code here
        long max=1000000007;
        long product=1;
        int n=arr.length;
        for(int i=0;i<n;i++){
           product = (product * arr[i]) % max;
        }
        return product;
    }
}