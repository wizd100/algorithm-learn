package codeup;

import java.util.Scanner;

public class p1075 {
    public static void main(String[] args) {
        int inputNum;

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();

        while (inputNum != 0) {
            inputNum--;
            System.out.println(inputNum);
        }
    }
}
