package codeup;

import java.util.Scanner;

public class p1069 {
    public static void main(String[] args) {
        String inputStr;

        Scanner scanner = new Scanner(System.in);
        inputStr = scanner.nextLine();

        switch (inputStr) {
            case "A":
                System.out.print("best!!!");
                break;
            case "B":
                System.out.print("good!!");
                break;
            case "C":
                System.out.print("run!");
                break;
            case "D":
                System.out.print("slowly~");
                break;
            default:
                System.out.print("what?");
                break;
        }
    }
}
