package programmers.kakao2021.learn1;

import java.util.*;

public class P42889 {
    public static void main(String[] args) {
        //solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
        solution(5, new int[]{1,2,2,1,3}); // 테스트케이스 1,6,7,9,13,23,24,25 0 나누기 이슈
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] stageCount = new int[N];
        Map<Integer, Double> failPercent = new HashMap<>();
        int total = stages.length;

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] == N + 1) { // 마지막 스테이지를 클리어한 것은 제외
                continue;
            }
            stageCount[stages[i] - 1]++;
        }

        for (int i = 0 ; i < stageCount.length; i++) {
            if (total == 0) { //스테이지에 도달한 유저가 없을때, 0으로 나눌때
                failPercent.put(i, 0d);
                continue;
            }
            failPercent.put(i, (double)stageCount[i] / (double)total);
            total -= stageCount[i];
        }

        /*for (int key : failPercent.keySet()) {
            System.out.println(key + 1 + " : " + failPercent.get(key));
        }*/

        for (int i = 0; i < N; i++) {
            double max = -1;
            int maxKey = 0;

            for (int key : failPercent.keySet()) {
                if (max < failPercent.get(key)) {
                    max = failPercent.get(key);
                    maxKey = key;
                }
            }

            answer[i] = maxKey + 1;
            failPercent.remove(maxKey);
        }

        //System.out.println(Arrays.toString(answer));

        return answer;
    }
}
