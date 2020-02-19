package codeup;

import java.util.Scanner;

public class p1034 {
    public static void main(String[] args) {
        String inputOctal;
        int decimalNum;

        Scanner scanner = new Scanner(System.in);
        inputOctal = scanner.nextLine();
        decimalNum = Integer.valueOf(inputOctal, 8);
        System.out.printf("%d", decimalNum);
    }
}
