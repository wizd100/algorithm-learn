package doit.chap02.review;

import java.util.Random;

public class ReviewArray {
    //배열의 요소의 최소값 출력
    static int minOf(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    //배열의 요소의 최대값 출력
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    //배열의 요소의 총합
    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    //배열의 요소를 역순으로 변경
    static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    static int[] reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
        return a;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10);

        int[] a = new int[num];

        for (int i = 0; i < num; i++) {
            a[i] = random.nextInt(100);
        }

        System.out.println("요소는 : " + num);
        for (int i = 0; i < num; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.println("최소값은 : " + minOf(a));
        System.out.println("최대값은 : " + maxOf(a));
        System.out.println("총합 : " + sumOf(a));
        System.out.println("역순으로 출력");
        reverse(a);
        for (int i = 0; i < num; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
