package hackerrank.ps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        int answer;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> arr = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                arr.get(i).add(scanner.nextInt());
            }
        }

        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr.get(i).get(j));
            }
            System.out.println();
        }*/

        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }*/

        answer = diagonalDifference(arr);
        System.out.println(answer);
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int a = 0;
        int b = 0;
        int answer;

        for (int i = 0; i < arr.size(); i++) {
            a += arr.get(i).get(i);
            b += arr.get(i).get(arr.size() - i - 1);
        }

        answer = a - b;

        if (answer < 0) {
            answer = answer * -1;
        }

        return answer;
    }
}
