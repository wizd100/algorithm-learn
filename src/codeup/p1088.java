package codeup;

import java.util.Scanner;

public class p1088 {
    public static void main(String[] args) {
        int inputNum;

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();

        for (int i = 1; i <= inputNum; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.printf("%d ", i);
        }
    }
}
