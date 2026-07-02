class Solution {
    public static void arrayTraversalReverse(int[] arr, int n) {
        // Code here
        int k= arr.length-1;
        for(int i=k;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}
