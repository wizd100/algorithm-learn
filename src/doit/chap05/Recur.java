package doit.chap05;

import java.util.Scanner;

public class Recur {
    static void recur(int n) {
        if (n > 0) {
            recur(n - 1);
            System.out.println(n);
            recur(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력 : ");
        int x = scanner.nextInt();

        recur(x);
    }
}
