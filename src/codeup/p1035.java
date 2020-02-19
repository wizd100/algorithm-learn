package codeup;

import java.util.Scanner;

public class p1035 {
    public static void main(String[] args) {
        String inputHex;
        String octal;
        int decimal;

        Scanner scanner = new Scanner(System.in);
        inputHex = scanner.nextLine();
        decimal = Integer.valueOf(inputHex, 16);
        octal = Integer.toOctalString(decimal);
        System.out.printf("%s", octal);
    }
}
