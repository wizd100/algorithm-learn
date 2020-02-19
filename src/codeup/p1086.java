package codeup;

import java.util.Scanner;

public class p1086 {
    public static void main(String[] args) {
        long width;
        long height;
        long bit;
        double size = 0;
        double MB;

        Scanner scanner = new Scanner(System.in);
        width = scanner.nextLong();
        height = scanner.nextLong();
        bit = scanner.nextLong();

        size = width * height * bit;
        MB = 8 * 1024 * 1024;

        System.out.printf("%.2f MB", size / MB);
    }
}
