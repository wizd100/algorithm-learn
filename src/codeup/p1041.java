package codeup;

import java.util.Scanner;

public class p1041 {
    public static void main(String[] args) {
        String inputStr;
        int convertAscii;
        String nextStr;

        Scanner scanner = new Scanner(System.in);
        inputStr = scanner.nextLine();
        convertAscii = (int)inputStr.charAt(0);

        nextStr = Character.toString((char)(convertAscii + 1));

        System.out.printf("%s", nextStr);
    }
}
