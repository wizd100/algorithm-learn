package kakao.challenges2018;

import java.util.Arrays;
import java.util.LinkedList;

public class P3 {
    public static void main(String[] args) {
        String[] cities1 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}; //50
        String[] cities2 = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}; //21
        String[] cities3 = {"Jeju", "Pangyo", "NewYork", "newyork"}; //16
        String[] cities4 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}; //25

        //solution(3, cities3);
        //System.out.println(solution(0, cities4));
        System.out.println(solution2(3, cities2));
    }

    public static int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        int answer = 0;
        String[] cache = new String[cacheSize];

        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();

            if (Arrays.asList(cache).contains(city)) {
                answer += 1;
            } else {
                cache[i % cacheSize] = city;
                answer += 5;
            }

        }

        return answer;
    }

    static final int CACHE_HIT = 1;
    static final int CACHE_MISS = 5;

    // https://velog.io/@hyeon930/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%BA%90%EC%8B%9C-Java
    public static int solution2(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        int answer = 0;

        LinkedList<String> cache = new LinkedList<>();

        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();

            // cache hit
            if (cache.remove(city)) { //boolean형 remove도 있음 검색함수를 쓰지 않아도 될듯
                cache.addFirst(city);
                answer += CACHE_HIT;
            } else { // cache miss
                int currentSize = cache.size();

                if (currentSize == cacheSize) {
                    cache.pollLast(); //removeLast는 값이 없다면 에러문 출력하기 때문에
                }

                cache.addFirst(city);
                answer += CACHE_MISS;
            }
        }
        return answer;
    }
}
