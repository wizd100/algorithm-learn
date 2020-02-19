package codeup;

import java.util.Scanner;

public class p1087 {
    public static void main(String[] args) {
        long inputNum;
        long sum = 0;
        long i = 1;

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();

        while (sum < inputNum) {
            sum += i;
            i++;
        }
        System.out.printf("%d\n", sum);
    }
}
