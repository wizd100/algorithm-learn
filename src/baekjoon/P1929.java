package baekjoon;

import java.util.Scanner;

public class P1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] number = new int[N + 1];

        number[1]++;
        for (int i = 2; i <= N / 2; i++) {
            number[i * 2]++;
        }
        for (int i = 3; i <= N / 3; i++) {
            number[i * 3]++;
        }
        for (int i = 5; i <= N / 5; i++) {
            number[i * 5]++;
        }
        for (int i = 7; i <= N / 7; i++) {
            number[i * 7]++;
        }

        for (int i = 2; i * i <= N; i++) {
            if (number[i] > 0) {
                continue;
            }

            for (int j = 2; j <= N / i; j++) {
                number[i * j]++;
            }
        }

        /*for (int i = 2; i * i <= number.length; i++) {
            if (number[i] == 1) {
                continue;
            }
            for (int j = i * 2; j < number.length; j += 2) {
                number[j]++;
            }
            for (int j = i * 3; j < number.length; j += 3) {
                number[j]++;
            }
            for (int j = i * 5; j < number.length; j += 5) {
                number[j]++;
            }
            for (int j = i * 7; j < number.length; j += 7) {
                number[j]++;
            }
            for (int j = i * i; j < number.length; j = i * i) {
                number[j]++;
            }
        }*/

        for (int i = M; i <= N; i++) {
            if (number[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
