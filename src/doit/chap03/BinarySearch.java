package doit.chap03;

import java.util.Scanner;

public class BinarySearch {
    static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;

        while (pl <= pr) {
            int pc = (pl + pr) / 2;
            if (a[pc] == key) {
                return pc;
            } else if (a[pc] < key) { // 검색 범위를 뒤쪽 절반으로 좁힘
                pl = pc + 1;
            } else {
                pr = pc - 1; // 검색 범위를 앞쪽 절반으로 좁힘 a[pc] > key
            }
        }

        return -1; //검색 실패
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요");

        System.out.print("x[0] : ");
        x[0] = scanner.nextInt();

        for (int i = 1; i < num; i++) {
            while (x[i] < x[i - 1]) { // 바로 앞에 있는 요소값 보다 작으면 다시 입력
                System.out.print("x[" + i + "] : ");
                x[i] = scanner.nextInt();
            }
        }

        System.out.print("검색할 값 : ");
        int ky = scanner.nextInt();

        int idx = binSearch(x, num, ky);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다");
        } else {
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다");
        }
    }
}
