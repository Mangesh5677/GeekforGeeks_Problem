class Solution {
    public static ArrayList<Integer> getSmaller(int arr[], int target) {
        // write your code here
        int n= arr.length;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(target>arr[i]){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}