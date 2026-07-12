import java.util.Arrays;

class Solution {
    public static boolean checkEqual(int[] a, int[] b) {

        if (a.length != b.length) {
            return false;
        }

        int[] sorted1 = a.clone();
        int[] sorted2 = b.clone();

        Arrays.sort(sorted1);
        Arrays.sort(sorted2);

        for (int i = 0; i < sorted1.length; i++) {
            if (sorted1[i] != sorted2[i]) {
                return false;
            }
        }

        return true;
    }
}