package codeup;

import java.util.Scanner;

public class p1902 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        recursion(scanner.nextInt());
    }

    public static void recursion(int count) {
        if (count == 0) {
            return;
        }
        System.out.println(count);
        recursion(count - 1);
    }
}
