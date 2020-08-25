package doit.chap04;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntDeque deque = new IntDeque(10);

        int x;
        while (true) {
            System.out.print("1.프론트인큐 2.프론트디큐 3.리니어인큐 4.리니어디큐 0.종료 : ");
            int menu = scanner.nextInt();

            if (menu == 0) {
                break;
            }
            if (menu == 1) {
                System.out.print("프론트인큐할 데이터 : ");
                x = scanner.nextInt();
                deque.addFront(x);
            }
        }
    }
}
