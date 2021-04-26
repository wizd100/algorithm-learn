package programmers.kakao2021.learn1;

import java.util.Iterator;
import java.util.TreeSet;

public class P68644 {
    public static void main(String[] args) {
        solution(new int[]{2,1,3,4,1});
        solution(new int[]{5,0,2,7});
    }

    public static int[] solution(int[] numbers) {
        int[] answer;
        TreeSet<Integer> arr = new TreeSet<>();
        int idx = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.printf("%d + %d = %d\n", numbers[i], numbers[j], numbers[i] + numbers[j]);
                arr.add(numbers[i] + numbers[j]);
            }
        }

        System.out.println(arr);

        answer = new int[arr.size()];

        Iterator iterator = arr.iterator();
        while (iterator.hasNext()) {
            answer[idx++] = (int)iterator.next();
        }

        return answer;
    }
}
