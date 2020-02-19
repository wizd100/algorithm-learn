package codeup;

import java.util.Scanner;

public class p1019 {
    public static void main(String[] args) {
        String date;
        String[] dateArr;
        int year;
        int month;
        int day;

        Scanner scanner = new Scanner(System.in);
        date = scanner.next();
        dateArr = date.split("\\.");

        year = Integer.parseInt(dateArr[0]);
        month = Integer.parseInt(dateArr[1]);
        day = Integer.parseInt(dateArr[2]);

        System.out.printf("%04d.%02d.%02d", year, month, day);
    }
}
