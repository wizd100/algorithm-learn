package doit.chap04;

import java.util.Scanner;

public class LastNElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int N = 10;
        int[] a = new int[N];
        int cnt = 0;
        int retry = 1;

        System.out.print("정수를 입력하세요 : ");

        while (retry == 1) {
            System.out.printf("%d 번째 정수", cnt + 1);
            a[cnt++ % N] = scanner.nextInt();

            System.out.print("계속 할까요? (1.예 0.아니오) : ");
            retry = scanner.nextInt();
        }

        int i = cnt - N;
        if (i < 0) {
            i = 0;
        }

        for (; i < cnt; i++) {
            System.out.printf("%2d번째의 정수 = %d\n", i + 1, a[i % N]);
        }
    }
}
