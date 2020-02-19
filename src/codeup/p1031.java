package codeup;

import java.util.Scanner;

public class p1031 {
    public static void main(String[] args) {
        int inputNum;

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();
        System.out.printf("%s", Integer.toOctalString(inputNum));
        //System.out.printf("%o", inputNum); //이 방법도 가능
    }
}
