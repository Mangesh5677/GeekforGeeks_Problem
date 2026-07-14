import java.util.Arrays;

class Solution {
    public long[] findElements(long[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        long[] ans = new long[n - 2];
        for (int i = 0; i < n - 2; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }
}