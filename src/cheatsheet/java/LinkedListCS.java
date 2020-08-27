package cheatsheet.java;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.Iterator;

/*
데이터들이 노드로 연결된 자료구조

장점 추가 삭제시 효율이 좋음
단점 검색이 오래걸림 (ArrayList 보다 느림)

언제쓰일까?
큐의 구현체로 쓰임

 */
public class LinkedListCS {
    public static void main(String[] args) {
        //선언
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1, 2));

        //추가
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);
        list1.add(5);
        list1.addFirst(3);
        list1.addLast(4);
        list1.add(1, 5);

        for (int i : list1) {
            System.out.println(i);
        }
        System.out.println("---");

        //삭제
        list1.remove(); // 생략시 0번째 인덱스 삭제
        list1.removeFirst(); // 가장 앞의 데이터 삭제
        list1.removeLast(); // 가장 뒤의 데이터 삭제
        list1.remove(1); // 인덱스 번호로 제거
        list1.remove(new Integer(2)); // 해당 값에 제일 앞순서에 해당하는 것 제거
        //list1.clear(); // 모든값 제거

        for (int i : list1) {
            System.out.println(i);
        }
        System.out.println("---");

        //출력
        //ArrayList에선 이방법을 해도 괜찮지만
        //LinkedList에선 이 방법으로 get 하는것은 효율적이지 않다 (내부적으로 반복문이 돔) -> Iterator를 쓰자
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        System.out.println("---");

        for (int i : list1) {
            System.out.println(i);
        }
        System.out.println("---");

        //탐색할땐 이방법을 추천 (내부적으로 반복 처리된 노드가 무엇인지에 대한 정보를 유지함)
        for (Iterator<Integer> it1 = list1.iterator(); it1.hasNext(); ) {
            int n = it1.next();
            System.out.println(n);
        }
        System.out.println("---");

        //검색
        System.out.println(list1.contains(4)); // 4가 있으면 true 없으면 false
        System.out.println(list1.indexOf(4)); // 4가 있으면 인덱스 반환 없으면 -1

        System.out.println("---");

        //수정
        list1.set(1, 6); // 해당 인덱스의 있는 값을 수정

        for (int i : list1) {
            System.out.println(i);
        }
        System.out.println("---수정");

        //응용
        //remove 반환 타입이 boolean이여서 검색 함수를 쓰지 않고 if문으로 쓸수있음
        //예) 지워지면 값이 있다는것이고 없으면 값이 없다는 것
        if (list1.remove(new Integer(1))) {
            list1.addFirst(1);

            for (int i : list1) {
                System.out.println(i);
            }
        }
        System.out.println("---지우면서 체크");

    }
}
