package kakao.challenges2020;

public class P1 {
    public static void main(String[] args) {
        System.out.println(solution("aabbaccc")); //7
        System.out.println(solution("ababcdcdababcdcd")); //9
        System.out.println(solution("abcabcdede")); //8
        System.out.println(solution("abcabcabcabcdededededede")); //14
        System.out.println(solution("xababcdcdababcdcd")); //17
    }

    public static int solution(String s) {
        int answer = s.length(); //압축되는 값이 없으면 최대값 입력

        //len 만큼 문자열을 자르기
        for (int len = 1; len <= s.length() / 2; len++) {
            String str = "";

            //첫번째 문자
            for (int i = 0; i < s.length(); i += len) {
                String word1 = "";
                int count = 1;

                if (i + len > s.length()) {
                    word1 = s.substring(i, s.length());
                } else {
                    word1 = s.substring(i, i + len);
                }

                //그다음 문자
                for (int j = i + len; j < s.length(); j += len) {
                    String word2 = "";
                    if (j + len > s.length()) {
                        word2 = s.substring(j, s.length());
                    } else {
                        word2 = s.substring(j, j + len);
                    }

                    //word1, word2 글자를 비교해서 카운트 추가하고 i에 다음값 입력
                    //다음 문자가 다르면 취소
                    if (word1.equals(word2)) {
                        count++;
                        i = j;
                    } else {
                        break;
                    }
                }

                if (count == 1) {
                    str += word1;
                } else {
                    str += count + word1;
                }

            }
            answer = answer > str.length() ? str.length() : answer;
        }

        return answer;
    }

    public static int solution2(String s) {
        int answer = s.length();

        // len 글자만큼 자르기
        for (int len = 1; len <= s.length() / 2; len++) {
            String str = "";

            //글자 비교
            for (int i = 0; i < s.length(); i += len) {
                String word1 = "";
                String word2 = "";
                int count = 1;

                if (i + len > s.length()) {
                    word1 = s.substring(i, s.length());
                } else {
                    word1 = s.substring(i, i + len);
                }

                //다음글자 뽑아내기
                for (int j = i + len; j < s.length(); j += len) {
                    if (j + len > s.length()) {
                        word2 = s.substring(j, s.length());
                    } else {
                        word2 = s.substring(j, j + len);
                    }

                    if (word1.equals(word2)) {
                        count++;
                        i = j;
                    } else {
                        break;
                    }
                }

                if (count == 1) {
                    str += word1;
                } else {
                    str += count + word1;
                }
                System.out.println(str);
            }

            if (answer > str.length()) {
                answer = str.length();
            }
        }

        return answer;
    }

    public static int solution3(String s) {
        int answer = 0;

        //1글자 ~ 문자열 / 2 만큼 자르기
        for (int i = 1; i <= s.length() / 2; i++) {
            StringBuilder temp = new StringBuilder();

            //자르는 문자열 만큼 증가
            for (int j = 0; j < s.length(); j = j + i) {
                String word = "";
                int count = 1;
                StringBuilder sb = new StringBuilder();

                //맨 마지막 문자열 자를시 범위가 넘어간다면
                if (i + j >= s.length()) {
                    word = s.substring(j, s.length());
                } else {
                    word = s.substring(j, j + i);
                }


            }
        }

        return answer;
    }

    public static int solution4(String s) {
        int answer = Integer.MAX_VALUE;

        for (int i = 1; i < s.length(); i++) {
            String compressed = "";
            String target = "";
            String current = "";
            int cnt = 1;

            // 첫번째 문자
            for (int j = 0; j < i; j++) {
                target += s.charAt(i);
            }

            // 다음 문자와 첫번재 문자 비교
            for (int j = i; j < s.length(); j += i) {
                current = "";
                for (int k = j; k < j + i; k++) {
                    if (k >= s.length()) {
                        break;
                    }
                    current += s.charAt(k);
                }

                if (target.equals(current)) {
                    cnt++;
                } else {
                    if (cnt > 1) {
                        compressed += cnt + target;
                    } else {
                        compressed += target;
                    }
                    cnt = 1;
                    target = current;
                }
            }

            if (cnt > 1) {
                compressed += cnt + target;
            } else {
                compressed += target;
            }

            int length = compressed.length();
            answer = answer > length ? length : answer;
        }

        if (answer == Integer.MAX_VALUE) {
            answer = 1;
        }

        return answer;
    }
}
