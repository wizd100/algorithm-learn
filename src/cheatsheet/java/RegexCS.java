package cheatsheet.java;

import java.util.regex.Pattern;

public class RegexCS {
    public static void main(String[] args) {
        String str1 = "Goodbye bye bye world world world";

        System.out.println(str1.matches("[A-Z]"));
        System.out.println(str1.replaceAll("(\\b\\w+\\b)(\\s+\\1\\b)+","$1"));

        String pattern1 = "(\\b\\w+\\b)(\\s+\\1\\b)";
        Pattern p1 = Pattern.compile(pattern1, Pattern.CASE_INSENSITIVE);
        System.out.println(p1.matcher(str1));
    }
}
