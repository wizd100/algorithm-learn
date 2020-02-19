package codeup;

import java.util.Scanner;

public class p1064 {
    public static void main(String[] args) {
        int inputNum1;
        int inputNum2;
        int inputNum3;
        int answer;

        Scanner scanner = new Scanner(System.in);
        inputNum1 = scanner.nextInt();
        inputNum2 = scanner.nextInt();
        inputNum3 = scanner.nextInt();

        answer = (inputNum1 > inputNum2 ? inputNum2 : inputNum1) > inputNum3 ? inputNum3 : (inputNum1 > inputNum2 ? inputNum2 : inputNum1);

        System.out.printf("%d", answer);
    }
}
