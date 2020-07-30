package doit.chap04;

import java.util.Scanner;

public class IntStackTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntStack stk = new IntStack(64);

        while (true) {
            System.out.println("현재 데이터 수 : " + stk.size() + " / " + stk.capacity());

            System.out.print("1.푸시 2.팝 3.피크 4.덤프 0.종료 : ");
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
                        stk.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다");
                    }
                    break;
                case 2:
                    try {
                        x = stk.pop();
                        System.out.println("팝한 데이터는 : " + x + "입니다");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다");
                    }
                    break;
                case 3:
                    try {
                        x = stk.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다");
                    }
                    break;
                case 4:
                    stk.dump();
                    break;
            }
        }

    }
}
