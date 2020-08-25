package codeforces;

import java.util.Scanner;

public class P231A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        int count = 0;

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int flag = 0;

            for (int j = 0; j < arr.length; j++) {
                arr[j] = scanner.nextInt();
            }

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 1) {
                    flag++;
                }
                if (flag >= 2) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
