package hackerrank.java;

import java.util.Calendar;
import java.time.LocalTime;

public class JavaDateAndTime {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        //cal.set(2059,  12 + 1, 25);
        cal.set(2020,  9 - 1, 19);
        //System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));

    }
}
