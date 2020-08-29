package cheatsheet.java;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/*
JDK 8 에선 LocalDate 이용

 */
public class DateCS {
    public static void main(String[] args) {
        //날짜
        //현재 날짜 정보 2020-08-28
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        //특정 날짜 객체 선언
        LocalDate date1 = LocalDate.of(2020, 8, 20);
        System.out.println(date1);

        System.out.println(date1.getYear());
        System.out.println(date1.getMonth()); //AUGUST ..
        System.out.println(date1.getMonthValue()); // 8
        System.out.println(date1.getDayOfMonth()); // 월의 몇번째 일
        System.out.println(date1.getDayOfWeek()); // THURSDAY
        System.out.println(date1.getDayOfYear()); // 233 년의 몇번째 일
        System.out.println(date1.isLeapYear()); // 윤년 여부

        System.out.println("--- LocalDate");

        //시간
        //현재 시간 HH:mm:ss.zzz
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalTime time1 = LocalTime.of(19, 37, 30);
        System.out.println(time1);

        System.out.println(time1.getHour());
        System.out.println(time1.getMinute());
        System.out.println(time1.getSecond());
        System.out.println(time1.getNano());

        //날짜시간
        //현재 날짜시간 2020-08-28T19:41:24.171
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        LocalDateTime dateTime1 = LocalDateTime.of(2020, 8, 20, 19, 48, 10);
        System.out.println(dateTime1);
        System.out.println(dateTime1.getYear());

        //응용

        // 포맷 변환
        LocalDateTime dateTime2 = LocalDateTime.now();
        System.out.println(dateTime2.format(DateTimeFormatter.ofPattern("yyyyMMdd HHmmss")));

        //String 문자열 날짜를 LocalDate 형변환
        //yyyyMMdd -> yyyy-MM-dd
        String strDate2 = "20200828";
        LocalDate date2 = LocalDate.parse(strDate2, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(date2);

        //yyyy-MM-dd -> yyyy-MM-dd
        String strDate3 = "2020-08-28";
        LocalDate date3 = LocalDate.parse(strDate3, DateTimeFormatter.ISO_DATE);
        System.out.println(date3);

        // 패턴으로 yyyy/MM/dd -> yyyy-MM-dd
        String strDate4 = "2020/08/28";
        LocalDate date4 = LocalDate.parse(strDate4, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(date4);

        //패턴으로 날짜 표시
        System.out.println(date4.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))); //28-08-2020
        System.out.println(date4.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"))); //28-8월-2020 (이건 컴퓨터 환경을 따라가는듯?)
        System.out.println(date4.format(DateTimeFormatter.ofPattern("yyyy년 M월 d일"))); // 2020년 8월 28일


        //날짜 전후
        //LocalDate 는 불변이기 때문에 초기 날짜가 변하지 않는다
        LocalDate date5 = LocalDate.of(2020, 8, 29);
        System.out.println(date5.plusYears(1));
        System.out.println(date5.plusMonths(6)); //월을 더하고 월에 대한 말일을 넘어간다면 제일 마지막날 표시
        System.out.println(date5.plusDays(3)); //

        System.out.println(date5.minusYears(1));
        System.out.println(date5.minusMonths(1));
        System.out.println(date5.minusDays(1));

        //시간 전후
        LocalTime time2 = LocalTime.of(19, 07, 10);
        System.out.println(time2.plusHours(1));
        System.out.println(time2.plusMinutes(8));
        System.out.println(time2.plusSeconds(8));

        //두 날짜 비교
        LocalDate date6 = LocalDate.of(2020, 1, 2);
        LocalDate date7 = LocalDate.of(2020, 2, 1);

        //동일한 날짜인지 비교 true false
        System.out.println(date6.isEqual(date7));

        //이전 날짜인지 비교 date6가 date7보다 이전날짜인지 비교 true false
        System.out.println(date6.isBefore(date7));

        //이후 날짜인지 비교 date6가 date7보다 이후날짜인지 비교 true false
        System.out.println(date6.isAfter(date7));

        Period period1 = Period.between(date6, date7);
        System.out.println(period1.getYears());
        //* 중요 11개월 이상 차이나면 0으로 바뀜
        System.out.println(period1.getMonths());
        //* 중요 한달이상 차이가 나면 31일이 되는것이 아닌 1개월 1일로 반환이 됨
        System.out.println(period1.getDays());

        //전체시간으로 계산
        //31일 차이 (1개월 1일)
        System.out.println(ChronoUnit.DAYS.between(date6, date7));
        System.out.println(ChronoUnit.MONTHS.between(date6, date7));

        //두 시간 비교


        //시간 비교

        //해당날짜의 마지막날짜 찾기
        



    }
}
