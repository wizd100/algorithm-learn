package cheatsheet.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;

/*
ArrayList는 고정적 배열이 아닌 유동적으로 배열요소가 늘어나는 배열함수
배열요소가 부족해지면 기존 배열보다 2배 긴 새 배열을 만들어서 데이터를 복제함
데이터들을 순차적으로 저장이됨 0,1,2,3...

장점 검색이 빠름
단점 추가 삭제시 성능이 안좋음 (중간에 있는 요소를 지우면 그 뒤에있는 요소들을 앞으로 다 땡겨줘야되기 때문)

언제 쓰이는가?

 */
public class ArrayListCS {
    public static void main(String[] args) {

        //선언, 생성
        //import java.util.ArrayList; 필요
        //ArrayList<타입 또는 객체> 변수명 = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(10); //초기 용량 지정가능
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3)); //생성시 값 지정
        ArrayList<String> list4 = new ArrayList<>();

        //추가
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(3);
        list1.add(5);
        list1.add(3);
        list1.add(6);
        list1.add(6);
        list1.add(0, 7); //해당 인덱스 위치에 값 등록 (맨앞에 넣기)

        list4.add("테스트1");
        list4.add("테스트2");
        list4.add("테스트3");
        list4.add("테스트4");
        list4.add("테스트2");
        list4.add("테스트1");

        //출력
        //방법1
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        System.out.println("---");

        //방법2
        for (int i : list1) {
            System.out.println(i);
        }
        System.out.println("---");

        //방법3
        //Iterator를 이용한 출력
        Iterator iter1 = list1.iterator();
        while (iter1.hasNext()) {
            System.out.println(iter1.next());
        }
        System.out.println("---");

        //삭제
        list1.remove(0); //인덱스에 있는 값 삭제
        list1.remove(new Integer(3)); // 데이터가 5인 경우를 삭제 (값이 여러개일 경우 한개만 지움) return으로 boolean

        for (int i : list1) {
            System.out.println(i);
        }
        System.out.println("---");

        // 리스트 내에 모든 값 삭제
        for (int i : list3) {
            System.out.println(i);
        }
        System.out.println("---");

        list3.clear();

        for (int i : list3) {
            System.out.println(i);
        }
        System.out.println("---");

        //루프를 돌면 삭제시 for문 대신 iterator를 이용해서 삭제
        //for문으로 삭제를 하면 인덱스 값이 불일치하는 사례가 발생하는데
        //itrator는 안전하게 삭제를 할 수 있음

        //방법1
        /*Iterator iter2 = list1.iterator();
        while (iter2.hasNext()) {
            int value = iter2.next();
            if (value == 3) {
                iter2.remove();
            }
        }*/

        //방법2
        /*for (Iterator iter3 = list1.iterator(); iter3.hasNext(); ) {
            if (iter3.next().equals(3)) {
                iter3.remove();
            }
        }*/

        //방법3 removeIf (jdk8)를 이용한 더 짧은 방법
        list1.removeIf(n -> n == 3);
        list4.removeIf(s -> s.equals("테스트2"));

        for (int i : list1) {
            System.out.println(i);
        }
        System.out.println("---");

        for (String s : list4) {
            System.out.println(s);
        }
        System.out.println("---");

        //검색
        System.out.println(list1.contains(1)); //list에 1값이 있으면 true 없으면 false
        System.out.println(list1.indexOf(5)); //list에 5값이 있으면 인덱스번호 출력 없으면 -1 출력

        System.out.println("---");

        System.out.println(list1.contains(6)); //list에 1값이 있으면 true 없으면 false
        System.out.println(list1.indexOf(6)); // 중복값이 있을경우 맨앞에것을 출력
        System.out.println("---");

        //수정
        list1.set(0, 3); // 0번째 인덱스에 있는 값을 3으로 수정

        for (int i : list1) {
            System.out.println(i);
        }
        System.out.println("--- 수정");

        //응용
        //중복제거1
        ArrayList<String> list5 = new ArrayList<>();
        ArrayList<String> list6 = new ArrayList<>(); //중복이 제거된 리스트
        list5.add("테스트1");
        list5.add("테스트1");
        list5.add("테스트2");
        list5.add("테스트3");
        list5.add("테스트2");
        list5.add("테스트3");

        // list6에 값이 없다면 추가를 하고 있다면 넣지를 않음
        for (int i = 0; i < list5.size(); i++) {
            if (!list6.contains(list5.get(i))) {
                list6.add(list5.get(i));
            }
        }

        for (String s : list6) {
            System.out.println(s);
        }
        System.out.println("---");


        //숫자만 제거, 문자만 제거
        ArrayList<Character> list7 = new ArrayList<>();
        list7.addAll(Arrays.asList('A', 'B', 'C', '1', '2', '3', 'D', '4','E', '5'));

        for (char c : list7) {
            System.out.println(c);
        }
        System.out.println("---");

        //숫자만 삭제
        /*for (Iterator<Character> it7 = list7.iterator(); it7.hasNext(); ) {
            Character c = it7.next();
            if (c.isDigit(c)) {
                it7.remove();
            }
        }*/

        // java8 에서 removeIf를 이용한 삭제 방법
        list7.removeIf(Character::isDigit);

        for (char c : list7) {
            System.out.println(c);
        }
        System.out.println("---");

        // 문자를 지우고 싶다면?
        list7.removeIf(Character::isAlphabetic);

        for (char c : list7) {
            System.out.println(c);
        }
        System.out.println("---");

        //오름차순 정렬, 내림차순 정렬
        ArrayList<Integer> list8 = new ArrayList<>();
        list8.add(2);
        list8.add(5);
        list8.add(8);
        list8.add(1);
        list8.add(3);

        for (int i : list8) {
            System.out.println(i);
        }
        System.out.println("---");

        //오름차순
        Collections.sort(list8);

        for (int i : list8) {
            System.out.println(i);
        }
        System.out.println("---");

        //내림차순
        Collections.sort(list8, Collections.reverseOrder());

        for (int i : list8) {
            System.out.println(i);
        }
        System.out.println("---");

        // 특정값을 수정할려면?
        // 3을 9로 바꾸고 싶다
        ArrayList<Integer> list9 = new ArrayList<>();
        list9.add(1);
        list9.add(2);
        list9.add(3);
        list9.add(4);
        list9.add(3);
        list9.add(5);

        //replaceAll 람다식 이용
        list9.replaceAll(n -> {
            if (n == 3) {
                return 9;
            }
            return n;
        });

        //또는 이방법 사용
        //Collections.replaceAll(list9, 3, 9);

        for (int i : list9) {
            System.out.println(i);
        }
        System.out.println("---특정값 변환");

        // 리스트내값 전부 대문자 소문자로 변환
        ArrayList<String> list10 = new ArrayList<>();
        list10.add("apple");
        list10.add("Banana");
        list10.add("ORANGE");
        list10.add("grape");

        //대문자로 출력
        list10.replaceAll(s -> s.toUpperCase());

        for (String i : list10) {
            System.out.println(i);
        }
        System.out.println("---대문자 변환");

        //대문자로 출력
        list10.replaceAll(s -> s.toLowerCase());

        for (String i : list10) {
            System.out.println(i);
        }
        System.out.println("---소문자 변환");


        /*
        참고 사이트
        https://coding-factory.tistory.com/551
        https://programmers.co.kr/learn/courses/17/lessons/805
        https://mainia.tistory.com/2323
        https://www.daleseo.com/how-to-remove-from-list-in-java/
        https://flatsun.tistory.com/712

         */

    }
}
