package doit.chap05;

import java.util.Scanner;

public class EuclidGCD {
    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력 : ");
        int x = scanner.nextInt();
        System.out.print("정수를 입력 : ");
        int y = scanner.nextInt();

        System.out.println("최대공약수는 " + gcd(x, y) + " 입니다");
    }
}
