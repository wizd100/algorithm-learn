package codeup;

import java.util.Scanner;

public class p1065 {
    public static void main(String[] args) {
        int inputNum1;
        int inputNum2;
        int inputNum3;

        Scanner scanner = new Scanner(System.in);
        inputNum1 = scanner.nextInt();
        inputNum2 = scanner.nextInt();
        inputNum3 = scanner.nextInt();

        if (inputNum1 % 2 == 0) {
            System.out.printf("%d\n", inputNum1);
        }

        if (inputNum2 % 2 == 0) {
            System.out.printf("%d\n", inputNum2);
        }

        if (inputNum3 % 2 == 0) {
            System.out.printf("%d\n", inputNum3);
        }
    }
}
