package doit.chap03;

import java.util.Scanner;

public class Q1 {
    // 보초법 선형검색을 for문으로
    static int seqSearchSen(int[] a, int n, int key) {
        int i;

        a[n] = key; // 보초법 맨뒤에 값을 입력


        for (i = 0; a[i] != key; i++) {

        }

        //System.out.println(a.length + " " + n + " " + i);

        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요소값 : ");
        int num = scanner.nextInt();
        int[] a = new int[num + 1]; // 보초법

        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = scanner.nextInt();
        }

        System.out.print("검색할 값 입력 : ");
        int ky = scanner.nextInt();

        int idx = seqSearchSen(a, num, ky);

        if (idx == -1) {
            System.out.println("검색 값이 없습니다");
        } else {
            System.out.println(ky + " 값이 a[" + idx + "]에 있습니다");
        }
    }
}
