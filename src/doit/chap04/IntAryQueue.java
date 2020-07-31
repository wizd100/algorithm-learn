package doit.chap04;

public class IntAryQueue {
    private int max;
    private int num;
    private int[] que;

    public IntAryQueue(int capacity) {
        max = capacity;
        num = 0;
        que = new int[max];
    }

    public int enqueue(int n) {
        return que[num++] = n;
    }

    public int dequeue() {
        if (num <= 0) {

        }
        int n = que[0];
        for (int i = 1; i < num; i++) {
            que[i - 1] = que[i];
        }
        num--; //마지막 남아있는 값을 지움
        return n;
    }

    public void dump() {
        for (int i = 0; i < num; i++) {
            System.out.print(que[i] + " ");
        }
        System.out.println();
    }
}
