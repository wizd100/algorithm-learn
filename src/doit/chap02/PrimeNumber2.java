package doit.chap02;

public class PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;

        for (int n = 3; n <= 1000; n+= 2) { // n+2인 이유는 2를 제외한 짝수는 소수가 아니기 때문에 (홀수만 검사)
            int i;
            for (i = 1; i < ptr; i++) { // i가 0이 아닌 1부터 시작하는건 짝수값(2)을 찾을 필요가 없기 때문에
                counter++;
                if (n % prime[i] == 0) { // n의 소수값이 나눠지면 소수가 아님
                    break;
                }
            }
            if (ptr == i) { // 소수일 경우 배열에 담음
                prime[ptr++] = n;
            }
        }

        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }
        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}
