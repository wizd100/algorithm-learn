package doit.chap01;

import java.util.Scanner;

public class q16 {
    static void spira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = i; k <= n; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.print("n : ");
        n = stdIn.nextInt();
        spira(n);
    }
}
