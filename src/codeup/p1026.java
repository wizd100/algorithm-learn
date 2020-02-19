package codeup;

import java.util.Scanner;

public class p1026 {
    public static void main(String[] args) {
        String inputTime;
        String[] inputTimeArr;
        int minute;

        Scanner scanner = new Scanner(System.in);
        inputTime = scanner.nextLine();
        inputTimeArr = inputTime.split(":");
        minute = Integer.parseInt(inputTimeArr[1]);

        System.out.printf("%d", minute);
    }
}
