package programmers.coding.test.hash;

public class problem1 {
    public static void main(String[] args) {
        problem1 sol = new problem1();
        //String[] participant = {"leo", "kiki", "eden"};
        //String[] completion = {"eden", "kiki"};
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        sol.solution1(participant, completion);
    }

    public String solution1(String[] participant, String[] completion) {
        for(int i = 0; i < participant.length; i++) {
            for(int j = 0; j < completion.length; j++) {
                if(participant[i].equals(completion[j])) {
                    participant[i] = "";
                    completion[j] = "";
                }
            }
        }

        //참가자의 이름이 남아 있는것이 완주하지 못한 사람
        for(int i = 0; i < participant.length; i++) {
            if(!participant[i].equals("")) {
                System.out.println("완주하지 못한 선수 : " + participant[i]);
            }
        }

        return ""; //error
    }
}
