package doit.chap05;

import java.util.Scanner;

public class RecurX1 {
    static void recur(int n) {
        while (n > 0) {
            recur(n - 1);
            System.out.println(n);
            n = n - 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력 : ");
        int x = scanner.nextInt();

        recur(x);
    }
}
