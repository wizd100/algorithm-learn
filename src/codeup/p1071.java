package codeup;

import java.util.Scanner;

public class p1071 {
    public static void main(String[] args) {
        int inputNum;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            inputNum = scanner.nextInt();

            if (inputNum == 0) {
                break;
            }
            System.out.println(inputNum);
        }

        /*String inputStr;
        String[] inputStrArr;
        int answer;

        Scanner scanner = new Scanner(System.in);
        inputStr = scanner.nextLine();
        inputStrArr = inputStr.split(" ");

        for (int i = 0; i < inputStrArr.length; i++) {
            answer = Integer.parseInt(inputStrArr[i]);

            if (answer != 0) {
                System.out.println(answer);
            } else {
                break;
            }
        }*/
    }
}
