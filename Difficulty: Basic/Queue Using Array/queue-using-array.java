class myQueue {

    int[] arr;
    int front;
    int rear;
    int size;

    // Constructor
    public myQueue(int n) {
        arr = new int[n];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public void enqueue(int x) {

        if (isFull()) {
            return;
        }

        rear++;
        arr[rear] = x;
        size++;
    }

    public void dequeue() {

        if (isEmpty()) {
            return;
        }

        front++;
        size--;

        // Reset pointers when queue becomes empty
        if (size == 0) {
            front = 0;
            rear = -1;
        }
    }

    public int getFront() {

        if (isEmpty()) {
            return -1;
        }

        return arr[front];
    }

    public int getRear() {

        if (isEmpty()) {
            return -1;
        }

        return arr[rear];
    }
}