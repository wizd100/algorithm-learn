package doit.chap04;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntStack stk = new IntStack(2);

        while (true) {
            System.out.println("현재 데이터 수 : " + stk.size() + " / " + stk.capacity());

            System.out.print("1.푸시 2.팝 3.피크 4.덤프 5.검색 6.초기화 7.스택이 비었는지 확인 8.스택이 꽉 찼는지 확인  0.종료 : ");
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
                case 5:
                    System.out.print("검색할 값 : ");
                    x = scanner.nextInt();
                    int idx = stk.indexOf(x);
                    if (idx != -1) {
                        System.out.println("해당 값은 [" + idx + "]에 있습니다");
                    } else {
                        System.out.println("해당 값은 스택에 없습니다");
                    }
                    break;
                case 6:
                    System.out.print("정말 초기화 하시겠습니까? 1.네 0.아니오 : ");
                    x = scanner.nextInt();
                    if (x == 1) {
                        stk.clear();
                    }
                    break;
                case 7:
                    if (stk.isEmpty()) {
                        System.out.println("스택이 비어있습니다");
                    } else {
                        System.out.println("스택이 비어있지 않습니다");
                    }
                    break;
                case 8:
                    if (stk.isFull()) {
                        System.out.println("스택이 꽉 차있습니다");
                    } else {
                        System.out.println("스택이 꽉 차 있지 않습니다");
                    }
                    break;
            }
        }
    }
}
