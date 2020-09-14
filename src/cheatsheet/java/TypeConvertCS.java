package cheatsheet.java;

/*
형변환 정리
 */
public class TypeConvertCS {
    public static void main(String[] args) {
        //String -> int
        String str1 = "10";
        int num1 = Integer.parseInt(str1); //기본 int가 필요하면
        int num2 = Integer.valueOf(str1); //Integer wrapper 객체가 필요하면
        System.out.printf("%d\n", num1);
        System.out.printf("%d\n", num2);

        //String -> double, float
        String str2 = "12";
        double dNum1 = Double.valueOf(str2);
        float fNum1 = Float.valueOf(str2);
        System.out.printf("%.0f\n", dNum1);
        System.out.printf("%.3f\n", fNum1);

        //String -> Long
        String str3 = "100";
        Long lNum1 = Long.parseLong(str3);
        System.out.printf("%d", lNum1);

        //int -> String
        int num3 = 30;
        String str4 = String.valueOf(num3);
        String str5 = Integer.toString(num3);
        System.out.printf("%s\n", str4);
        System.out.printf("%s\n", str5);

        //int -> doblue, float
        int num4 = 14;
        double dNum2 = (double)num4;
        float fNum2 = (float)num4;
        System.out.printf("%f\n", dNum2);
        System.out.printf("%f\n", fNum2);

        //double, float -> int
        double dNum3 = 14.4;
        float fNum3 = 10.15f;
        int num5 = (int)dNum3;
        int num6 = (int)fNum3;
        System.out.printf("%d\n", num5);
        System.out.printf("%d\n", num6);

        //double, float -> String
        double dNum4 = 15.155;
        float fNum4 = 11.3f;
        String str6 = Double.toString(dNum4);
        String str7 = Double.toString(fNum4);
        System.out.printf("%s\n", str6);
        System.out.printf("%s\n", str7);

        //int -> char
        int num7 = 65; //65 -> A
        int num8 = 9; //
        char char1 = (char)num7; //아스키 코드값으로 변환
        char char2 = Character.forDigit(num8, 10); //문자 그대로 변환
        System.out.printf("%c\n", char1);
        System.out.printf("%c\n", char2);

        //char -> int
        char char3 = '9';
        char char4 = '9';
        char char5 = '9';
        int num9 = (int)char3; //아스키코드값으로 변환됨
        int num10 = char4 - '0'; // char - '0' int 형으로 바로 변환됨
        int num11 = Character.getNumericValue(char5); //함수를 이용해서 int형으로 바로 변환
        System.out.printf("%d\n", num9);
        System.out.printf("%d\n", num10);
        System.out.printf("%d\n", num11);

        //long -> char
        Long lNum2 = 1L;
        //char char6  = (char)lNum2;


        //char -> long

        //String -> char

        //char -> String


    }
}
