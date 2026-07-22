class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                ans.add(arr[i]);
            }
        }
        ans.add(arr[0]);
        return ans;
    }
}