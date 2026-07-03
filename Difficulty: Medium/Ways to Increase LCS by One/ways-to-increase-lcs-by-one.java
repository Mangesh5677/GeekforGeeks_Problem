class Solution {
    public int waysToIncreaseLCSBy1(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        int[][] dp1 = new int[n + 1][m + 1];
        int[][] dp2 = new int[n + 2][m + 2];

        // Forward LCS
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp1[i][j] = dp1[i - 1][j - 1] + 1;
                else
                    dp1[i][j] = Math.max(dp1[i - 1][j], dp1[i][j - 1]);
            }
        }

        // Backward LCS
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (s1.charAt(i) == s2.charAt(j))
                    dp2[i][j] = dp2[i + 1][j + 1] + 1;
                else
                    dp2[i][j] = Math.max(dp2[i + 1][j], dp2[i][j + 1]);
            }
        }

        int lcs = dp1[n][m];
        int ans = 0;

        // Try every insertion position
        for (int pos = 0; pos <= n; pos++) {
            boolean[] used = new boolean[26];

            for (int j = 0; j < m; j++) {
                int ch = s2.charAt(j) - 'a';

                if (!used[ch] &&
                    dp1[pos][j] + dp2[pos][j + 1] == lcs) {
                    ans++;
                    used[ch] = true;
                }
            }
        }

        return ans;
    }
}