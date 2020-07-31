package inflern.algo1;

public class Recursion {
    public static void main(String[] args) {
        //func(5);
        //int result2 = factorial(4);
        //System.out.println("Recursion func2 : " + result2);
        //System.out.println("fibonacci1 : " + fibonacci1());
        for(int i = 0; i < 20; i++) {
            System.out.println("fibo : " + fibo(i));
        }
    }

    public static void func(int k) {
        if (k <= 0) {
            return;
        } else {
            System.out.println("Recursion : " + k);
            func(k - 1);
        }
    }

    public static int factorial(int k) {
        if (k <= 1) {
            return 1;
        } else {
            return k * factorial(k - 1);
        }
    }

    public static int fibonacci1() {
        int i;
        int j;
        int k;

        i = 1;
        j = 1;

        for(int n = 0; n < 10; n++) {
            k = i + j;
            System.out.printf("fibonacci %d + %d = %d\n", i, j ,k);

            i = j;
            j = k;
        }

        return 1;
    }

    public static int fibo(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static int eculid1() {
        //해당 숫자의 약수를 구함 (1 ~ n 까지 나눠지는 수를 저장)
        //약수 값 중에 최소로 같은 값을 구함

        //재귀방법
        // n < m 이고 m / n = 0 이면 최대공약수는 n
        // 0이 아니라면 나머지값을

        int i = 12;
        int j = 18;

        return i;
    }
}
