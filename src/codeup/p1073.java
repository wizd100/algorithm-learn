package codeup;

import java.util.Scanner;

public class p1073 {
    public static void main(String[] args) {
        int inputNum;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            inputNum = scanner.nextInt();

            if (inputNum == 0) {
                break;
            }

            System.out.println(inputNum);
        }
    }
}
