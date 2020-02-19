package codeup;

import java.util.Scanner;

public class p1023 {
    public static void main(String[] args) {
        String inputNum;
        String[] inputNumArr;
        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.next();
        inputNumArr = inputNum.split("\\.");
        num1 = Integer.parseInt(inputNumArr[0]);
        num2 = Integer.parseInt(inputNumArr[1]);
        System.out.printf("%d\n%d", num1, num2);
    }
}
