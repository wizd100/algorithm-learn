package doit.chap04;

import java.util.Scanner;

public class IntQueueTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntQueue q = new IntQueue(64);

        while (true) {
            System.out.println("현재 데이터 수 : " + q.size() + " / " + q.capacity());
            System.out.print("1.인큐 2.디큐 3.피크 4.덤프 5.검색 0.종료 : ");
            int menu = scanner.nextInt();

            if (menu == 0) {
                break;
            }

            int x;
            switch (menu) {
                case 1:
                    System.out.print("데이터 : ");
                    x = scanner.nextInt();
                    try {
                        q.enque(x);
                    } catch (IntQueue.OverflowIntQueueException e) {
                        System.out.println("큐가 가득찼습니다");
                    }
                    break;
                case 2:
                    try {
                        x = q.deque();
                        System.out.println("디큐한 데이터는 : " + x);
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다");
                    }
                    break;
                case 3:
                    try {
                        x = q.peek();
                        System.out.println("피크한 데이터는 : " + x);
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다");
                    }
                    break;
                case 4:
                    q.dump();
                    break;
                case 5:
                    System.out.print("검색할 데이터 : ");
                    x = scanner.nextInt();
                    System.out.println("해당 데이터는 " + q.search(x) + "번째에 있습니다");
                    break;
            }

        }
    }
}
