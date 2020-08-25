package doit.chap04;

import java.util.Scanner;

public class Q6<E> {
    private int max;
    private int num;
    private int front;
    private int rear;
    private E[] que;

    public Q6(int capacity) {
        max = capacity;
        num = 0;
        front = 0;
        rear = 0;
        que = (E[]) new Object[max];
    }

    public E enqueue(E obj) {
        que[rear++] = obj;
        num++;

        if (rear == max) {
            rear = 0;
        }

        return obj;
    }

    public E dequeue() {
        E x = que[front++];
        num--;
        if (front == max) {
            front = 0;
        }
        return x;
    }

    public E peek() {
        return que[front];
    }

    public void dump() {
        for (int i = 0; i < num; i++) {
            System.out.print(que[(i + front) % max] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Q6 que = new Q6(5);
        String x;

        while (true) {
            System.out.print("1.인큐 2.디큐 3.피크 4.덤프 0.종료 : ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 0) {
                break;
            }
            if (menu == 1) {
                System.out.print("데이터 입력 : ");
                x = scanner.nextLine();
                que.enqueue(x);
            }
            if (menu == 2) {
                que.dequeue();
            }
            if (menu == 3) {
                System.out.println(que.peek());
            }
            if (menu == 4) {
                que.dump();
            }
        }

    }
}
