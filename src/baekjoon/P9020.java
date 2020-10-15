package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class P9020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseMax = 10000;
        boolean[] number = new boolean[caseMax + 1];
        ArrayList<Integer> prime = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 2; i <= caseMax; i++) {
            if (number[i]) {
                continue;
            }
            prime.add(i);
            for (int j = i + i; j <= caseMax; j += i) {
                number[j] = true;
            }
        }

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();

            int[] result = partition(prime, n);

            sb.append(result[0] + " " + result[1]);
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static int[] partition(ArrayList<Integer> prime, int n) {
        int min = n;
        int[] result = new int[2];

        for (int i = 0; i < prime.size(); i++) {
            for (int j = i; j < prime.size(); j++) {
                if (prime.get(i) + prime.get(j) != n) {
                    continue;
                }
                if (min > prime.get(j) - prime.get(i)) {
                    min = prime.get(j) - prime.get(i);
                    result[0] = prime.get(i);
                    result[1] = prime.get(j);
                }
            }
        }

        return result;
    }
}
