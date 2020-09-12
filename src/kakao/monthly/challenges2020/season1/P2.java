package kakao.monthly.challenges2020.season1;

public class P2 {
    public static void main(String[] args) {
        int n1 = 4; //{1,2,9,3,10,8,4,5,6,7}
        int n2 = 5; //{1,2,12,3,13,11,4,14,15,10,5,6,7,8,9}
        int n3 = 6; //{1,2,15,3,16,14,4,17,21,13,5,18,19,20,12,6,7,8,9,10,11}
        System.out.println(solution2(n1));
        System.out.println(solution2(n2));
        System.out.println(solution2(n3));
    }

    public static int[] solution(int n) {
        int[] answer = {};
        return answer;
    }

    public static int[] solution2(int n) {
        int max = n * (n + 1) / 2;
        int[] answer = new int[max];
        int startIndex;
        int lastIndex;
        int value;
        int count;

        //System.out.println(max);

        //맨 마지막 줄 값 입력
        startIndex = max - n;
        for (int i = n; i < n * 2; i++) {
            //System.out.println(i);
            answer[startIndex++] = i;
        }

        //거꾸로 값 등록
        startIndex = max - n; //마지막 칸 시작인덱스
        lastIndex = max - 1; //마지막 칸 종료인덱스
        for (int i = n - 1; i > 0; i--) {
            if (i == 1) {
                answer[0] = 1;
                break;
            }
            answer[startIndex - i] = i;
            answer[lastIndex - i - 1] = answer[lastIndex] + 1;
            startIndex = startIndex - i;
            lastIndex = lastIndex - i - 1;
            /*for (int j = 0; j < answer.length; j++) {
                System.out.printf("%d ", answer[j]);
            }
            System.out.println();*/
        }

        //빈곳 다시 채우기
        startIndex = 4;
        lastIndex = 4;
        value = answer[2];
        count = 3;
        for (int i = startIndex; i < max; i = startIndex) {
            if (count >= n) {
                break;
            }
            for (int j = i; j <= lastIndex; j++) {
                answer[j] = ++value;
            }
            startIndex += count;
            count++;
            lastIndex += count;
            for (int j = 0; j < answer.length; j++) {
                System.out.printf("%d ", answer[j]);
            }
            System.out.println();
        }

        //디버깅
        for (int i = 0; i < answer.length; i++) {
            System.out.printf("%d ", answer[i]);
        }


        return answer;
    }
}
