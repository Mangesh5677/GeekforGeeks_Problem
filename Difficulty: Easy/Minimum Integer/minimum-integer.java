class Solution {
    public int minimumInteger(int[] arr) {
        int n = arr.length;
        long sum = 0;
        for (int num : arr) {
            sum += num;
        }

        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (sum <= (long)n * arr[i]) {
                return arr[i];
            }
        }
        return -1;
    }
}