package doit.chap03;

import java.util.Scanner;
import java.util.Arrays;

public class StringBinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] x = {
                "abstract", "assert", "boolean", "break", "byte",
                "case", "catch", "char", "do", "final", "void",
        };

        System.out.print("원하는 키워드 입력 : ");
        String ky = scanner.next();

        int idx = Arrays.binarySearch(x, ky);

        if (idx < 0) {
            System.out.println("해당 키워드가 없습니다");
        } else {
            System.out.println(ky + "는 x[" + idx + "]에 있습니다");
        }
    }
}
