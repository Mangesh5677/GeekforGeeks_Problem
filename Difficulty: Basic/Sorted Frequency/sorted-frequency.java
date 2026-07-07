import java.util.Arrays;

class Solution {
    public static void freqSorted(int arr[]) {
        Arrays.sort(arr);

        int n = arr.length;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println(arr[i - 1] + " " + count);
                count = 1;
            }
        }

        System.out.println(arr[n - 1] + " " + count);
    }
}