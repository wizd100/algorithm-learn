package codeup;

import java.util.Scanner;

public class p1060 {
    public static void main(String[] args) {
        int inputNum1;
        int inputNum2;

        Scanner scanner = new Scanner(System.in);
        inputNum1 = scanner.nextInt();
        inputNum2 = scanner.nextInt();

        System.out.printf("%d", inputNum1 & inputNum2);
    }
}
