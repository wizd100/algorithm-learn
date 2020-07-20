package doit.chap01;

import java.util.Scanner;

public class q8 {
    //가우스 덧셈을 이용한 방법
    static int gaus(int n) {
        int sum;

        /*if (n % 2 == 0) {
            sum = (n + 1) * (n / 2);
        } else {
            sum = n * ((n - 1) / 2) + n;
        }*/

        sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);

        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("가우스 덧셈공식을 이용한 1부터 n값의 총합 계산");
        System.out.print("n 값 입력 : ");
        int n = stdIn.nextInt();

        System.out.println("1부터 " + n + "값의 총합 : " + gaus(n));
    }
}
