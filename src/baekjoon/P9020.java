package baekjoon;

import java.util.Scanner;

public class P9020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseMax = 10000;
        boolean[] number = new boolean[caseMax + 1];
        StringBuilder sb = new StringBuilder();

        number[0] = true;
        number[1] = true;
        for (int i = 2; i * i <= caseMax; i++) {
            if (number[i]) {
                continue;
            }
            for (int j = i + i; j <= caseMax; j += i) {
                number[j] = true;
            }
        }

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();

            int[] result = partition(number, n);

            sb.append(result[0] + " " + result[1]);
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static int[] partition(boolean[] number, int n) {
        int min = n;
        int[] result = new int[2];

        for (int i = 2; i <= n; i++) {
            if (number[i]) {
                continue;
            }
            for (int j = i; j <= n; j++) {
                if (number[j]) {
                    continue;
                }
                if (i + j == n) {
                    if (min > j - i) {
                        min = j - i;
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
        }

        return result;
    }
}
