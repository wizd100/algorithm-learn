package programmers.coding.test.hash;

public class problem1 {
    public static void main(String[] args) {
        problem1 sol = new problem1();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        //String[] participant = {"mislav", "stanko", "mislav", "ana"};
        //String[] completion = {"stanko", "ana", "mislav"};
        sol.solution1(participant, completion);
    }

    //중복이름이 있을경우 해결이 안됨
    //n * n -1 최대수행
    public String solution1(String[] participant, String[] completion) {
        for(int i = 0; i < participant.length; i++) {
            int count = 0;
            for(int j = 0; j < completion.length; j++) {
                if(!participant[i].equals(completion[j])) {
                    count++;
                    if(count == completion.length) {
                        System.out.println("완주하지 못한 선수 : " + participant[i]);
                        return participant[i];
                    }
                } else {
                    // 참가자와 완주자 중복된 이름을 해결하기 위해 같다면 참가자의 이름을 지움
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
