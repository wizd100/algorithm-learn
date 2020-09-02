package kakao.challenges2018;

import java.util.List;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.Iterator;

/*
조건
1 영문 2글자만 유효함
2 대소문자 구분하지 않음
3 출력시 자카드 유사도 * 66536 (나머지는 버림 처리)

다중입력이 되기 때문에 Set 은 쓰면 안될듯
 */
public class P5 {
    public static void main(String[] args) {
        System.out.println(solution("FRANCE", "french")); //16384
        System.out.println(solution("handshake", "shake hands")); //65536
        System.out.println(solution("aa1+aa2", "AAAA12")); //43690
        System.out.println(solution("E=M*C^2", "e=m*c^2")); //65536
    }

    public static int solution(String str2, String str1) {
        int answer = 0;
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        List<String> listIntersection;
        List<String> listUnion;
        double jaccardSimilarity;

        // 2글자씩 잘라서 배열에 입력
        strInArr(str1, arr1);
        strInArr(str2, arr2);

        // 영문 2글자를 제외한 나머지는 제거
        validArr(arr1);
        validArr(arr2);

        // 공집합일 경우 리턴
        if (arr1.size() == 0 && arr2.size() == 0) {
            return 65536;
        }

        // 교집합인 값을 리스트에 입력
        listIntersection = intersection(arr1, arr2);

        // 합집합인 값을 리스트에 입력
        listUnion = union(arr1, arr2);

        // 자카드 유사도 값 계산
        jaccardSimilarity = jaccardSimilarity(listIntersection.size(), listUnion.size());

        answer = (int)(jaccardSimilarity * 65536);

        return answer;
    }

    public static int solution2(String str2, String str1) {
        int answer = 0;

        ArrayList<String> arrStr1 = new ArrayList<>(str1.length() - 1);
        ArrayList<String> arrStr2 = new ArrayList<>(str2.length() - 1);
        List<String> listIntersection;
        List<String> listUnion;
        double jaccardSimilarity;

        //2글자씩 나눠서 배열에 입력
        //조건2 대소문자 구분안함
        strInArr(str1, arrStr1);
        strInArr(str2, arrStr2);

        //조건1 영문 2글자만 유효 나머지는 제거
        validArr(arrStr1);
        validArr(arrStr2);

        // 공집합일 경우 리턴
        if (arrStr1.size() == 0 && arrStr2.size() == 0) {
            return 65536;
        }

        //교집합 intersection
        listIntersection = intersection(arrStr1, arrStr2);
        System.out.println("교집합");
        for (int i = 0; i < listIntersection.size(); i++) {
            System.out.println(listIntersection.get(i));
        }

        //합집합 union
        listUnion = union(arrStr1, arrStr2);
        System.out.println("합집합");
        for (int i = 0; i < listUnion.size(); i++) {
            System.out.println(listUnion.get(i));
        }

        jaccardSimilarity = jaccardSimilarity(listIntersection.size(), listUnion.size());
        //System.out.println(listIntersection.size());
        //System.out.println(listUnion.size());
        //System.out.println(jaccardSimilarity);

        answer = (int)(jaccardSimilarity * 65536);

        for (int i = 0; i < arrStr1.size(); i++) {
            //System.out.println(arrStr1.get(i));
        }
        System.out.println("--");
        for (int i = 0; i < arrStr2.size(); i++) {
            //System.out.println(arrStr2.get(i));
        }

        return answer;
    }

    private static void strInArr(String str, ArrayList<String> arr) {
        for (int i = 0; i < str.length() - 1; i++) {
            arr.add(str.substring(i, i + 2).toLowerCase());
        }
    }

    private static void validArr(ArrayList<String> arr) {
        for (Iterator<String> it = arr.iterator(); it.hasNext(); ) {
            String str = it.next();
            if (!Pattern.matches("^[a-z]*$", str)) {
                it.remove();
            }
        }
    }

    //교집합
    //배열의 데이터가 중복으로 들어가 있지 않으면 정상작동이지만 만약에
    // {aa,aa} {aa, aa, aaa} 를 비교하면 통과하지만 {aa, aa, aaa} {aa,aa} 순서를 바꾸면 값이 달라짐
    private static List<String> intersection(ArrayList<String> arr1, ArrayList<String> arr2) {
        List<String> list = new ArrayList<>();
        ArrayList<String> copyArr1 = new ArrayList<>(arr1);
        ArrayList<String> copyArr2 = new ArrayList<>(arr2);

        for (Iterator<String> it1 = copyArr1.iterator(); it1.hasNext(); ) {
            String str1 = it1.next();
            for (Iterator<String> it2 = copyArr2.iterator(); it2.hasNext(); ) {
                String str2 = it2.next();
                if (str1.equals(str2)) {
                    list.add(str2);
                    it1.remove();
                    it2.remove();
                    break;
                }
            }
        }

        return list;
    }

    //합집합
    private static List<String> union(ArrayList<String> arr1, ArrayList<String> arr2) {
        List<String> list = new ArrayList<>();
        ArrayList<String> copyArr1 = new ArrayList<>(arr1);
        ArrayList<String> copyArr2 = new ArrayList<>(arr2);

        for (Iterator<String> it1 = copyArr1.iterator(); it1.hasNext(); ) {
            String str1 = it1.next();
            for (Iterator<String> it2 = copyArr2.iterator(); it2.hasNext(); ) {
                String str2 = it2.next();
                if (str1.equals(str2)) {
                    list.add(str2);
                    it1.remove();
                    it2.remove();
                    break;
                }
            }
        }

        for (String str : copyArr1) {
            list.add(str);
        }

        for (String str : copyArr2) {
            list.add(str);
        }

        return list;
    }

    private static double jaccardSimilarity(int intersection, int union) {
        return (double)intersection / (double)union;
    }
}
