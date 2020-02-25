package codeup;

import java.util.Scanner;

public class p1096 {
    public static void main(String[] args) {
        int inputNum;
        int[][] map = new int[20][20];

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();

        for (int i = 0; i < inputNum; i++) {
            map[scanner.nextInt()][scanner.nextInt()] = 1;
        }

        for (int i = 1; i < map.length; i++) {
            for (int j = 1; j < map[i].length; j++) {
                System.out.printf("%d ", map[i][j]);
            }
            System.out.print("\n");
        }
    }
}
