package codeup;

import java.util.Scanner;

public class p1078 {
    public static void main(String[] args) {
        int inputNum;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();

        for (int i = 0; i <= inputNum; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.printf("%d", sum);
    }
}
