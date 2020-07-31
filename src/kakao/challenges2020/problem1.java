package kakao.challenges2020;

public class problem1 {
    public static void main(String[] args) {
        String s1 = "aabbaccc";
        String s2 = "ababcdcdababcdcd";
        String s3 = "abcabcdede";
        String s4 = "abcabcabcabcdededededede";
        String s5 = "xababcdcdababcdcd";
        problem1 p1 = new problem1();
        p1.solution(s5);
    }

    public int solution(String s) {
        //첫번째 글자와 뒤에 나올 글자들을 비교해서 같은 글자가 없다면 length() 값
        //압축이기 때문에 절반까지 비교를 해서 같은 값이 없으면 length()가 최대값
        String[] arr = s.split("");
        int half = s.length() / 2;
        //System.out.println(s.length());
        //System.out.println(half);
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(i > half) {
                if(count == 0) {
                    System.out.println("압축 값이 없음 : " + s.length());
                    return s.length();
                }
            }

            /*if(arr[0].equals(arr[])) {

            }*/
            //System.out.println(arr[i]);
        }
        return 1;
    }
}
