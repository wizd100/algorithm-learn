package doit.chap02;

import java.util.Scanner;

public class Q9 {
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} // 윤년
    };

    // 평년 윤년 판별 1이면 윤년, 0이면 평년
    static int isLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return 1;
        }
        if (year % 400 == 0) {
            return 1;
        }
        return 0;
    }

    //그 해 남은 일 수 계산
    //평년/윤년 계산하는 함수가 있음으로 365 + 평년/윤년 - 경과일 = 남은 일
    static int leftDayOfYear(int year, int month, int day) {
        int days = day;

        for (int i = 1; i < month; i++) {
            days += mdays[isLeap(year)][i - 1];
        }

        return 365 + isLeap(year) - days;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int retry = 1;

        System.out.println("그 해 경과 일수를 구합니다.");

        while (retry == 1) {
            System.out.print("년 : ");
            int year = scanner.nextInt();
            System.out.print("월 : ");
            int month = scanner.nextInt();
            System.out.print("일 : ");
            int day = scanner.nextInt();

            System.out.printf("그 해 %d일째입니다.\n", leftDayOfYear(year, month, day));

            System.out.print("한 번 더 할까요? (1.예 / 0.아니오)");
            retry = scanner.nextInt();
        }
    }
}
