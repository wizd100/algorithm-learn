package doit.chap03;

import java.util.Scanner;

public class Q4 {
    static int binarySearch(int[] a, int n, int key) {
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("요소수 : ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = scanner.nextInt();
        }

        System.out.print("찾을 값 : ");
        int key = scanner.nextInt();

        int idx = binarySearch(a, n, key);

        if (idx != -1) {
            System.out.println(key + "는 a[" + idx + "]에 있습니다");
        } else {
            System.out.println("찾는 값이 없습니다");
        }
    }
}
