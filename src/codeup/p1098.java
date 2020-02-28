package codeup;

import java.util.Scanner;

public class p1098 {
    public static void main(String[] args) {
        int[][] stickMap;
        int stickCount;
        int[] stickLength;
        int[] stickDirection;
        int x;
        int y;

        Scanner scanner = new Scanner(System.in);
        stickMap = new int[scanner.nextInt() + 1][scanner.nextInt() + 1];
        stickCount = scanner.nextInt();
        stickLength = new int[stickCount];
        stickDirection = new int[stickCount];

        for (int i = 0; i < stickCount; i++) {
            stickLength[i] = scanner.nextInt();
            stickDirection[i] = scanner.nextInt();

            x = scanner.nextInt();
            y = scanner.nextInt();
            stickMap[x][y] = 1;

            //방향 0 -> x , 1 -> y
            if (stickDirection[i] == 0) {
                for (int j = 1; j < stickLength[i]; j++) {
                    stickMap[x][y + j] = 1;
                }
            }
            if (stickDirection[i] == 1) {
                for (int j = 1; j < stickLength[i]; j++) {
                    stickMap[x + j][y] = 1;
                }
            }
        }

        for (int i = 1; i < stickMap.length; i++) {
            for (int j = 1; j < stickMap[i].length; j++) {
                System.out.printf("%d ", stickMap[i][j]);
            }
            System.out.print("\n");
        }
    }
}
