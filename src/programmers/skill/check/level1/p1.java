package programmers.skill.check.level1;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        int inputNum;
        int answer = 0;

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();

        for (int i = 2; i <= inputNum; i++) {
            int primeCheck = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    primeCheck++;
                }
            }

            if (primeCheck == 2) {
                answer++;
            }
        }

        System.out.printf("prime number count : %d", answer);
    }
}
