package codeup;

import java.util.Scanner;

public class p1067 {
    public static void main(String[] args) {
        int inputNum1;

        Scanner scanner = new Scanner(System.in);
        inputNum1 = scanner.nextInt();

        if (inputNum1 > 0) {
            System.out.println("plus");
        } else {
            System.out.println("minus");
        }

        if (inputNum1 % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
