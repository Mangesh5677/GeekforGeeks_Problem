class Solution {
    public static boolean areAnagrams(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] ch = s1.toCharArray();
        char[] ch1 = s2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        String sorted = new String(ch);
        String sorted1 = new String(ch1);

        return sorted.equals(sorted1);
    }
}