package codeup;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class p1084 {
    public static void main(String[] args) throws IOException {
        int input1;
        int input2;
        int input3;
        int total = 0;

        Scanner scanner = new Scanner(System.in);
        input1 = scanner.nextInt();
        input2 = scanner.nextInt();
        input3 = scanner.nextInt();

        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < input1; i++) {
            for (int j = 0; j < input2; j++) {
                for (int k = 0; k < input3; k++) {
                    String str = i + " " + j + " " + k;
                    bf.write(str + "\n");
                    total++;
                }
            }
        }

        bf.write(Integer.toString(total));
        bf.close();
    }
}
