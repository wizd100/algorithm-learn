package kakao.monthly.challenges2020.season1.sep;

public class P1 {
    public static void main(String[] args) {
        System.out.println(solution(45)); //7
        System.out.println(solution(125)); //229
    }

    public static int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        //3진수
        while (n != 0) {
            sb.append(n % 3);
            n /= 3;
        }

        String base3 = sb.toString();

        int count = 0;
        for (int i = base3.length() - 1; i >= 0; i--) {
            answer += Math.pow(3, count++) * Character.getNumericValue(base3.charAt(i));
        }

        return answer;
    }
}
