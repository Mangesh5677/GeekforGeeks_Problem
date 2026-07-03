class Solution {
    static void relationalOperators(int A, int B) {
        // code here
        if(A>B){
            System.out.println(A+" is greater than "+B);
        }
        else if(A<B){
           System.out.println(A+" is less than "+B); 
        }
        else if(A==B){
            System.out.println(A+" is eqals "+B); 
        }else{
            System.out.println(B+" is greater than "+A); 
        }
    }
}