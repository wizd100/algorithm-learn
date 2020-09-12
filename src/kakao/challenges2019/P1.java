package kakao.challenges2019;

import java.util.ArrayList;
import java.util.HashMap;

public class P1 {
    public static void main(String[] args) {
        String[] str1 = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        System.out.println(solution(str1)); //["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]
    }

    public static String[] solution(String[] record) {
        String[] answer = {};
        return answer;
    }

    //split을 너무 많이 사용, if문이 너무 많음
    //프로그래머스에서 채점시 런타임 에러가 남
    public static String[] solution2(String[] record) {
        HashMap<String, String> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < record.length; i++) {
            //record[i].split(" ")[0] Enter, Leave, Change
            //record[i].split(" ")[1] uid
            //record[i].split(" ")[2] nickanme
            if (record[i].split(" ")[0].equals("Enter")
                    || record[i].split(" ")[0].equals("Change")) {
                //System.out.println(record[i].split(" ")[1]);
                //System.out.println(record[i].split(" ")[2]);
                map.put(record[i].split(" ")[1], record[i].split(" ")[2]);
            }

            if (record[i].split(" ")[0].equals("Enter")
                    || record[i].split(" ")[0].equals("Change")) {
                count++;
            }
        }

        String[] answer = new String[count];
        //System.out.println(map.get("uid1234"));

        for (String i : map.keySet()) {
            //System.out.println(map.get(i));

        }

        for (int i = 0; i < record.length; i++) {
            if (record[i].split(" ")[0].equals("Enter")) {
                answer[i] = map.get(record[i].split(" ")[1]) + "님이 들어왔습니다.";
            } else if(record[i].split(" ")[0].equals("Leave")) {
                answer[i] = map.get(record[i].split(" ")[1]) + "님이 나갔습니다.";
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

        return answer;
    }

    public static String[] solution3(String[] record) {
        ArrayList<String> chatLog = new ArrayList<>();
        HashMap<String, String> nickMap = new HashMap<>();

        for (String log : record) {
            if (!log.split(" ")[0].equals("Leave")) {
                nickMap.put(log.split(" ")[1], log.split(" ")[2]);
            }
        }
        for (String log : record) {
            String[] logSplit = log.split(" ");
            switch (logSplit[0]) {
                case "Enter":
                    chatLog.add(nickMap.get(logSplit[1]) + "님이 들어왔습니다.");
                    break;
                case "Leave":
                    chatLog.add(nickMap.get(logSplit[1]) + "님이 나갔습니다.");
                    break;
            }
        }

        String[] answer = new String[chatLog.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = chatLog.get(i);
        }

        return answer;
    }
}
