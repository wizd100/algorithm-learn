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


    }
}
