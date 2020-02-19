package codeup;

import java.util.Scanner;

public class p1037 {
    public static void main(String[] args) {
        int inputAscii;
        String convertStr;

        Scanner scanner = new Scanner(System.in);
        inputAscii = scanner.nextInt();
        convertStr = Character.toString((char)inputAscii);
        System.out.printf("%s", convertStr);
        //System.out.printf("%c", inputAscii); //이 방법도 가능
    }
}
