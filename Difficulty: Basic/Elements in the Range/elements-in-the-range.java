import java.util.HashSet;

class Solution {

    public boolean checkElements(int start, int end, int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        // Store all elements in the HashSet
        for (int num : arr) {
            set.add(num);
        }

        // Check every number in the given range
        for (int i = start; i <= end; i++) {
            if (!set.contains(i)) {
                return false;
            }
        }

        return true;
    }
}