package doit.chap02;

import java.util.Random;

public class Q5 {
    static void swap(int[] b, int idx1, int idx2) {
        int temp = b[idx1];
        b[idx1] = b[idx2];
        b[idx2] = temp;
    }

    static void reverse(int[] b) {
        for (int i = 0; i < b.length / 2; i++) {
            swap(b, i, b.length - i - 1);
        }
    }

    static void rcopy(int[] a, int[] b) {
        reverse(b);

        int num = a.length <= b.length ? a.length : b.length;
        for (int i = 0; i < num; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int na = random.nextInt(10);
        int nb = random.nextInt(10);
        int[] a = new int[na];
        int[] b = new int[nb];

        for (int i = 0; i < na; i++) {
            a[i] = random.nextInt(100);
        }
        for (int i = 0; i < nb; i++) {
            b[i] = random.nextInt(100);
        }

        System.out.println("a의 요소 : " + na);
        for (int i = 0; i < na; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        System.out.println("b의 요소 : " + nb);
        for (int i = 0; i < nb; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        rcopy(a, b);

        System.out.println("a의 요소 : " + na);
        for (int i = 0; i < na; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        System.out.println("b의 요소 : " + nb);
        for (int i = 0; i < nb; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
