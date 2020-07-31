package programmers.coding.test.hash;

import java.util.ArrayList;
import java.util.Arrays;

public class problem1 {
    public static void main(String[] args) {
        problem1 sol = new problem1();
        //String[] participant = {"leo", "kiki", "eden"};
        //String[] completion = {"eden", "kiki"};
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        //sol.solution1(participant, completion);
        sol.solution2(participant, completion);
    }

    // n * (n - 1) + 1 = n^2 - n + 1

    public String solution1(String[] participant, String[] completion) {
        for(int i = 0; i < participant.length; i++) {
            for(int j = 0; j < completion.length; j++) {
                if(participant[i].equals(completion[j])) {
                    participant[i] = "";
                    completion[j] = "";
                }
            }
        }

        for(int i = 0; i < participant.length; i++) {
            if(!participant[i].equals("")) {
                System.out.println("완주하지 못한 선수 : " + participant[i]);
            }
        }

        return ""; //error
    }

    public String solution2(String[] participant, String[] completion) {
        ArrayList<String> pArr = new ArrayList<String>(Arrays.asList(participant));
        ArrayList<String> cArr = new ArrayList<String>(Arrays.asList(completion));

        for(int i = 0; i < pArr.size(); i++) {
            System.out.println(pArr.get(i));

        }

        return "";
    }
}
