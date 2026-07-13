import java.util.*;
class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= arr.length - k; i--) {
            ans.add(arr[i]);
        }
        return ans;
    }
}