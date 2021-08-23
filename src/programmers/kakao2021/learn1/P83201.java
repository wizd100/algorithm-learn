package programmers.kakao2021.learn1;

public class P83201 {
    public static void main(String[] args) {
        solution(new int[][]{{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}});
        solution(new int[][]{{50,90},{50,87}});
        solution(new int[][]{{75, 50, 100}, {75, 100, 20}, {100, 100, 20}});
    }

    public static String solution(int[][] scores) {
        String answer = "";

        for (int i = 0; i < scores.length; i++) {
            int ownScore = scores[i][i];
            boolean sameScore = true;
            int max = scores[0][i];
            int min = scores[0][i];
            int sum = 0;
            int divide = 0;
            double avg;

            for (int j = 0; j < scores.length; j++) {
                //자기자신의 값과 똑같은 값 찾기
                if (i != j && ownScore == scores[j][i]) {
                    sameScore = false;
                }

                //열 비교
                if (max < scores[j][i]) {
                    max = scores[j][i];
                }
                if (min > scores[j][i]) {
                    min = scores[j][i];
                }

                sum += scores[j][i];
                divide++;
            }

            //유일한 최대, 최저일 경우 제외
            if (sameScore && (max == ownScore || min == ownScore)) {
                sum -= ownScore;
                divide--;
            }

            avg = (double)sum / (double)divide;
            answer += getRank(avg);
        }

        System.out.println(answer);

        return answer;
    }

    public static String getRank(double score) {
        if (score >= 90) {
            return "A";
        }
        if (score >= 80) {
            return "B";
        }
        if (score >= 70) {
            return "C";
        }
        if (score >= 50) {
            return "D";
        }

        return "F";
    }
}
