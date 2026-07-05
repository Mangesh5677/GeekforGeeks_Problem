class Solution {
    public int getOddOccurrence(int[] arr) {

        int ans = 0;

        for (int num : arr) {
            ans ^= num;
        }

        return ans;
    }
}