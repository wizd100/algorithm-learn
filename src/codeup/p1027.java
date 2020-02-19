package codeup;

import java.util.Scanner;

public class p1027 {
    public static void main(String[] args) {
        String inputDate;
        String[] inputDateArr;
        int year;
        int month;
        int day;

        Scanner scanner = new Scanner(System.in);
        inputDate = scanner.nextLine();
        inputDateArr = inputDate.split("\\.");

        year = Integer.parseInt(inputDateArr[0]);
        month = Integer.parseInt(inputDateArr[1]);
        day = Integer.parseInt(inputDateArr[2]);

        System.out.printf("%02d-%02d-%04d", day, month, year);
    }
}
