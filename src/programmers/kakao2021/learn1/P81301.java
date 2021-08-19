package programmers.kakao2021.learn1;

public class P81301 {
    public static void main(String[] args) {
        solution("one4seveneight");
        solution("123");
    }

    public static int solution(String s) {
        s = s.replaceAll("zero", "0");
        s = s.replaceAll("one", "1");
        s = s.replaceAll("two", "2");
        s = s.replaceAll("three", "3");
        s = s.replaceAll("four", "4");
        s = s.replaceAll("five", "5");
        s = s.replaceAll("six", "6");
        s = s.replaceAll("seven", "7");
        s = s.replaceAll("eight", "8");
        s = s.replaceAll("nine", "9");

        return Integer.parseInt(s);
    }

    public static int solution2(String s) {
        String[] convert = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < convert.length; i++) {
            s = s.replaceAll(convert[i], Integer.toString(i));
        }

        return Integer.parseInt(s);
    }
}
