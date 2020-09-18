package baekjoon;

import java.util.HashMap;
import java.util.Scanner;

public class P1157 {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        char maxKey;
        int maxValue;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        s = s.toUpperCase();

        //getOrDefault(key, default) -> map에 키값이 있다면 value 값 리턴, 없다면  default 값 리턴
        //if 문으로 containsKey 로 체크를 하는것 보다 더 깔끔하게 코드작성
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        maxKey = s.charAt(0);
        maxValue = 0;

        for (char c : map.keySet()) {
            if (maxValue < map.get(c)) {
                maxValue = map.get(c);
                maxKey = c;
            }
        }

        for (char c : map.keySet()) {
            if (map.get(c) == maxValue) {
                if (++count >= 2) {
                    System.out.println("?");
                    return;
                }
            }
        }

        System.out.println(maxKey);
    }
}
