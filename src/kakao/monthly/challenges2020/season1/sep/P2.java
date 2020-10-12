package kakao.monthly.challenges2020.season1.sep;

public class P2 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
        System.out.println(solution(arr1)); // {4,9}
    }

    public static int[] solution(int[][] arr) {
        int[] answer = {};

        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = 0; j < arr[i].length / 2; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        return answer;
    }
}
