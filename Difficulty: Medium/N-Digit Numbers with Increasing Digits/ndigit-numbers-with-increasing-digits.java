class Solution {
    ArrayList<Integer> increasingNumbers(int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (n > 10)
            return ans;

        if (n == 1) {
            for (int i = 0; i <= 9; i++)
                ans.add(i);
            return ans;
        }

        generate(ans, 0, 1, n);

        return ans;
    }

    void generate(ArrayList<Integer> ans, int num, int start, int n) {
        if (n == 0) {
            ans.add(num);
            return;
        }

        for (int i = start; i <= 9; i++) {
            generate(ans, num * 10 + i, i + 1, n - 1);
        }
    }
}