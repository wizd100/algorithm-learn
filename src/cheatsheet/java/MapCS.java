package cheatsheet.java;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Iterator;

/*
* hashmap 은 키, 값 으로 구성된 entry 객체를 저장하는 자료구조
* 값은 중복으로 저장될 수 있지만 키값은 중복되지 않음
*
* 많은 양의 데이터를 검색하는데 뛰어난 성능
*
* 만약 저장공간을 알고 있으면 초기선언시 저장공간을 지정해주는게 좋음
*
* 어디서 쓰일까?
*
* 
* */
public class MapCS {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>(10);
        HashMap<String, Integer> map3 = new HashMap<>(10, 5);
        HashMap<String, Integer> map4 = new HashMap<String, Integer>(){{
            put("a", 1);
        }};

        //등록
        //키는 중복이 안됨 만약 중복될 경우 나중것이 덮어쓰기 (순서는 뒤로 안밀리는듯?)
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 2);
        map1.put("b", 3);
        map1.put("e", 4);

        //출력
        System.out.println(map1.get("b"));

        //많은 양의 데이터를 출력할때 좋음
        for (Entry<String, Integer> entry1 : map1.entrySet()) {
            System.out.println(entry1.getKey() + " : " + entry1.getValue());
        }
        System.out.println("--- entry");

        for (String i : map1.keySet()) {
            System.out.println(i + " : " + map1.get(i));
        }
        System.out.println("--- for");

        for (Iterator<String> it1 = map1.keySet().iterator(); it1.hasNext(); ) {
            String i = it1.next();
            System.out.println(i + " : " + map1.get(i));
        }
        System.out.println("--- iterator");

        //key만 출력
        for (String key : map1.keySet()) {
            System.out.println(key);
        }
        System.out.println("--- key");

        //value만 출력
        for (int value : map1.values()) {
            System.out.println(value);
        }
        System.out.println("--- value");

        //삭제
        map1.remove("b");

        for (String i : map1.keySet()) {
            System.out.println(i + " : " + map1.get(i));
        }
        System.out.println("--- remove");

        //검색

        //응용


    }
}
