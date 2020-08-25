package doit.chap04;

public class IntDeque {
    private int max;
    private int num;
    private int front;
    private int rear;
    private int[] deque;

    public IntDeque(int capacity) {
        max = capacity;
        num = 0;
        front = 0;
        rear = 0;
        deque = new int[max];
    }

    public int addFront(int x) {
        num++;
        if (--front < 0) {
            front = max - 1;
        }
        deque[front] = x;
        return x;
    }

    public int removeFront() {
        num--;
        int x = deque[front++];
        if (front == max) {
            front = 0;
        }
        return x;
    }
}
