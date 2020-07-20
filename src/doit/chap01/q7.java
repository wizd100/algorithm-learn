package doit.chap01;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 7까지 총합 출력");
        System.out.print("n값 입력 : ");
        int n = stdIn.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print(" + ");
            }
        }

        System.out.print(" = " + sum);
    }
}
