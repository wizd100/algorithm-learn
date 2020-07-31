package doit.chap04.review;

import java.util.Scanner;

public class ReviewStack {
    private int ptr;
    private int max;
    private int[] stack;

    public ReviewStack(int capacity) {
        ptr = 0;
        max = capacity;
        stack = new int[max];
    }

    public class OverflowStackException extends RuntimeException {
        public OverflowStackException() {}
    }

    public class EmptyStackException extends RuntimeException {
        public EmptyStackException() {}
    }

    public int push(int n) throws OverflowStackException {
        if (ptr >= max) {
            throw new OverflowStackException();
        }
        return stack[ptr++] = n;
    }

    public int pop() throws EmptyStackException {
        if (ptr <= 0) {
            throw new EmptyStackException();
        }
        return stack[--ptr];
    }

    public int peek() {
        return stack[ptr - 1];
    }

    public void dump() {
        for (int i = 0; i < ptr; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public void clear() {
        ptr = 0;
    }

    public int size() {
        return ptr;
    }

    public int capacity() {
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열값 : ");
        int num = scanner.nextInt();
        ReviewStack stk = new ReviewStack(num);

        int n;
        while (true) {
            System.out.println(stk.size() + " / " + stk.capacity());
            System.out.print("1.push 2.pop 3.peek 4.dump 5.clear 6.exit : ");
            int menu = scanner.nextInt();

            if (menu == 1) {
                System.out.print("정수 입력 : ");
                n = scanner.nextInt();
                stk.push(n);
            }
            if (menu == 2) {
                stk.pop();
            }
            if (menu == 3) {
                System.out.println(stk.peek());
            }
            if (menu == 4) {
                stk.dump();
            }
            if (menu == 5) {
                stk.clear();
            }
            if (menu == 6) {
                break;
            }
        }
    }
}
