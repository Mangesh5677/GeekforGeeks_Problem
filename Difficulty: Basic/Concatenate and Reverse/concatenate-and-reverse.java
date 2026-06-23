class Solution {
    static String conRevstr(String s1, String s2) {
        String s3 = s1 + s2;
        String result = "";

        for (int i = s3.length() - 1; i >= 0; i--) {
            result += s3.charAt(i);
        }

        return result;
    }
}