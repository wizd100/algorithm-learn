package codeup;

import java.util.Scanner;

public class p1025 {
    public static void main(String[] args) {
        int inputNum;
        int inputNumLength;
        int num;

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();
        inputNumLength = (int)(Math.log10(inputNum) + 1);

        //높은 자리수부터 할때
        for (int i = inputNumLength; i > 0; i--) {
            num = (inputNum / (int)(Math.pow(10, i - 1))) * (int)(Math.pow(10, i - 1));
            inputNum %= (int)(Math.pow(10, i - 1));
            System.out.printf("[%d]\n", num);
        }

        //낮은 자리수 부터 할때
        //for (int i = 0; i < inputNumLength; i++) {
        //    num = (inputNum % 10) * (int)(Math.pow(10, i));
        //    inputNum /= 10;
        //    System.out.printf("[%d]\n", num);
        //}
    }
}
