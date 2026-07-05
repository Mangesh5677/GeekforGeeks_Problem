
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // code here
        int n = arr.size();
        int count=0;
        //x is less than or equal to 
        
        for(int i=0;i<n;i++){
            if(arr.get(i)<=x){
                count++;
            }
        }
        return count;
    }
}