class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n=a.length;
        int m=b.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(a[i]);
        }
        for(int i=0;i<m;i++){
            ans.add(b[i]);
        }
        Collections.sort(ans);
        return ans.get(k - 1);
    }
}