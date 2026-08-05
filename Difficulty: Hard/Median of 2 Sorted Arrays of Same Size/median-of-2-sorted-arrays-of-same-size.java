class Solution {
    public double medianOf2(int a[], int b[]) {

        ArrayList<Integer> ans = new ArrayList<>();
        int n = a.length;

        for (int i = 0; i < n; i++) {
            ans.add(a[i]);
            ans.add(b[i]);
        }

        Collections.sort(ans);

        return (ans.get(n - 1) + ans.get(n)) / 2.0;
    }
}