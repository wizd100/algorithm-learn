package codeup;

import java.util.Scanner;

public class p1079 {
    public static void main(String[] args) {
        String inputStr;
        String[] inputStrArr;

        Scanner scanner = new Scanner(System.in);
        inputStr = scanner.nextLine();
        inputStrArr = inputStr.split(" ");

        for (int i = 0; i < inputStrArr.length; i++) {
            if (inputStrArr[i].equals("q")) {
                System.out.printf("%s\n", inputStrArr[i]);
                break;
            }
            System.out.printf("%s\n", inputStrArr[i]);
        }
    }
}
