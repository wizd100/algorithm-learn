package baekjoon;

import java.util.Scanner;

public class P10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] H = new int[T];
        int[] W = new int[T];
        int[] N = new int[T];

        for (int i = 0; i < T; i++) {
            H[i] = sc.nextInt();
            W[i] = sc.nextInt();
            N[i] = sc.nextInt();
        }

        for (int i = 0; i < T; i++) {
            //N 번째 방번호 찾기
            //호를 고정으로 하고 층만 올라감
            System.out.println(searchRoom(H[i], W[i], N[i]));
        }
    }

    public static int searchRoom(int H, int W, int N) {
        int count = 1;

        for (int k = 1; k <= W; k++) {
            for (int j = 1; j <= H; j++) {
                if (N == count) {
                    return Integer.parseInt(String.format("%d%02d", j, k));
                }
                count++;
            }
        }

        return 0;
    }
}
