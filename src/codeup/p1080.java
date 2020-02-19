package codeup;

import java.util.Scanner;

public class p1080 {
    public static void main(String[] args) {
        int inputNum;
        int sum = 0;
        int i = 1;

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();

        while (true) {
            sum += i;

            if (sum >= inputNum) {
                System.out.printf("%d", i);
                break;
            }

            i++;
        }
    }
}
