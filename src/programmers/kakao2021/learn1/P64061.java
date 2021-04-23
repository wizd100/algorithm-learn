package programmers.kakao2021.learn1;

import java.util.Stack;

public class P64061 {
    public static void main(String[] args) {
        solution(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4});
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();

        //board[?][moves - 1]
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    //연속된 인형 체크
                    if (!basket.isEmpty()) {
                        if (basket.peek() == board[j][moves[i] - 1]) {
                            basket.pop();
                            board[j][moves[i] - 1] = 0;
                            answer += 2;
                            break;
                        }
                    }

                    basket.push(board[j][moves[i] - 1]);
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }

        while (!basket.isEmpty()) {
            System.out.println(basket.pop());
        }

        //System.out.println(answer);

        return answer;
    }
}
