package kakao.challenges2018;

public class P4 {
    public static void main(String[] args) {
        String[] timetable1 = {"08:00", "08:01", "08:02", "08:03"};
        String[] timetable2 = {"09:10", "09:09", "08:00"};
        String[] timetable3 = {"09:00", "09:00", "09:00", "09:00"};
        String[] timetable4 = {"00:01", "00:01", "00:01", "00:01", "00:01"};
        String[] timetable5 = {"23:59"};
        String[] timetable6 = {"23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59"};

        System.out.println(solution(1, 1, 5, timetable1)); // "09:00"
        System.out.println(solution(2, 10, 2, timetable2)); // "09:09"
        System.out.println(solution(2, 1, 2, timetable3)); // "08:59"
        System.out.println(solution(1, 1, 5, timetable4)); // "00:00"
        System.out.println(solution(1, 1, 1, timetable5)); // "09:00"
        System.out.println(solution(10, 60, 45, timetable6)); // "18:00"
    }

    public static String solution(int n, int t, int m, String[] timetable) {
        String answer = "";

        String startTime = "09:00";

        //셔틀버스 시간표
        for (int i = 0; i < n; i++) {
            System.out.println(startTime);
        }


        return answer;
    }
}
