package kakao.challenges2020;

public class P2 {
    public static void main(String[] args) {
        System.out.println(solution("(()())()")); // (()())()
        System.out.println(solution(")(")); // ()
        System.out.println(solution("()))((()")); // ()(())()
    }

    public static String solution(String p) {
        String answer = "";
        answer = convert2(p);
        return answer;
    }

    public static String solution2(String p) {
        String answer = "";

        answer = solve(p);

        return answer;
    }

    public static String solve(String p) {
        if (p.length() == 0) {
            return "";
        }

        int parentheses1 = 0; //소괄호 (
        int parentheses2 = 0; //소괄호 )
        String u = "";
        String v = "";
        int i;
        String tmp = "";

        //괄호 개수 체크해서 짝이 맞으면 u, v 나눔
        for (i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') {
                parentheses1++;
            } else if (p.charAt(i) == ')') {
                parentheses2++;
            }

            if (parentheses1 == parentheses2) {
                break;
            }
        }

        u = p.substring(0, i + 1);
        v = p.substring(i + 1);

        //괄호 변경
        //올바른 괄호인지 체크
        if (u.charAt(0) == '(') {
            u += solve(v);
        } else {
            tmp = '(' + solve(v) + ')';
            u = u.substring(1, u.length() - 1);
            u = reverse(u);
            return tmp + u;
        }


        //모든 문자열 합치기
        return u;
    }

    public static String reverse(String p) {
        String tmp = "";

        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') {
                tmp += ')';
            } else {
                tmp += '(';
            }
        }

        return tmp;
    }

    public static String solution3(String p) {
        String answer = "";
        answer = convert(p);
        return answer;
    }

    public static String convert(String p) {
        if (p.equals("")) {
            return "";
        }

        int left = 0; // ( 개수 체크
        int right = 0; // ) 개수 체크
        int i;

        for (i = 0; i < p.length(); i++) {
            char s = p.charAt(i);
            if (s == '(') {
                left++;
            } else {
                right++;
            }

            if (left == right) {
                break;
            }
        }

        String u = p.substring(0, i + 1);
        String v = p.substring(i + 1);

        if (isRight(u)) {
            u += convert(v);
        } else {
            String emp = "(" + convert(v) + ")";
            u = u.substring(1, u.length() - 1);
            u = u.replaceAll("\\(","\\/").replaceAll("\\)","\\(").replaceAll("\\/","\\)");
            emp += u;
            return emp;
        }

        return u;
    }

    public static boolean isRight(String u) {
        while (!u.equals("")) {
            if (u.charAt(0) == ')') {
                return false;
            }
            u = u.replaceAll("\\(\\)","");
        }

        return true;
    }

    private static String convert2(String p) {
        //입력이 빈 문자열인 경우, 빈 문자열을 반환합니다.
        if (p.length() == 0) {
            return "";
        }

        int parentheses1 = 0; //소괄호 (
        int parentheses2 = 0; //소괄호 )
        String u = "";
        String v = "";
        int i;

        //문자열 w를 두 "균형잡힌 괄호 문자열" u, v로 분리합니다. 단, u는 "균형잡힌 괄호 문자열"로 더 이상 분리할 수 없어야 하며, v는 빈 문자열이 될 수 있습니다.
        for (i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') {
                parentheses1++;
            } else {
                parentheses2++;
            }

            if (parentheses1 == parentheses2) {
                break;
            }
        }

        u = p.substring(0, i + 1);
        v = p.substring(i + 1);

        if (u.charAt(0) == '(') {
            //문자열 u가 "올바른 괄호 문자열" 이라면 문자열 v에 대해 1단계부터 다시 수행합니다.
            //수행한 결과 문자열을 u에 이어 붙인 후 반환합니다.
            u += convert2(v);

            return u;
        } else {
            //문자열 u가 "올바른 괄호 문자열"이 아니라면 아래 과정을 수행합니다.
            //빈 문자열에 첫 번째 문자로 '('를 붙입니다.
            //문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열을 이어 붙입니다.
            //')'를 다시 붙입니다.
            String tmp = '(' + convert2(v) + ')';

            //u의 첫 번째와 마지막 문자를 제거하고, 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙입니다.
            u = u.substring(1, u.length() - 1);
            u = reverse2(u);
            tmp = tmp + u;

            //생성된 문자열을 반환합니다.
            return tmp;
        }
    }

    public static String reverse2(String p) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') {
                sb.append(")");
            } else {
                sb.append("(");
            }
        }

        return sb.toString();
    }
}
