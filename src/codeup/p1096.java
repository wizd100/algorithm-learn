package codeup;

import java.util.Scanner;

public class p1096 {
    public static void main(String[] args) {
        int inputNum;
        int[] x;
        int[] y;
        int[][] go = new int[19][19];

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();
        x = new int[inputNum];
        y = new int[inputNum];

        for (int i = 0; i < inputNum; i++) {
            x[i] = scanner.nextInt() - 1;
            y[i] = scanner.nextInt() - 1;
        }

        for (int i = 0; i < go.length; i++) {
            for (int j = 0; j < go[i].length; j++) {
                boolean flag = false;

                for (int k = 0; k < inputNum; k++) {
                    if (i == x[k] && j == y[k]) {
                        flag = true;
                    }
                }

                if (flag) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.print("\n");
        }
    }
}
