/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[]) {
        // add code here.
        int n=b.length;
        for(int i=0;i<n;i++){
            if(a[i]!=b[i]){
                return i;
            }
        }
        return n;
    }
}