package doit.chap04;

import java.util.Scanner;

public class Q2<E> {
    private int max;
    private int ptr;
    private E[] stk;

    public Q2(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = (E[]) new Object[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public static class EmptyGstackException extends RuntimeException {
        public EmptyGstackException() {}
    }

    public static class OverflowGstackException extends RuntimeException {
        public OverflowGstackException() {}
    }

    public E push(E x) throws OverflowGstackException {
        if (ptr >= max) {
            throw new OverflowGstackException();
        }
        return stk[ptr++] = x;
    }

    public E pop() throws EmptyGstackException {
        if (ptr <= 0) {
            throw new EmptyGstackException();
        }
        return stk[--ptr];
    }

    public void dump() {
        for (int i = 0; i < ptr; i++) {
            System.out.print(stk[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Q2 stk = new Q2(10);

        System.out.print("정수값 입력 : ");
        int n = scanner.nextInt();
        stk.push(n);

        System.out.print("문자열값 입력 : ");
        String s = scanner.next();
        stk.push(s);

        stk.dump();
    }
}
