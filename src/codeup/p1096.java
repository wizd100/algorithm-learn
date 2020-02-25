package codeup;

import java.util.Scanner;

public class p1096 {
    public static void main(String[] args) {
        int inputNum;
        int[][] inputNumArr;
        int[][] go = new int[19][19];

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();
        inputNumArr = new int[19][2];

        //좌표값 입력
        for (int i = 0; i < inputNum; i++) {
            inputNumArr[i][0] = scanner.nextInt() - 1;
            inputNumArr[i][1] = scanner.nextInt() - 1;
        }

        for (int i = 0; i < go.length; i++) {
            for (int j = 0; j < go[i].length; j++) {
                if (inputNumArr[i][0] == i && inputNumArr[i][1] == j) {
                    System.out.printf("%d ", 1);
                } else {
                    System.out.printf("%d ", 0);
                }
            }
            System.out.print("\n");
        }
    }
}
