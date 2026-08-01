class Solution {
    int minProduct(int arr[], int k) {
        Arrays.sort(arr);

        long mod = 1000000007L;
        long product = 1;

        int n = arr.length;

        for (int i = 0; i < k && i < n; i++) {
            product = (product * arr[i]) % mod;
        }

        return (int) product;
    }
}