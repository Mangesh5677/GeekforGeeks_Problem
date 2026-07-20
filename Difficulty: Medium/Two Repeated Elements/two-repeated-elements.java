class Solution {
    public int[] twoRepeated(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        int index = 0;

        for (int num : arr) {
            if (set.contains(num)) {
                ans[index++] = num;
            } else {
                set.add(num);
            }
        }

        return ans;
    }
}