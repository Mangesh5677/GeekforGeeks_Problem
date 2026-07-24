import java.util.*;

class Solution {
    public void replaceWithRank(int[] arr) {

        int n = arr.length;

        int[][] temp = new int[n][2];

        for (int i = 0; i < n; i++) {
            temp[i][0] = arr[i]; // value
            temp[i][1] = i;      // original index
        }

        Arrays.sort(temp, (a, b) -> Integer.compare(a[0], b[0]));

        for (int rank = 0; rank < n; rank++) {
            arr[temp[rank][1]] = rank;
        }
    }
}