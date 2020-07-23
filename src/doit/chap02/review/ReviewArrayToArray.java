package doit.chap02.review;

import java.util.Scanner;

public class ReviewArrayToArray {
    static boolean equals(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    //a배열의 요소값을 b배열에 복사
    static void copy(int[] a, int[] b) {
        int num = a.length <= b.length ? a.length : b.length;
        for (int i = 0; i < num; i++) {
            b[i] = a[i];
        }
    }

    //a배열의 요소값을 b배열에 역순으로 복사
    static void rcopy(int[] a, int[] b) {
        int num = a.length <= b.length ? a.length : b.length;
        for (int i = 0; i < num; i++) {
            b[i] = a[a.length - i - 1];
        }
    }

    static int cardConv(int n, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        while (n != 0) {
            d[digits++] = dchar.charAt(n % r);
            n /= r;
        }

        return digits;
    }

    //보기 편하게 앞번호 부터 집어넣게끔
    static int cardConvRev(int n, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        while (n != 0) {
            d[digits++] = dchar.charAt(n % r);
            n /= r;
        }

        for (int i = 0; i < digits / 2; i++) {
            char temp = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = temp;
        }

        return digits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a 배열 : ");
        int na = scanner.nextInt();
        int[] a = new int[na];
        for (int i = 0; i < na; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = scanner.nextInt();
        }

        System.out.print("b 배열 : ");
        int nb = scanner.nextInt();
        int[] b = new int[nb];
        for (int i = 0; i < nb; i++) {
            System.out.print("b[" + i + "] : ");
            b[i] = scanner.nextInt();
        }

        System.out.println("a와 b는 " + (equals(a, b) ? "같다" : "같지않다"));

        System.out.println("a배열 요소값을 b배열에 복사");
        copy(a, b);
        for (int i = 0; i < na; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < nb; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        System.out.println("a배열 요소값을 b배열에 역순으로 복사");
        rcopy(a, b);
        for (int i = 0; i < na; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < nb; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        System.out.println("10진수를 2~36진수로 변환하는 함수");
        System.out.print("10진수 입력 : ");
        int n = scanner.nextInt();
        System.out.print("변환할려는 진수값 입력 : ");
        int r = scanner.nextInt();
        char[] d = new char[32];
        System.out.print(n + " 의 " + r + "진수 -> ");
        int dno = cardConv(n, r, d);
        for (int i = dno - 1; i >= 0; i--) {
            System.out.print(d[i]);
        }

        System.out.println();
        int dno2 = cardConvRev(n, r, d);
        for (int i = 0; i < dno2; i++) {
            System.out.print(d[i]);
        }
    }
}
