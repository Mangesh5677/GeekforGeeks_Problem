class Solution {
    public static ArrayList<Integer> countLessEq(int a[], int b[]) {

        int max = 0;
        for (int x : b) {
            max = Math.max(max, x);
        }

        int[] freq = new int[max + 1];

        for (int x : b) {
            freq[x]++;
        }

        // Prefix sum
        for (int i = 1; i <= max; i++) {
            freq[i] += freq[i - 1];
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int x : a) {
            if (x > max)
                ans.add(freq[max]);
            else
                ans.add(freq[x]);
        }

        return ans;
    }
}