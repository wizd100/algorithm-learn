package codeup;

import java.util.Scanner;

public class p1099 {
    public static void main(String[] args) {
        int[][] map = new int[11][11];
        int x = 2;
        int y = 2;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < map.length; i++) {
            for (int j = 1; j < map[i].length; j++) {
                map[i][j] = scanner.nextInt();
            }
        }

        //시작지점은 2,2
        while (true) {
            //0일 경우 9로 표시
            if (map[x][y] == 0) {
                map[x][y] = 9;
                y++;
                continue;
            }
            //오른쪽 벽 1 이 있을 경우
            if (map[x][y] == 1) {
                x++;
                y--;
                //밑에도 벽 1 이 있을 경우 종료
                if (map[x][y] == 1) {
                    break;
                }
                continue;
            }
            //2일 경우 종료
            if (map[x][y] == 2) {
                map[x][y] = 9;
                break;
            }
        }

        for (int i = 1; i < map.length; i++) {
            for (int j = 1; j < map[i].length; j++) {
                System.out.printf("%d ", map[i][j]);
            }
            System.out.print("\n");
        }
    }
}
