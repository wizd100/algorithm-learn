package codeup;

import java.util.Scanner;

public class p1014 {
    public static void main(String [] args) {
        char x;
        char y;
        String strX;
        String strY;

        Scanner scanner = new Scanner(System.in);
        strX = scanner.next();
        strY = scanner.next();

        x = strX.charAt(0);
        y = strY.charAt(0);

        System.out.printf("%c %c", y, x);
    }
}
