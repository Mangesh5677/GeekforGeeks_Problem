class Solution {
    public String roundToNearest(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int lastDigit = arr[n - 1] - '0';
        // Round down
        if (lastDigit <= 5) {
            arr[n - 1] = '0';
            return new String(arr);
        }
        // Round up
        arr[n - 1] = '0';

        int i = n - 2;

        while (i >= 0 && arr[i] == '9') {
            arr[i] = '0';
            i--;
        }

        if (i >= 0) {
            arr[i]++;
            return new String(arr);
        }
        // All digits were 9
        return "1" + new String(arr);
    }
}