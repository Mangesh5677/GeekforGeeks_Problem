import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> fillArrayList(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();
        int  n=arr.length;

        for(int i=0;i<n;i++){
           ans.add(arr[i]); 
        }

        return ans;
    }
}