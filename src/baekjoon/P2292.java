package baekjoon;

import java.util.Scanner;

public class P2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = 2;
        int end = 7;
        int plus = 6;
        int count = 2;
        int N = sc.nextInt();

        if (N == 1) {
            System.out.println(1);
            return;
        }

        while (true) {
            if (start <= N && end >= N) {
                System.out.println(count);
                break;
            }

            count++;
            plus += 6;
            start = end + 1;
            end += plus;
        }
    }
}
