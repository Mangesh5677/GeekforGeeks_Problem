class Complete {

    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        int diagonalSum = 0;
        int max = b[0];

        for (int i = 0; i < n; i++) {
            diagonalSum += a[i][i];
            if (b[i] > max) {
                max = b[i];
            }
        }

        ans.add(diagonalSum);
        ans.add(max);

        return ans;
    }
}