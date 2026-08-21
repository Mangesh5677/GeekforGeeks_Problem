class Solution {
    public int sortedCount(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean increasing = true;
            boolean decreasing = true;

            for (int j = 1; j < m; j++) {
                if (mat[i][j] <= mat[i][j - 1]) {
                    increasing = false;
                }

                if (mat[i][j] >= mat[i][j - 1]) {
                    decreasing = false;
                }
            }

            if (increasing || decreasing) {
                count++;
            }
        }

        return count;
    }
}