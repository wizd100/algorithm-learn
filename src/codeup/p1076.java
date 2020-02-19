package codeup;

import java.util.Scanner;

public class p1076 {
    public static void main(String[] args) {
        String inputStr;
        char convertChar;
        char startChar = 'a';

        Scanner scanner = new Scanner(System.in);
        inputStr = scanner.nextLine();
        convertChar = inputStr.charAt(0);

        while (true) {
            if (startChar > convertChar) {
                break;
            }
            System.out.printf("%c\n", startChar);
            startChar++;
        }
    }

    public static void main2(String[] args) {
        String inputStr;
        char convertChar;
        char startChar = 'a';

        //Scanner scanner = new Scanner(System.in);
        //inputStr = scanner.nextLine();
        //convertChar = inputStr.charAt(0);

        System.out.println(startChar);
        startChar += 1;
        System.out.println(startChar);

        /*while (true) {
            System.out.println(startChar);

            if (Integer.toHexString(startChar) == Integer.toHexString(convertChar)) {
                break;
            }

            startChar = (Integer.toHexString(startChar) + 1).charAt(0);
        }
*/
        //System.out.printf("%s", Integer.toHexString(convertChar));
    }
}
