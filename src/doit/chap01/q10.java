package doit.chap01;

import java.util.Scanner;

public class q10 {
    //a, b 정수를 입력 받고 b - a 값을 출력 (단 b < a 일 수 없다)
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a;
        int b;
        int result;

        System.out.print("a 값 입력 : ");
        a = stdIn.nextInt();

        System.out.print("b 값 입력 : ");
        b = stdIn.nextInt();

        while (b <= a) {
            System.out.println("a보다 큰 값을 입력하세요");
            System.out.print("b 값 입력 : ");
            b = stdIn.nextInt();
        }

        result = b - a;

        System.out.println(b + " - " + a + " = " + result);
    }
}
