class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {

        int n = arr.length;

        // Convert values to 0-based
        for (int i = 0; i < n; i++) {
            arr[i]--;
        }

        // Store frequencies in the same array
        for (int i = 0; i < n; i++) {
            arr[arr[i] % n] += n;
        }

        ArrayList<Integer> ans = new ArrayList<>();

        // Extract frequencies
        for (int i = 0; i < n; i++) {
            ans.add(arr[i] / n);
        }

        return ans;
    }
}