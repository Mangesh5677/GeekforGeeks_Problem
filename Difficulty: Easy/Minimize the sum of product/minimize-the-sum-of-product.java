class Solution {
    public int minProductSum(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        int n = a.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += a[i] * b[n - 1 - i];
        }

        return sum;
    }
}