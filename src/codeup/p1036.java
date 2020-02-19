package codeup;

import java.util.Scanner;

public class p1036 {
    public static void main(String[] args) {
        String inputStr;
        char convertChar;
        int ascii;

        Scanner scanner = new Scanner(System.in);
        inputStr = scanner.nextLine();
        convertChar = inputStr.charAt(0);
        ascii = (int)convertChar;
        System.out.printf("%d", ascii);
    }
}
