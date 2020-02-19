package codeup;

import java.util.Scanner;

public class p1085 {
    public static void main(String[] args) {
        long hz;
        long bit;
        long channel;
        long sec;
        double size = 0;
        double MB;

        Scanner scanner = new Scanner(System.in);
        hz = scanner.nextInt();
        bit = scanner.nextInt();
        channel = scanner.nextInt();
        sec = scanner.nextInt();

        size = hz * bit * channel * sec;
        MB = 8 * 1024 * 1024;

        System.out.printf("%.1f MB", (size / MB));
    }
}
