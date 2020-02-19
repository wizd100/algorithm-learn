package codeup;

import java.util.Scanner;

public class p1081 {
    public static void main(String[] args) {
        int n;
        int m;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.printf("%d %d\n", i, j);
            }
        }
    }
}
