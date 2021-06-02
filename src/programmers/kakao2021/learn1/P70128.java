package programmers.kakao2021.learn1;

public class P70128 {
    public static void main(String[] args) {
        solution(new int[]{1,2,3,4}, new int[]{-3,-1,0,2});
    }

    public static int solution(int[] a, int[] b) {
        int dotProduct = 0;

        for (int i = 0; i < a.length; i++) {
            dotProduct += a[i] * b[i];
        }

        System.out.println(dotProduct);

        return dotProduct;
    }
}
