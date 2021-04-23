package programmers.kakao2021.learn1;

public class P76501 {
    public static void main(String[] args) {
        solution(new int[]{4,7,12}, new boolean[]{true,false,true});
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }

        return answer;
    }
}
