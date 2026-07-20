class Solution {
    public ArrayList<Integer> mergeArrays(int[][] mat) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n=mat.length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<mat[0].length;j++){
                ans.add(mat[i][j]);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}