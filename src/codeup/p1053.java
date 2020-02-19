package codeup;

import java.util.Scanner;

public class p1053 {
    public static void main(String[] args) {
        int inputNum;

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();

        System.out.printf("%d", inputNum ^ 1);
    }
}
