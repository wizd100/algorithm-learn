package codeup;

import java.util.Scanner;

public class p1093 {
    public static void main(String[] args) {
        int inputNum;
        int[] inputNumArr;

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();
        inputNumArr = new int[inputNum];

        for (int i = 0; i < inputNum; i++) {
            inputNumArr[i] = scanner.nextInt();
        }

        for (int i = 1; i <= 23; i++) {
            int count = 0;

            for (int j = 0; j < inputNumArr.length; j++) {
                if (i == inputNumArr[j]) {
                    count++;
                }
            }

            System.out.printf("%d ", count);
        }

    }
}
