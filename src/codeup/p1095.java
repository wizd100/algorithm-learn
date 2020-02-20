package codeup;

import java.util.Scanner;

public class p1095 {
    public static void main(String[] args) {
        int inputNum;
        int[] inputNumArr;
        int rowNum;

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();
        inputNumArr = new int[inputNum];

        for (int i = 0; i < inputNum; i++) {
            inputNumArr[i] = scanner.nextInt();
        }

        rowNum = inputNumArr[0];

        for (int i = 0; i < inputNumArr.length; i++) {
            if (rowNum > inputNumArr[i]) {
                rowNum = inputNumArr[i];
            }
        }

        System.out.printf("%d", rowNum);
    }
}
