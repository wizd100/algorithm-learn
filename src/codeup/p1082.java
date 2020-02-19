package codeup;

import java.util.Scanner;

public class p1082 {
    public static void main(String[] args) {
        String inputHex;
        int convertDecimal; //16진수를 10진수로 변환 변수

        Scanner scanner = new Scanner(System.in);
        inputHex = scanner.nextLine();
        convertDecimal = Integer.valueOf(inputHex, 16); //16진수를 10진수로 변환

        for (int i = 1; i <= 15; i++) {
            System.out.printf("%s*%X=%X\n", inputHex, i, convertDecimal * i);
        }
    }
}
