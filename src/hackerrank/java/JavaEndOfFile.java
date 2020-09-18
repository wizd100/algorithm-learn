package hackerrank.java;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println(++count + " " + s);
        }
        sc.close();
    }
}
