package kakao.challenges2018;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println(("000000"));
        String.format("%05d", Integer.parseInt("10"));

        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];


        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }

        solution(n, arr1, arr2);


    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] arr3 = new String[n];

        for (int i = 0; i < n; i++) {
            arr3[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            //arr3[i] = String.format("%0" + n + "d", Integer.parseInt(arr3[i])); //0을 붙이니 테스트케이스를 통과 못함
            arr3[i] = String.format("%" + n + "s", arr3[i]); //0을 붙이는 대신 공백을 넣어서 해
            arr3[i] = arr3[i].replace("1", "#");
            arr3[i] = arr3[i].replace("0", " ");
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr3[i]);
        }

        return arr3;
    }
}
