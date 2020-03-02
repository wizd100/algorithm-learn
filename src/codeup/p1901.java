package codeup;

import java.util.Scanner;

public class p1901 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        recursion(1, scanner.nextInt());
    }

    public static void recursion(int count, int maxNum) {
        if (count > maxNum) {
            return;
        }

        System.out.println(count);
        recursion(count + 1, maxNum);
    }
}
