class Solution {
    public static void pb(ArrayDeque<Integer> dq, int x) {
        // Push at the back
        dq.addLast(x);
    }

    public static void ppb(ArrayDeque<Integer> dq) {
        // Pop from the back
        if (!dq.isEmpty()) {
            dq.removeLast();
        }
    }

    public static int front_dq(ArrayDeque<Integer> dq) {
        // Return front element
        if (dq.isEmpty()) {
            return -1;
        }
        return dq.peekFirst();
    }

    public static void pf(ArrayDeque<Integer> dq, int x) {
        // Push at the front
        dq.addFirst(x);
    }
}