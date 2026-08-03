import java.util.*;

class Solution {
    public String findLargest(int[] arr) {
        
        int n = arr.length;
        
        String[] nums = new String[n];
        
        // Convert integer array to String array
        for(int i = 0; i < n; i++) {
            nums[i] = String.valueOf(arr[i]);
        }
        
        // Custom sorting
        Arrays.sort(nums, (a, b) -> {
            String ab = a + b;
            String ba = b + a;
            
            return ba.compareTo(ab);
        });
        
        
        // Edge case: all zeros
        if(nums[0].equals("0"))
            return "0";
        
        
        // Build answer
        StringBuilder ans = new StringBuilder();
        
        for(String s : nums) {
            ans.append(s);
        }
        
        return ans.toString();
    }
}