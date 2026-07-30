import java.util.*;

class Solution {
    public long maxSum(Long arr[]) {
        Arrays.sort(arr);

        int n = arr.length;
        Long[] temp = new Long[n];

        int i = 0, j = n - 1, k = 0;

        while (i <= j) {
            if (i <= j)
                temp[k++] = arr[i++];
            if (i <= j)
                temp[k++] = arr[j--];
        }

        long sum = 0;

        for (int x = 0; x < n - 1; x++) {
            sum += Math.abs(temp[x] - temp[x + 1]);
        }

        sum += Math.abs(temp[n - 1] - temp[0]);

        return sum;
    }
}