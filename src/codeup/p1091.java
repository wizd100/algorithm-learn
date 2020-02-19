package codeup;

import java.util.Scanner;

public class p1091 {
    public static void main(String[] args) {
        long startNum;
        long multiplyNum;
        long plusNum;
        long timesNum;

        Scanner scanner = new Scanner(System.in);
        startNum = scanner.nextLong();
        multiplyNum = scanner.nextLong();
        plusNum = scanner.nextLong();
        timesNum = scanner.nextLong();

        for (int i = 0; i < timesNum - 1; i++) {
            startNum =  startNum * multiplyNum + plusNum;
        }

        System.out.printf("%d", startNum);
    }
}
