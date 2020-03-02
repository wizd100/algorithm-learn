package codeup;

import java.util.Scanner;

public class p1901 {
    public static void main(String[] args) {
        int count = 1;
        int inputNum;

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();

        recursion(count, inputNum);
    }

    public static void recursion(int count, int inputNum) {
        if (count > inputNum) {
            return;
        } else {
            System.out.println(count);
            recursion(count + 1, inputNum);
        }
    }
}
