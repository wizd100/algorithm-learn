package codeup;

import java.util.Scanner;

public class p1074 {
    public static void main(String[] args) {
        int inputNum;

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();

        while (inputNum != 0) {
            System.out.println(inputNum);
            inputNum--;
        }
    }
}
