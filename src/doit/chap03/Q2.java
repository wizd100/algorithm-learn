package doit.chap03;

import java.util.Scanner;

public class Q2 {
    static int linearSearch(int[] a, int n, int key) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.printf(" *\n");

            for (int j = 0; j < n; j++) {
                System.out.printf("%2d", a[j]);
            }
            System.out.println();

            if (a[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요소값 : ");
        int num = scanner.nextInt();
        int[] a = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = scanner.nextInt();
        }

        System.out.print("찾을 값 : ");
        int ky = scanner.nextInt();

        int idx = linearSearch(a, num, ky);

        if (idx == -1) {
            System.out.println("찾는 값이 없습니다");
        } else {
            System.out.println(ky + "은 a[" + idx + "]에 있습니다");
        }
    }
}
