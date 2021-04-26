package programmers.kakao2021.learn1;

public class P68935 {
    public static void main(String[] args) {
        solution2(45);
    }

    public static int solution(int n) {
        int answer;
        String base3 = "";

        while (n != 0) {
            base3 += Integer.toString(n % 3);
            n /= 3;
        }

        System.out.println(base3);

        System.out.println(Integer.parseInt(base3, 3));

        answer = Integer.parseInt(base3, 3);

        return answer;
    }

    public static int solution2(int n) {
        int answer;
        String base3 = "";
        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            base3 = (n % 3) + base3;
            n /= 3;
        }

        System.out.println(base3);

        base3 = sb.append(base3).reverse().toString();

        System.out.println(base3);

        System.out.println(Integer.parseInt(base3, 3));

        answer = Integer.parseInt(base3, 3);

        return answer;
    }
}
