class Solution {
    static ArrayList<Integer> getSum(int N) {
        // code here
        ArrayList<Integer> ans =new ArrayList<>();
        int evenSum=0;
        int oddSum=0;
        for(int i=1;i<=N;i++){
            if(i%2==0){
                evenSum+=i;
            }else{
                oddSum+=i;
            }
        }
        ans.add(evenSum);
        ans.add(oddSum);
        return ans;
    }
}