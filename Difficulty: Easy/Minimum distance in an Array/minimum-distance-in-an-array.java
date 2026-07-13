class Solution {
    int minDist(int arr[], int x, int y) {

        int lastIndex = -1;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == x || arr[i] == y) {

                if (lastIndex != -1 && arr[i] != arr[lastIndex]) {
                    min = Math.min(min, i - lastIndex);
                }

                lastIndex = i;
            }
        }

        return (min == Integer.MAX_VALUE) ? -1 : min;
    }
}