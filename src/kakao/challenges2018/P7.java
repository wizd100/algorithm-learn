package kakao.challenges2018;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class P7 {
    public static void main(String[] args) {
        //0,23 24,30
        String str1 = "2016-09-15 03:10:33.020 0.011s";
        LocalDateTime datetime1 = LocalDateTime.parse(str1.substring(0, 23), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
        LocalDateTime processTime1 = LocalDateTime.parse(str1.substring(24, 29), DateTimeFormatter.ofPattern("s.SSS"));

        //System.out.println(datetime1 - processTime1);
        //System.out.println(str1.substring(0, 23));
        //System.out.println(str1.substring(24, 30));
    }
}
