package codeup;

import java.util.Scanner;

public class p1048 {
    public static void main(String[] args) {
        int inputNum1;
        int inputNum2;
        double answer;

        Scanner scanner = new Scanner(System.in);
        inputNum1 = scanner.nextInt();
        inputNum2 = scanner.nextInt();

        answer = inputNum1 * Math.pow(2, inputNum2);

        System.out.printf("%.0f", answer);
    }
}
