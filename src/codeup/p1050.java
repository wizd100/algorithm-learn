package codeup;

import java.util.Scanner;

public class p1050 {
    public static void main(String[] args) {
        int inputNum1;
        int inputNum2;

        Scanner scanner = new Scanner(System.in);
        inputNum1 = scanner.nextInt();
        inputNum2 = scanner.nextInt();

        if (inputNum1 == inputNum2) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}
