package hackerrank.ps;

public class NumberLineJumps {
    public static void main(String[] args) {
        System.out.println(kangaroo(0,3,4,2));
        System.out.println(kangaroo(0,2,5,3));
    }

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 < v2) {
            return "NO";
        }

        while (true) {
            x1 += v1;
            x2 += v2;

            if (x1 == x2) {
                return "YES";
            }
            if (x1 > x2) {
                return "NO";
            }
        }
    }
}
