class Solution {
    public int searchInsertK(int arr[], int k) {
        
        int n = arr.length;
        int ans = n;   // default insert at end
        
        for(int i = 0; i < n; i++) {
            if(arr[i] == k) {
                return i;
            }
            if(arr[i] > k) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}