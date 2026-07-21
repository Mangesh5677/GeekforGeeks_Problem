class Solution {
    static final long MOD = 1000000007L;

    long power(long a, long b) {
        long res = 1;
        a %= MOD;

        while (b > 0) {
            if ((b & 1) == 1)
                res = (res * a) % MOD;

            a = (a * a) % MOD;
            b >>= 1;
        }
        return res;
    }

    public int findMaxProduct(int[] arr) {

        int n = arr.length;

        if (n == 1)
            return arr[0];

        int neg = 0, zero = 0;
        int maxNeg = Integer.MIN_VALUE;

        long prod = 1;

        for (int x : arr) {

            if (x == 0) {
                zero++;
                continue;
            }

            if (x < 0) {
                neg++;
                maxNeg = Math.max(maxNeg, x);
            }

            long val = x;
            if (val < 0)
                val += MOD;

            prod = (prod * val) % MOD;
        }

        if (zero == n)
            return 0;

        if (neg == 1 && zero + neg == n)
            return 0;

        if ((neg & 1) == 1) {
            long inv = power(maxNeg + MOD, MOD - 2);
            prod = (prod * inv) % MOD;
        }

        return (int) prod;
    }
}