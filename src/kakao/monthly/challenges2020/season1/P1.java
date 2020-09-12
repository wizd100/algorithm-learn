package kakao.monthly.challenges2020.season1;

import java.util.Iterator;
import java.util.TreeSet;

public class P1 {
    public static void main(String[] args) {
        int[] num1 = {2,1,3,4,1};
        System.out.println(solution2(num1));
    }

    public static int[] solution(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[set.size()];
        int count = 0;

        for (Iterator<Integer> it = set.iterator(); it.hasNext(); ) {
            int num = it.next();
            answer[count++] = num;
        }

        return answer;
    }

    public static int[] solution2(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                //System.out.println(numbers[i] + " : " + numbers[j]);
                set.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[set.size()];
        int count = 0;

        for (Iterator<Integer> it = set.iterator(); it.hasNext(); ) {
            int num = it.next();
            answer[count++] = num;
            //System.out.println(num);
        }

        for (int i = 0; i < answer.length; i++) {
            //System.out.println(answer[i]);
        }

        return answer;
    }
}
