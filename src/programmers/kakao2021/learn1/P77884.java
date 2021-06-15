package programmers.kakao2021.learn1;

public class P77884 {
    public static void main(String[] args) {
        solution(13, 17);
        solution(24, 27);
    }

    public static int solution(int left, int right) {
        int answer = 0;
        int count;

        for (int i = left; i <= right; i++) {
            count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) { //약수 찾기
                    count++;
                }
            }


            //약수의 개수가 짝수일때 수를 더하고 홀수일때 수를 뺌
            if (count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }

        }

        //System.out.println(answer);

        return answer;
    }
}
