class Solution {
    public int missingNumber(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (num > 0) {
                set.add(num);
            }
        }

        int ans = 1;

        while (true) {
            if (!set.contains(ans)) {
                return ans;
            }
            ans++;
        }
    }
}