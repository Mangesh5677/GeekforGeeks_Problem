class Solution {
    public char extraChar(String s1, String s2) {

        int ans = 0;

        for (int i = 0; i < s1.length(); i++) {
            ans ^= s1.charAt(i);
        }

        for (int j = 0; j < s2.length(); j++) {
            ans ^= s2.charAt(j);
        }

        return (char) ans;
    }
}