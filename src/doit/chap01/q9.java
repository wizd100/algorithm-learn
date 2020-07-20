package doit.chap01;

import java.util.Scanner;

public class q9 {
    //정수 a, b 값을 포함하여 그 사이의 모든 정수의 합을 구하기
    static int sumof(int a, int b) {
        /*int sum = 0;

        if (a > b) {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        } else {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        }

        return sum;*/

        int sum = 0;
        int min;
        int max;

        if (a > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }

        for (int i = min; i <= max; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수 a,b 값을 포함하여 그 사이의 모든 정수의 합을 구하기");
        System.out.print("a 값 입력 : ");
        int a = stdIn.nextInt();
        System.out.print("b 값 입력 : ");
        int b = stdIn.nextInt();

        System.out.println("총합 : " + sumof(a, b));
    }
}
