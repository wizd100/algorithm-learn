package doit.chap02;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
    static int maxOf(int[] a) {
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Random random = new Random();
        //Scanner scanner = new Scanner(System.in);


        System.out.println("키의 최대값 구하기");
        int num = random.nextInt(10);
        System.out.println("사람 수 : " + num);
        int[] height = new int[num];

        for (int i = 0; i < num; i++) {
            height[i] = random.nextInt(90);
            System.out.println("height[" + i + "] : " + height[i]);
        }

        System.out.println("최대값은 " + maxOf(height) + "입니다");
    }
}
