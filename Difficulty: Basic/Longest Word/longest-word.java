class Solution {
    public String longest(String[] arr) {
        String max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > max.length()) {
                max = arr[i];
            }
        }
        return max;
    }
}