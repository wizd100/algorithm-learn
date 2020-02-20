package codeup;

import java.util.Scanner;

public class p1092 {
    public static void main(String[] args) {
        int userA;
        int userB;
        int userC;
        int day = 1;

        Scanner scanner = new Scanner(System.in);
        userA = scanner.nextInt();
        userB = scanner.nextInt();
        userC = scanner.nextInt();

        while (true) {
            int check = 0;

            if (day % userA == 0) {
                check++;
            }
            if (day % userB == 0) {
                check++;
            }
            if (day % userC == 0) {
                check++;
            }

            if (check == 3) {
                break;
            }

            day++;
        }

        System.out.printf("%d", day);
    }
}
