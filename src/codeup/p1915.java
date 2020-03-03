package codeup;

import java.util.Scanner;

public class p1915 {
    public static void main(String[] args) {
        int fibonacci;
        int startNum = 1;
        int nextNum = 1;
        int count = 2;
        int maxCount;

        Scanner scanner = new Scanner(System.in);
        maxCount = scanner.nextInt();
        fibonacci = recursion(startNum, nextNum, count, maxCount);
        System.out.printf("%d", fibonacci);
    }

    public static int recursion(int startNum, int nextNum, int count, int maxNum) {

        if (count > maxNum) {
            return startNum;
        }
        count++;
        return recursion(nextNum, startNum + nextNum, count, maxNum);
    }
}
