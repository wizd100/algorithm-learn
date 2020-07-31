package doit.chap04;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열값 입력 : ");
        int capacity = scanner.nextInt();
        IntAryQueue que = new IntAryQueue(capacity);

        int n;

        while (true) {
            System.out.print("1.enqueue 2.dequeue 3.dump 4.exit : ");
            int menu = scanner.nextInt();

            if (menu == 1) {
                System.out.print("큐에 넣을 값 : ");
                n = scanner.nextInt();
                que.enqueue(n);
            }
            if (menu == 2) {
                que.dequeue();
            }
            if (menu == 3) {
                que.dump();
            }
            if (menu == 4) {
                break;
            }
        }
    }
}
