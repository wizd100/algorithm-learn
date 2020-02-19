package codeup;

import java.util.Scanner;

public class p1068 {
    public static void main(String[] args) {
        int inputNum;

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();

        if (inputNum >= 90 && inputNum <= 100) {
            System.out.print("A");
        } else if (inputNum >= 70 && inputNum <= 89) {
            System.out.print("B");
        } else if (inputNum >= 40 && inputNum <= 69) {
            System.out.print("C");
        } else if (inputNum >= 0 && inputNum <= 39) {
            System.out.print("D");
        }
    }
}
