package codeup;

import java.util.Scanner;

public class p1024 {
    public static void main(String[] args) {
        String inputStr;

        Scanner scanner = new Scanner(System.in);
        inputStr = scanner.nextLine();
        for (int i = 0; i < inputStr.length(); i++) {
            System.out.printf("\'%s\'\n", inputStr.substring(i, i + 1));
        }
    }
}
