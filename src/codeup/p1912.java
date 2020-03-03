package codeup;

import java.util.Scanner;

public class p1912 {
    public static void main(String[] args) {
        int factorial;

        Scanner scanner = new Scanner(System.in);
        factorial = recursion(scanner.nextInt());
        System.out.printf("%d", factorial);
    }

    public static int recursion(int num) {
        if (num == 1) {
            return num;
        }
        return num * recursion(num - 1);
    }
}
