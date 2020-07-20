package doit.chap01;

public class q3 {
    static int min4(int a, int b, int c, int d) {
        int max = a;

        if (b < max) {
            max = b;
        }

        if (c < max) {
            max = c;
        }

        if (d < max) {
            max = d;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("min4 1, 2, 3, 4 : " + min4(1, 2, 3, 4));
        System.out.println("min4 4, 3, 2, 1 : " + min4(4, 3, 2, 1));
    }
}
