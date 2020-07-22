package doit.chap02;

import java.util.Random;

public class Q3 {
    static int sumOf(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Random random = new Random();

        int[] a = new int[random.nextInt(10)];

        System.out.println("요소의 수 : " + a.length);

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
            System.out.println("a[" + i + "] : " + a[i]);
        }

        System.out.println("요소의 총합은 : " + sumOf(a));
    }
}
