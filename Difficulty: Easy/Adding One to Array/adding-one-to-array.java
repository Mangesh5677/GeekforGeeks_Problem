class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        
        Vector<Integer> ans = new Vector<>();

        int n = arr.length;
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            ans.add(0, sum % 10);
            carry = sum / 10;
        }

        if (carry == 1) {
            ans.add(0, 1);
        }

        return ans;
    }
}