class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            ans.add(arr[right]);
            ans.add(arr[left]);
            right--;
            left++;
        }
        // Add the middle element only once (for odd length)
        if (left == right) {
            ans.add(arr[left]);
        }
        return ans;
    }
}