package codeup;

import java.util.Scanner;

public class p1097 {
    public static void main(String[] args) {
        int[][] inputGo = new int[20][20];
        int reverseNum;
        int[][] reverseMap = new int[20][20];
        int x;
        int y;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < inputGo.length; i++) {
            for (int j = 1; j < inputGo[i].length; j++) {
                inputGo[i][j] = scanner.nextInt();
            }
        }

        reverseNum = scanner.nextInt();

        for (int i = 0; i < reverseNum; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();

            for (int j = 1; j < inputGo.length; j++) {
                if (inputGo[x][j] == 0) {
                    inputGo[x][j] = 1;
                } else {
                    inputGo[x][j] = 0;
                }
            }

            for (int j = 1; j < inputGo.length; j++) {
                if (inputGo[j][y] == 0) {
                    inputGo[j][y] = 1;
                } else {
                    inputGo[j][y] = 0;
                }
            }
        }

        for (int i = 1; i < inputGo.length; i++) {
            for (int j = 1; j < inputGo[i].length; j++) {
                System.out.printf("%d ", inputGo[i][j]);
            }
            System.out.print("\n");
        }

        /*for (int i = 0; i < reverseNum; i++) {
            reverseMap[scanner.nextInt()][scanner.nextInt()] = 1;
        }

        for (int i = 1; i < inputGo.length; i++) {
            for (int j = 1; j < inputGo[i].length; j++) {
                if (inputGo[i][j] != reverseMap[i][j]) {
                    inputGo[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < inputGo.length; i++) {
            for (int j = 1; j < inputGo[i].length; j++) {
                System.out.printf("%d ", inputGo[i][j]);
            }
            System.out.print("\n");
        }*/
    }
}
