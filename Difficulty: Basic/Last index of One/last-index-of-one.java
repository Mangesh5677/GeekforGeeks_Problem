class Solution {
    public int lastIndex(String s) {
        int index=-1;
        int n=s.length();
        
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                return i;
            }
        }
        return index;
    }
}