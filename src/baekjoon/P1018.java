package baekjoon;

import java.util.Scanner;

public class P1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        String[] board = new String[N];

        int min = 64;
        int count;

        sc.nextLine();

        for (int i = 0; i < N; i++) {
            board[i] = sc.nextLine();
        }

        //8 * 8 잘라서 최소값 찾기
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                count = compareBoard(board, i, j);
                if (min > count) {
                    min = count;
                }
            }
        }


        System.out.println(min);
    }

    public static int compareBoard(String[] board, int x, int y) {
        int count = 0;
        char[][] chessBoard = new char[8][8];
        boolean whiteBlack = true; //true -> W, false -> B

        //첫글자 확인
        if (board[x].charAt(y) == 'B') {
            whiteBlack = false;
        }

        //체스판 만들기
        for (int i = 0; i < 8; i++) {
            if (i >= 1) {
                whiteBlack = !whiteBlack;
            }
            for (int j = 0; j < 8; j++) {
                if (whiteBlack) {
                    chessBoard[i][j] = 'W';
                    whiteBlack = false;
                } else {
                    chessBoard[i][j] = 'B';
                    whiteBlack = true;
                }
            }
        }

        /*for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }*/

        System.out.println("start");
        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                System.out.print(board[i].charAt(j));
            }
            System.out.println();
        }
        System.out.println(":");
        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                System.out.print(chessBoard[i - x][j - y]);
            }
            System.out.println();
        }

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (board[i].charAt(j) != chessBoard[i - x][j - y]) {
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println("end");


        return count;
    }
}
