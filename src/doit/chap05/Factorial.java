package doit.chap05;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력 : ");
        int x = scanner.nextInt();

        System.out.println(x + "의 팩토리얼은 " + factorial(x) + " 입니다");
    }
}
