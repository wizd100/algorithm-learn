package kakao.challenges2018.third;


public class P1 {
    public static void main(String[] args) {
        System.out.println(solution2(2, 4, 2, 1)); // 0111
        //System.out.println(solution2(16, 16, 2, 1)); // 02468ACE11111111
        //System.out.println(solution2(16, 16, 2, 2)); // 13579BDF01234567
    }

    public static String solution(int n, int t, int m, int p) {
        String answer = "";
        return answer;
    }

    public static String solution2(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        StringBuilder str = new StringBuilder("0");

        System.out.println(str.toString());

        while (str.length() - 1 > t * m) {
            StringBuilder subStr = new StringBuilder();
            
        }

        return answer.toString();
    }

    public static String solution3(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder("");
        StringBuilder str = new StringBuilder("0");

        String[] alphabet = {"A", "B", "C", "D", "E", "F"};

        int num = 1;

        while (str.length() - 1 < t * m) {
            StringBuilder subStr = new StringBuilder("");
            int quot = num;
            int remain;

            while (quot > 0) {
                remain = quot % n;
                quot = quot / n;

                if (remain >= 10 && remain <= 15) {
                    subStr.append(alphabet[remain - 10]);
                } else {
                    subStr.append(remain);
                }
            }
            str.append(subStr.reverse());
            num++;
        }

        int tubePlace = p;

        for (int i = 0; i < t; i++) {
            answer.append(str.charAt(tubePlace - 1));
            tubePlace += m;
        }

        return answer.toString();
    }
}
