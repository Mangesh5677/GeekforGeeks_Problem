class Solution {
    public ArrayList<Integer> filterByDigits(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int num : arr) {
            int temp = num;
            boolean flag = true;

            while (temp > 0) {
                int digit = temp % 10;

                if (digit != 1 && digit != 2 && digit != 3) {
                    flag = false;
                    break;
                }

                temp /= 10;
            }

            if (flag) {
                ans.add(num);
            }
        }

        if (ans.size() == 0) {
            ans.add(-1);
        }

        return ans;
    }
}