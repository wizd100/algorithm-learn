package codeup;

import java.util.Scanner;

public class p1089 {
    public static void main(String[] args) {
        int startNum;
        int plusNum;
        int timesNum;

        Scanner scanner = new Scanner(System.in);
        startNum = scanner.nextInt();
        plusNum = scanner.nextInt();
        timesNum = scanner.nextInt();

        for (int i = 0; i < timesNum - 1; i++) {
            startNum += plusNum;
        }

        System.out.printf("%d", startNum);
    }
}
