package codeup;

import java.util.Scanner;

public class p1046 {
    public static void main(String[] args) {
        int inputNum1;
        int inputNum2;
        int inputNum3;
        int sum;
        float average;

        Scanner scanner = new Scanner(System.in);
        inputNum1 = scanner.nextInt();
        inputNum2 = scanner.nextInt();
        inputNum3 = scanner.nextInt();

        sum = inputNum1 + inputNum2 + inputNum3;
        average = (float)sum / 3;

        System.out.printf("%d\n", sum);
        System.out.printf("%.1f", average);
    }
}
