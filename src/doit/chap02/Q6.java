package doit.chap02;

public class Q6 {
    static void reverse(char[] d, int digits) {
        for (int i = 0; i < digits / 2; i++) {
            char temp = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = temp;
        }
    }

    static int cardConv(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);

        reverse(d, digits);

        return digits;
    }

    public static void main(String[] args) {
        int x = 59;
        int r = 16;
        char[] d = new char[32];
        int dno;

        dno = cardConv(x, r, d);

        System.out.println(dno);
        for (int i = 0; i < dno; i++) {
            System.out.print(d[i]);
        }
    }
}
