package doit.chap03;

import java.util.Scanner;

public class Q3 {
    //요소수 n인 배열 a에서 key와 일치하는 모든 요소 인덱스를 배열 idx에 저장하고 반환
    //1, 2, 3, 2, 5, 2 에서 2를 검색 -> 1, 3, 5 반환
    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                idx[counter++] = i;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요소값 : ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = scanner.nextInt();
        }

        System.out.print("검색할 값 : ");
        int key = scanner.nextInt();

        int[] idx = new int[n];
        int count = searchIdx(a, n, key, idx);

        System.out.println("총 요소값 : " + count);
        for (int i = 0; i < count; i++) {
            System.out.print(idx[i] + " ");
        }
    }
}
