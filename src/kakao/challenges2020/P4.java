package kakao.challenges2020;

import java.util.ArrayList;

public class P4 {
    public static void main(String[] args) {
        String[] words1 = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
        String[] queries1 = {"fro??", "????o", "fr???", "fro???", "pro?"};
        String[] words2 = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
        String[] queries2 = {"fro??", "????o", "fr???", "fro???", "pro?" , "?????", "fro???"};
        System.out.println(solution(words1, queries1)); //[3, 2, 4, 1, 0]
        System.out.println(solution(words2, queries2)); //[3, 2, 4, 1, 0]
    }

    public static int[] solution(String[] words, String[] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            ArrayList<String> wordList = new ArrayList<>();
            int count = 0;

            //wordList 필터
            for (int j = 0; j < words.length; j++) {
                //쿼리 글자수로 워드 필터
                if (queries[i].length() == words[j].length()) {
                    wordList.add(words[j]);
                }
            }

            //쿼리 영문과 물음표를 분리
            //물음표 범위
            int questionStart = queries[i].indexOf("?");
            int questionEnd = queries[i].lastIndexOf("?");
            int queriesWordStart = -1;
            int queriesWordEnd = -1;
            String queriesWord = "";


            //영문과 영문 범위
            if (questionStart == 0) { //물음표가 앞에서 시작할때
                queriesWord = queries[i].substring(questionEnd + 1);
                queriesWordStart = questionEnd + 1;
                queriesWordEnd = queries[i].length() - 1;
            } else {
                queriesWord = queries[i].substring(0, questionStart);
                queriesWordStart = 0;
                queriesWordEnd = questionStart - 1;
            }

            //쿼리가 전부 물음표일때 (쿼리에 단어가 없을때)
            if (questionStart == 0 && questionEnd == queries[i].length() - 1) {
                count = wordList.size();
            } else {
                for (int j = 0; j < wordList.size(); j++) {
                    if (wordList.get(j).substring(queriesWordStart, queriesWordEnd + 1).equals(queriesWord)) {
                        count++;
                    }
                }
            }
            answer[i] = count;
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

        return answer;
    }

    public static int[] solution2(String[] words, String[] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            ArrayList<String> wordList = new ArrayList<>();
            int count = 0;

            //wordList 필터
            System.out.println("-글자수필터시작-");
            for (int j = 0; j < words.length; j++) {
                //쿼리 글자수로 워드 필터
                if (queries[i].length() == words[j].length()) {
                    System.out.println(words[j]);
                    wordList.add(words[j]);
                }
            }
            System.out.println("-글자수필터끝-");

            //쿼리 영문과 물음표를 분리
            //물음표 범위
            int questionStart = queries[i].indexOf("?");
            int questionEnd = queries[i].lastIndexOf("?");
            int queriesWordStart = -1;
            int queriesWordEnd = -1;
            String queriesWord = "";


            //영문과 영문 범위
            if (questionStart == 0) { //물음표가 앞에서 시작할때
                queriesWord = queries[i].substring(questionEnd + 1);
                queriesWordStart = questionEnd + 1;
                queriesWordEnd = queries[i].length() - 1;
            } else {
                queriesWord = queries[i].substring(0, questionStart);
                queriesWordStart = 0;
                queriesWordEnd = questionStart - 1;
            }
            //쿼리가 전부 물음표일때 (쿼리에 단어가 없을때)
            if (questionStart == 0 && questionEnd == queries[i].length() - 1) {
                queriesWordStart = -1;
                queriesWordEnd = -1;
            }

            //디버깅
            /*System.out.println("단어 일부분 " + queriesWord);
            if (queriesWordStart != -1) {
                System.out.println("단어 범위 " + queries[i].charAt(queriesWordStart));
                System.out.println("단어 범위 " + queries[i].charAt(queriesWordEnd));
                System.out.println("단어 범위로 단어 " + queries[i].substring(queriesWordStart, queriesWordEnd + 1));
            }*/

            //쿼리 영문을 필터
            System.out.println("-단어 일부분 체크 시작- : " + queriesWord);

            //쿼리가 전부 물음표일때 (쿼리에 단어가 없을때)
            if (questionStart == 0 && questionEnd == queries[i].length() - 1) {
                count = wordList.size();
            } else {
                for (int j = 0; j < wordList.size(); j++) {
                    if (wordList.get(j).substring(queriesWordStart, queriesWordEnd + 1).equals(queriesWord)) {
                        System.out.println(wordList.get(j));
                        count++;
                    }
                }
            }
            System.out.println("-단어 일부분 체크 끝-");
            answer[i] = count;
            System.out.println("체크 수 : " + count);

            //물음표 검색
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

        return answer;
    }
}
