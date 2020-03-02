package codeup;

import java.util.Scanner;

public class p1904 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        recursion(scanner.nextInt(), scanner.nextInt());
    }

    public static void recursion(int a, int b) {
        if (a > b) {
            return;
        }
        if (a % 2 != 0) {
            System.out.printf("%d ", a);
        }

        recursion(a + 1, b);
    }
}
