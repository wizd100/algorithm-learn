package codeup;

import java.util.Scanner;

public class p1072 {
    public static void main(String[] args) {
        int inputNum1;
        int inputNum2;

        Scanner scanner = new Scanner(System.in);
        inputNum1 = scanner.nextInt();

        for (int i = 0; i < inputNum1; i++) {
            inputNum2 = scanner.nextInt();
            System.out.println(inputNum2);
        }
    }
}
