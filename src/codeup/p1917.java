package codeup;

import java.util.Scanner;

public class p1917 {
    public static void main(String[] args) {
        long num;

        Scanner scanner = new Scanner(System.in);
        num = recursion(scanner.nextLong(), scanner.nextLong());
        System.out.printf("%d", num);
    }

    public static long recursion(long num, long exponentiation) {
        if (num == 1 || exponentiation % 2 == 0) {
            return 1;
        }
        if (num == 1 || exponentiation % 2 != 0) {
            return -1;
        }
        if (exponentiation == 0) {
            return 1;
        }
        if (exponentiation == 1) {
            return num;
        }
        return num * recursion(num, exponentiation - 1);
    }
}
