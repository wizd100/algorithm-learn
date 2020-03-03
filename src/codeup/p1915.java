package codeup;

import java.util.Scanner;

public class p1915 {
    public static void main(String[] args) {
        int fibonacci;
        int maxCount;

        Scanner scanner = new Scanner(System.in);
        maxCount = scanner.nextInt();
        fibonacci = recursion(maxCount);
        System.out.printf("%d", fibonacci);
    }

    public static int recursion(int maxCount) {
        if (maxCount == 0) {
            return 0;
        }
        if (maxCount == 1) {
            return 1;
        }

        return recursion(maxCount - 1) + recursion(maxCount - 2);
    }
}
