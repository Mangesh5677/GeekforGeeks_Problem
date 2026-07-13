class Solution {
    public int peakElement(int[] arr) {
        int n = arr.length;
        // First element
        if (n == 1 || arr[0] > arr[1])
            return 0;
        // Middle elements
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return i;
            }
        }
        // Last element
        return n - 1;
    }
}