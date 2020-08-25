package doit.chap05;

import doit.chap04.IntStack;

import java.util.Scanner;

public class RecurX2 {
    static void recur(int n) {
        IntStack stack = new IntStack(n);

        while (true) {
            if (n > 0) {
                stack.push(n);
                n = n - 1;
                continue;
            }

            if (stack.isEmpty() != true) {
                n = stack.pop();
                System.out.println(n);
                n = n - 2;
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력 : ");
        int x = scanner.nextInt();

        recur(x);
    }
}
