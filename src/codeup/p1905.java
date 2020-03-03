package codeup;

import java.util.Scanner;

public class p1905 {
    public static void main(String[] args) {
        int sum;

        Scanner scanner = new Scanner(System.in);
        sum = recursion(scanner.nextInt());
        System.out.printf("%d", sum);
    }

    public static int recursion(int inputNum) {
        if (inputNum == 0) {
            return inputNum;
        }
        return inputNum + recursion(inputNum - 1);
    }
}
