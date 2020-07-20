package doit.chap01;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n;
        int digit = 0;

        System.out.println("자리수 출력");
        do {
            System.out.print("n 값 입력 : ");
            n = stdIn.nextInt();
        } while (n < 0);

        while (n > 0) {
            n /= 10;
            digit++;
        }

        System.out.println("그 수는 " + digit + "자리입니다");

    }
}
