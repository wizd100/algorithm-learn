package doit.chap03;

import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        System.out.println("오름차순으로 입력");

        System.out.print("x[0] : ");
        a[0] = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = scanner.nextInt();
        }

        System.out.print("검색할 값 : ");
        int key = scanner.nextInt();

        int idx = Arrays.binarySearch(a, key);

        if (idx < 0) {
            System.out.println("검색할 값이 없습니다 : ");
        } else {
            System.out.println(key + "는 a[" + idx + "]에 있습니다");
        }

    }
}
