class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);

        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != first) {
                ans.add(first);
                ans.add(arr[i]);
                return ans;
            }
        }
        ans.add(-1);
        return ans;
    }
}