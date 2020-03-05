package codeup;

import java.util.Scanner;

public class p1915 {
    static int[] memo = new int[201];

    public static void main(String[] args) {
        int fibonacci;
        int maxCount;

        Scanner scanner = new Scanner(System.in);
        maxCount = scanner.nextInt();
        fibonacci = recursion(maxCount);
        System.out.printf("%d", fibonacci);
    }

    public static int recursion(int maxCount) {
        if (maxCount == 1 || maxCount == 2) {
            return 1;
        }

        if (memo[maxCount] != 0) {
            return memo[maxCount];
        }

        return memo[maxCount] = (recursion(maxCount - 1) + recursion(maxCount - 2)) % 10009;
    }
}
