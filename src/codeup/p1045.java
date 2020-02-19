package codeup;

import java.util.Scanner;

public class p1045 {
    public static void main(String[] args) {
        float inputNum1;
        float inputNum2;

        Scanner scanner = new Scanner(System.in);
        inputNum1 = scanner.nextFloat();
        inputNum2 = scanner.nextFloat();

        System.out.printf("%.0f\n", inputNum1 + inputNum2);
        System.out.printf("%.0f\n", inputNum1 - inputNum2);
        System.out.printf("%.0f\n", inputNum1 * inputNum2);
        System.out.printf("%.0f\n", inputNum1 / inputNum2);
        System.out.printf("%.0f\n", inputNum1 % inputNum2);
        System.out.printf("%.2f\n", inputNum1 / inputNum2);
    }
}
