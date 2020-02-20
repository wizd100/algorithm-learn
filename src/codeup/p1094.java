package codeup;

import java.util.Scanner;

public class p1094 {
    public static void main(String[] args) {
        int inputNum;
        int[] inputNumArr;

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();
        inputNumArr = new int[inputNum];

        for (int i = 0; i < inputNum; i++) {
            inputNumArr[i] = scanner.nextInt();
        }

        for (int i = inputNumArr.length - 1; i >= 0; i--) {
            System.out.printf("%d ", inputNumArr[i]);
        }
    }
}
