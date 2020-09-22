package hackerrank.ps;

public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(convert("07:05:45PM"));
    }

    public static String convert(String s) {
        String timeType = s.substring(8);
        int hour = Integer.parseInt(s.substring(0, 2));
        String minuteSecond = s.substring(2, 8);
        String convertTime = "";

        if (timeType.equals("AM")) {
            if (hour >= 12) {
                hour -= 12;
            }
            convertTime = String.format("%02d", hour);
        } else if (timeType.equals("PM")) {
            if (hour < 12) {
                hour += 12;
            }
            convertTime = String.format("%02d", hour);
        }

        convertTime += minuteSecond;

        return convertTime;
    }
}
