package codeup;

import java.util.Scanner;

public class p1033 {
    public static void main(String[] args) {
        int inputNum;

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();
        System.out.printf("%s", Integer.toHexString(inputNum).toUpperCase());
        //System.out.printf("%X", inputNum); //이 방법도 가능
    }
}
