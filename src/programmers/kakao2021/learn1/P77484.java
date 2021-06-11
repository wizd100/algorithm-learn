package programmers.kakao2021.learn1;

public class P77484 {
    public static void main(String[] args) {
        solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19});
        //solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35});
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int matchCount = 0;
        int zeroCount = 0;
        int topRank = 0;
        int lowestRank = 0;

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCount++;
            }

            for (int j = 0; j < lottos.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    matchCount++;
                    break;
                }
            }
        }

        topRank = rank(matchCount + zeroCount);
        lowestRank = rank(matchCount);

        return new int[]{topRank, lowestRank};
    }

    public static int rank(int count) {
        int result = 0;

        switch (count) {
            case 6:
                result = 1;
                break;
            case 5:
                result = 2;
                break;
            case 4:
                result = 3;
                break;
            case 3:
                result = 4;
                break;
            case 2:
                result = 5;
                break;
            default:
                result = 6;
                break;
        }

        return result;
    }
}
