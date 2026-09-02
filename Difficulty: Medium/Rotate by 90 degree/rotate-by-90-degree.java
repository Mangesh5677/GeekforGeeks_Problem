class Solution {
    public void rotateMatrix(int[][] mat) {
        int n = mat.length;

        // Step 1: Transpose the matrix (Swap mat[i][j] with mat[j][i])
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Step 2: Reverse each column to achieve anti-clockwise rotation
        for (int j = 0; j < n; j++) {
            int low = 0;
            int high = n - 1;
            while (low < high) {
                int temp = mat[low][j];
                mat[low][j] = mat[high][j];
                mat[high][j] = temp;
                low++;
                high--;
            }
        }
    }
}
