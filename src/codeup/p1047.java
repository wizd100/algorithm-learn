package codeup;

import java.util.Scanner;

public class p1047 {
    public static void main(String[] args) {
        long inputNum;

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextLong();

        //비트 쉬프트
        System.out.printf("%d", inputNum << 1);
    }
}
