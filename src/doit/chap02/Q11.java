package doit.chap02;

import java.util.Scanner;

public class Q11 {
    int y;
    int m;
    int d;

    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
    };

    Q11(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    static int isLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return 1;
        }
        if (year % 400 == 0) {
            return 1;
        }
        return 0;
    }

    Q11 after(int n) {
        Q11 ymd = new Q11(this.y, this.m, this.d);

        ymd.d += n;

        //해당 월의 일이 넘어가면 월을 추가
        while (mdays[isLeap(ymd.y)][ymd.m - 1] < ymd.d) {
            ymd.d -= mdays[isLeap(ymd.y)][ymd.m - 1];

            //월이 12를 넘어가면 1로 변경하고 년을 추가
            if (++ymd.m > 12) {
                ymd.y++;
                ymd.m = 1;
            }

        }
        return ymd;
    }

    Q11 before(int n) {
        Q11 ymd = new Q11(this.y, this.m, this.d);

        ymd.d -= n;

        while (ymd.d < 1) {
            if (--ymd.m < 1) {
                ymd.y--;
                ymd.m = 12;
            }
            ymd.d += mdays[isLeap(ymd.y)][ymd.m - 1];
        }
        return ymd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Q11 ymd = new Q11(2020, 7, 25);

        System.out.print("n 일 : ");
        int n = scanner.nextInt();

        System.out.println("날짜 : " + ymd.y + "-" + ymd.m + "-" + ymd.d);
        System.out.println(n + "일 뒤 날짜 : " + ymd.after(n).y + "-" + ymd.after(n).m + "-" + ymd.after(n).d);
        System.out.println(n + "일 앞 날짜 : " + ymd.before(n).y + "-" + ymd.before(n).m + "-" + ymd.before(n).d);
    }
}
