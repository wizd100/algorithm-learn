package doit.chap02;

public class Q2 {
    static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j] + " ");
            }

            int idx1 = i;
            int idx2 = a.length - i - 1;

            System.out.println();
            System.out.println("a[" + idx1 + "]과(와 a[" + idx2 + "]를 교환합니다");

            swap(a, idx1, idx2);
        }
        System.out.println("역순 정렬을 마쳤습니다");
    }

    public static void main(String[] args) {
        int[] x = {5, 10, 73, 2, -5, 42};

        reverse(x);
    }
}
