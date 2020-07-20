package doit.chap01;

public class q2 {
    static int min3(int a, int b, int c) {
        int max = a;

        if (b < max) {
            max = b;
        }

        if (c < max) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("min 1, 2 ,3 : " + min3(1, 2, 3));
        System.out.println("min 3, 2 ,1 : " + min3(3, 2, 1));
    }
}
