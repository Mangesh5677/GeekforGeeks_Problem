class Solution {
    public int areAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return 0;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return 0;
            }
        }

        return 1;
    }
}