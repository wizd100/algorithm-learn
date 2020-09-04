package cheatsheet.java;

import java.util.HashSet;

/**
 * Set 특징
 * 자료의 중복 저장이 안됨
 * 저장 순서를 유지하지 않음 ( 순서가 필요하다면 LinkedHashSet 이용 )
 * HashSet 중복 자료 입력이 불가
 * TreeSet 중복자료 입력이 불가, 자료가 정렬돼서 저장
 */
public class SetCS {
    public static void main(String[] args) {
        System.out.println(1);
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("a");
        set.add("b");
        System.out.println(set);
    }
}
