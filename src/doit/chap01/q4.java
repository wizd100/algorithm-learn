package doit.chap01;

public class q4 {
    static int med(int a, int b, int c){
        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (c >= a) {
                return c;
            } else {
                return a;
            }
        } else if (a > c) {
            return a;
        } else if (b < c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println("세 정수의 중앙값을 구하라");

        System.out.println("3 2 1 : " + med(3, 2, 1));
        System.out.println("3 2 2 : " + med(3, 2, 2));
        System.out.println("3 1 2 : " + med(3, 1, 2));
        System.out.println("3 2 3 : " + med(3, 2, 3));
        System.out.println("2 1 3 : " + med(2, 1, 3));
        System.out.println("3 3 2 : " + med(3, 3, 2));
        System.out.println("3 3 3 : " + med(3, 3, 3));
        System.out.println("2 2 3 : " + med(2, 2, 3));
        System.out.println("2 3 1 : " + med(2, 3, 1));
        System.out.println("2 3 2 : " + med(2, 3, 2));
        System.out.println("1 3 2 : " + med(1, 3, 2));
        System.out.println("2 3 3 : " + med(2, 3, 3));
        System.out.println("1 2 3 : " + med(1, 2, 3));
    }
}
