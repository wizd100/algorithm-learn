package codeup;

import java.util.Scanner;

public class p1020 {
    public static void main(String[] args) {
        String inputNumber;
        String[] inputNumberArr;
        int firstNumber;
        int secondNumber;

        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.next();
        inputNumberArr = inputNumber.split("-");
        firstNumber = Integer.parseInt(inputNumberArr[0]);
        secondNumber = Integer.parseInt(inputNumberArr[1]);
        System.out.printf("%06d%07d", firstNumber, secondNumber);

    }
}
