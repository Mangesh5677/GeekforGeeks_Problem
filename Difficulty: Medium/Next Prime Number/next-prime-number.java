//Back-end complete function Template for Java
class Solution {
    public static int nextPrime(int n) {
        n++;
        while (true) {
            int i;
            for (i = 2; i < n; i++) {
                if (n % i == 0) break;
            }
            if (i == n) return n;
            n++;
        }
    }
}