package codeup;

import java.util.Scanner;

public class p1083 {
    public static void main(String[] args) {
        int inputNum;
        String[] check369;

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();

        for (int i = 1; i <= inputNum; i++) {
            check369 = Integer.toString(i).split("");
            int check369Count = 0;

            for (int j = 0; j < check369.length; j++) {
                if (check369[j].equals("3") || check369[j].equals("6") || check369[j].equals("9")) {
                    check369Count++;
                }
            }

            if (check369Count > 0) {
                for (int j = 0; j < check369Count; j++) {
                    System.out.print("X");
                }
                System.out.print(" ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
