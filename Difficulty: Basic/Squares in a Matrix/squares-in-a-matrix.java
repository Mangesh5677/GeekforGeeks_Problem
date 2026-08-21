class Solution {
    public long squaresInMatrix(int m, int n) {
        long count = 0;

        int max = Math.min(m, n);

        for (int k = 1; k <= max; k++) {
            count += (long)(m - k + 1) * (n - k + 1);
        }

        return count;
    }
}