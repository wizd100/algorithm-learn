package doit.chap01;

public class q5 {
    // 최악의 경우 5번 비교해야 됨 (c 값이 중앙값이 될때)
    static int med5(int a, int b, int c) {
        if ((c <= a && a <= b) || (b <= a && a <= c)) {
            return a;
        } else if ((c < b && b < a) || (a < b && b < c)) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println(med5(1, 2, 3));
    }
}
