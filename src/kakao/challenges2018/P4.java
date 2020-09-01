package kakao.challenges2018;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class P4 {
    public static void main(String[] args) {
        String[] timetable1 = {"08:00", "08:01", "08:02", "08:03"};
        String[] timetable2 = {"09:10", "09:09", "08:00"};
        //String[] timetable2 = {"09:10", "08:00"};
        String[] timetable3 = {"09:00", "09:00", "09:00", "09:00"};
        String[] timetable4 = {"00:01", "00:01", "00:01", "00:01", "00:01"};
        String[] timetable5 = {"23:59"};
        String[] timetable6 = {"23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59"};

        System.out.println(solution3(1, 1, 5, timetable1)); // "09:00"
        System.out.println("---");
        System.out.println(solution3(2, 10, 2, timetable2)); // "09:09"
        System.out.println("---");
        System.out.println(solution3(2, 1, 2, timetable3)); // "08:59"
        System.out.println("---");
        System.out.println(solution3(1, 1, 5, timetable4)); // "00:00"
        System.out.println("---");
        System.out.println(solution3(1, 1, 1, timetable5)); // "09:00"
        System.out.println("---");
        System.out.println(solution3(10, 60, 45, timetable6)); // "18:00"
    }

    public static String solution(int n, int t, int m, String[] timetable) {
        String answer = "";

        LocalTime[] time = new LocalTime[n];
        time[0] = LocalTime.of(9, 0); // 시작 시간은 09:00
        LinkedList<LocalTime> listTimetable = new LinkedList<>();
        int[] check = new int[n];

        //셔틀버스 시간표
        //2번째 부터 값을 집어 넣음
        for (int i = 1; i < n; i++) {
            time[i] = time[i - 1].plusMinutes(t);
        }

        //최대 승객수보다 사람수가 적을때
        //셔틀버스 시각에서 제일 늦은것을 타야됨
        if (m > timetable.length) {
            return time[n - 1].toString();
        }

        //크루 대기열을 시간으로 변환 후 오름차순 정렬
        for (int i = 0; i < timetable.length; i++) {
            listTimetable.add(LocalTime.parse(timetable[i], DateTimeFormatter.ofPattern("HH:mm")));
        }
        Collections.sort(listTimetable);

        //셔틀버스 시간표
        for (int i = 0; i < n; i++) {
            //System.out.println("셔틀버스 : " + time[i] + " " + n + " " + m) ;

            //크루를 다 태우거나 또는 태울 크루가 없을때 끝
            for (int j = 0; j < m; j++) {
                if (time[i].isAfter(listTimetable.getFirst()) || time[i].equals(listTimetable.getFirst())) {
                    //System.out.println(listTimetable.removeFirst());
                    listTimetable.removeFirst();
                    check[i]++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            // 아무도 안탔거나 자리가 남는 경우 ( 0 이상일 경우 마지막 버스시간표 )
            if (check[i] < m) {

                //
                System.out.println(check[i]);
            }

            //
        }

        return answer;
    }

    public static String solution2(int n, int t, int m, String[] timetable) {
        String answer = "";

        int[] arrTimetable = new int[timetable.length]; // int 대기열 담을 배열
        int[] busTime = new int[n]; // 셔틀버스 운행시각표 배열
        int[] checkCount = new int[n]; // 해당 시각에 남은 좌석수
        int[][] checkCrew = new int[n][m]; // 해당 시각에 탄 크루

        // 셔틀버스 시간표 배열로 만듬
        busTime[0] = 9 * 60; // 09:00 첫 시작시간은 포함
        for (int i = 1; i < n; i++) {
            busTime[i] = busTime[i - 1] + t;
        }

        // 대기인원 수가 최대 탑승 인원수보다 적을 경우 마지막 시간표 바로 리턴
        if (m > timetable.length) {
            return intTimeToStringTimeFormat(busTime[n - 1]);
        }

        //String 시간을 int 분으로 변환
        for (int i = 0; i < timetable.length; i++) {
            int hour = Integer.parseInt(timetable[i].substring(0, 2)) * 60;
            int minute = Integer.parseInt(timetable[i].substring(3, 5));
            arrTimetable[i] = hour + minute;
            //System.out.println(arrTimetable[i]);
        }
        // 대기열 오름차순 정렬 (대기열은 순서대로 입력 되어 있지 않음)
        Arrays.sort(arrTimetable);

        int count = 0; // 대기열 커서용
        for (int i = 0; i < n; i++) {
            checkCount[i] = m;
            System.out.println("버스시각 : " + intTimeToStringTimeFormat(busTime[i]));
            // 시각표와 대기열을 비교해서 해당 시각에 타는 대기열 출력
            for (int j = 0; j < m; j++) {
                if (busTime[i] >= arrTimetable[count]) {
                    System.out.println(intTimeToStringTimeFormat(arrTimetable[count]));
                    checkCount[i]--;
                    checkCrew[i][j] = arrTimetable[count];
                    if(arrTimetable.length - 1 == count++) {
                        break;
                    }
                }
            }

        }

        for (int i = 0; i < n; i++) {
            System.out.println(i + "번째 탑승 : " + checkCount[i]);
            //남은 좌석이 있을 경우 ( 시각표가 오름차순이라 남은좌석이 여러개여도 어차피 마지막 값으로 대체가 됨 )
            if (checkCount[i] > 0) {
                answer = intTimeToStringTimeFormat(busTime[i]);
            } else { //남은 좌석이 없을때
                // 마지막 시간표에서 마지막으로 탄 사람의 시간 - 1
                answer = intTimeToStringTimeFormat(checkCrew[n - 1][m - 1] - 1);
                //for (int j = 0; j < m; j++) {
                //    System.out.println(checkCrew[i][j]);
                //}
            }
        }

        return answer;
    }

    public static String solution3(int n, int t, int m, String[] timetable) {
        String answer = "";

        int[] arrTimetable = new int[timetable.length]; // int 대기열 담을 배열
        int[] busTime = new int[n]; // 셔틀버스 운행시각표 배열
        int[] checkCount = new int[n]; // 해당 시각에 남은 좌석수
        int[][] checkCrew = new int[n][m]; // 해당 시각에 탄 크루

        // 셔틀버스 시간표 배열로 만듬
        busTime[0] = 9 * 60; // 09:00 첫 시작시간은 포함
        for (int i = 1; i < n; i++) {
            busTime[i] = busTime[i - 1] + t;
        }

        // 대기인원 수가 최대 탑승 인원수보다 적을 경우 마지막 시간표 바로 리턴
        if (m > timetable.length) {
            return intTimeToStringTimeFormat(busTime[n - 1]);
        }

        //String 시간을 int 분으로 변환
        for (int i = 0; i < timetable.length; i++) {
            int hour = Integer.parseInt(timetable[i].substring(0, 2)) * 60;
            int minute = Integer.parseInt(timetable[i].substring(3, 5));
            arrTimetable[i] = hour + minute;
        }
        // 대기열 오름차순 정렬 (대기열은 순서대로 입력 되어 있지 않음)
        Arrays.sort(arrTimetable);

        int count = 0; // 대기열 커서용
        for (int i = 0; i < n; i++) {
            checkCount[i] = m;
            // 시각표와 대기열을 비교해서 해당 시각에 타는 대기열 출력
            for (int j = 0; j < m; j++) {
                if (busTime[i] >= arrTimetable[count]) {
                    checkCount[i]--;
                    checkCrew[i][j] = arrTimetable[count];
                    if(arrTimetable.length - 1 == count++) {
                        break;
                    }
                }
            }

        }

        for (int i = 0; i < n; i++) {
            //남은 좌석이 있을 경우 ( 시각표가 오름차순이라 남은좌석이 여러개여도 어차피 마지막 값으로 대체가 됨 )
            if (checkCount[i] > 0) {
                answer = intTimeToStringTimeFormat(busTime[i]);
            } else { //남은 좌석이 없을때
                // 마지막 시간표에서 마지막으로 탄 사람의 시간 - 1
                answer = intTimeToStringTimeFormat(checkCrew[n - 1][m - 1] - 1);
            }
        }

        return answer;
    }

    public static String intTimeToStringTimeFormat(int time) {
        return String.format("%02d:%02d", time / 60, time % 60) + ":" + String.format("%02d", time % 60);
    }
}
