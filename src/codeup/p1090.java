package codeup;

import java.util.Scanner;

public class p1090 {
    public static void main(String[] args) {
        long startNum;
        long multiplyNum;
        long timesNum;

        Scanner scanner = new Scanner(System.in);
        startNum = scanner.nextLong();
        multiplyNum = scanner.nextLong();
        timesNum = scanner.nextLong();

        for (int i = 0; i < timesNum - 1; i++) {
            startNum *= multiplyNum;
        }

        System.out.printf("%d", startNum);
    }
}
