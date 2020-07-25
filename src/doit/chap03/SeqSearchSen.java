package doit.chap03;

import java.util.Scanner;

public class SeqSearchSen {
    //보초법
    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key;

        while (true) {
            if (a[i] == key) {
                break;
            }
            i++;
        }
        return i == n ? -1 : i;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("보초법 이용 선형검색");
        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num + 1]; //보초법으로 배열 1 추가

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = scanner.nextInt();
        int idx = seqSearchSen(x, num, ky);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다");
        } else {
            System.out.println(ky + "은(는 x[" + idx + "]에 있습니다");
        }
    }
}
