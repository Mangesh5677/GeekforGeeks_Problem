class Solution {
    public int convertFive(int n) {

        // Special case
        if (n == 0)
            return 5;

        int rev = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit == 0)
                digit = 5;

            rev = rev * 10 + digit;
            n /= 10;
        }

        // Reverse again to get the correct order
        int ans = 0;

        while (rev > 0) {
            ans = ans * 10 + (rev % 10);
            rev /= 10;
        }

        return ans;
    }
}