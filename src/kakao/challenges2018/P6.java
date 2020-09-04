package kakao.challenges2018;

import java.util.HashSet;
import java.util.Iterator;

public class P6 {
    public static void main(String[] args) {
        String[] board1 = {"CCBDE", "AAADE", "AAABF", "CCBBF"};
        System.out.println(solution(4, 5, board1)); //14
        System.out.println(solution(6, 6, new String[]{"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"})); //15
    }

    //제출
    public static int solution(int m, int n, String[] board) {
        int answer = 0;

        char[][] cBoard = new char[m][n];

        //문자열을 하나씩 쪼개서 2차원 배열로 만듬
        for (int i = 0; i < m; i++) {
            cBoard[i] = board[i].toCharArray();
        }

        while (true) {
            HashSet<String> block4 = new HashSet<>();

            //근처 문자 탐색
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (cBoard[i][j] == '0') {
                        continue;
                    }
                    //4방향 검색
                    if (i - 1 >= 0 && j - 1 >= 0) {
                        int count = 0;

                        if (cBoard[i][j] == cBoard[i - 1][j - 1]) {
                            count++;
                        }
                        if (cBoard[i][j] == cBoard[i - 1][j]) {
                            count++;
                        }
                        if (cBoard[i][j] == cBoard[i][j - 1]) {
                            count++;
                        }
                        if (count == 3) {
                            block4.add(i + "," + j);
                        }
                    }

                    if (i - 1 >= 0 && j + 1 != n) {
                        int count = 0;

                        if (cBoard[i][j] == cBoard[i - 1][j]) {
                            count++;
                        }
                        if (cBoard[i][j] == cBoard[i - 1][j + 1]) {
                            count++;
                        }
                        if (cBoard[i][j] == cBoard[i][j + 1]) {
                            count++;
                        }
                        if (count == 3) {
                            block4.add(i + "," + j);
                        }
                    }

                    if (i + 1 != m && j - 1 >= 0) {
                        int count = 0;

                        if (cBoard[i][j] == cBoard[i][j - 1]) {
                            count++;
                        }
                        if (cBoard[i][j] == cBoard[i + 1][j - 1]) {
                            count++;
                        }
                        if (cBoard[i][j] == cBoard[i + 1][j]) {
                            count++;
                        }
                        if (count == 3) {
                            block4.add(i + "," + j);
                        }
                    }

                    if (i + 1 != m && j + 1 != n) {
                        int count = 0;
                        if (cBoard[i][j] == cBoard[i][j + 1]) {
                            count++;
                        }
                        if (cBoard[i][j] == cBoard[i + 1][j]) {
                            count++;
                        }
                        if (cBoard[i][j] == cBoard[i + 1][j + 1]) {
                            count++;
                        }
                        if (count == 3) {
                            block4.add(i + "," + j);
                        }
                    }
                }
            }

            //4블록이 없다면 종료
            if (block4.size() == 0) {
                break;
            }
            answer += block4.size();

            //4블록 제거
            for (Iterator<String> it = block4.iterator(); it.hasNext(); ) {
                String[] block = it.next().split(",");
                int x = Integer.parseInt(block[0]);
                int y = Integer.parseInt(block[1]);

                cBoard[x][y] = '0';
            }

            //남은 블록 위치 재배열
            for (int j = 0; j < n; j++) {
                for (int i = m - 1; i >= 0; i--) {
                    if (cBoard[i][j] == '0') {
                        for (int k = i - 1; k >= 0; k--) {
                            if (cBoard[k][j] != '0') {
                                cBoard[i][j] = cBoard[k][j];
                                cBoard[k][j] = '0';
                                break;
                            }
                        }
                    }
                }
            }
        }

        return answer;
    }

    //내가 푼것
    public static int solution2(int m, int n, String[] board) {
        int answer = 0;

        char[][] cBoard = new char[m][n];

        //문자열을 하나씩 쪼개서 2차원 배열로 만듬
        for (int i = 0; i < m; i++) {
            cBoard[i] = board[i].toCharArray();
        }

        while (true) {
            HashSet<String> block4 = new HashSet<>();

            //근처 문자 탐색
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (cBoard[i][j] == '0') {
                        continue;
                    }
                    //4방향 검색
                    //북서
                    if (i - 1 >= 0 && j - 1 >= 0) {
                        int count = 0;

                        if (cBoard[i][j] == cBoard[i - 1][j - 1]) {
                            //System.out.println(i + "" + j + "->" + (i - 1) + "" + (j - 1));
                            count++;
                        }
                        if (cBoard[i][j] == cBoard[i - 1][j]) {
                            //System.out.println(i + "" + j + "->" + (i - 1) + "" + (j));
                            count++;
                        }
                        if (cBoard[i][j] == cBoard[i][j - 1]) {
                            //System.out.println(i + "" + j + "->" + (i) + "" + (j - 1));
                            count++;
                        }
                        if (count == 3) {
                            //System.out.println(i + "" + j);
                            block4.add(i + "," + j);
                        }
                    }

                    //북동
                    if (i - 1 >= 0 && j + 1 != n) {
                        int count = 0;

                        if (cBoard[i][j] == cBoard[i - 1][j]) {
                            //System.out.println(i + "" + j + "->" + (i - 1) + "" + (j));
                            count++;
                        }
                        if (cBoard[i][j] == cBoard[i - 1][j + 1]) {
                            //System.out.println(i + "" + j + "->" + (i - 1) + "" + (j + 1));
                            count++;
                        }
                        if (cBoard[i][j] == cBoard[i][j + 1]) {
                            //System.out.println(i + "" + j + "->" + (i) + "" + (j + 1));
                            count++;
                        }
                        if (count == 3) {
                            //System.out.println(i + "" + j);
                            block4.add(i + "," + j);
                        }
                    }

                    //남서
                    if (i + 1 != m && j - 1 >= 0) {
                        int count = 0;

                        if (cBoard[i][j] == cBoard[i][j - 1]) {
                            //System.out.println(i + "" + j + "->" + (i) + "" + (j - 1));
                            count++;
                        }
                        if (cBoard[i][j] == cBoard[i + 1][j - 1]) {
                            //System.out.println(i + "" + j + "->" + (i + 1) + "" + (j - 1));
                            count++;
                        }
                        if (cBoard[i][j] == cBoard[i + 1][j]) {
                            //System.out.println(i + "" + j + "->" + (i + 1) + "" + (j));
                            count++;
                        }
                        if (count == 3) {
                            //System.out.println(i + "" + j);
                            block4.add(i + "," + j);
                        }
                    }

                    //남동
                    if (i + 1 != m && j + 1 != n) {
                        int count = 0;
                        if (cBoard[i][j] == cBoard[i][j + 1]) {
                            //System.out.println(i + "" + j + "->" + (i) + "" + (j + 1));
                            count++;
                        }
                        if (cBoard[i][j] == cBoard[i + 1][j]) {
                            //System.out.println(i + "" + j + "->" + (i + 1) + "" + (j));
                            count++;
                        }
                        if (cBoard[i][j] == cBoard[i + 1][j + 1]) {
                            //System.out.println(i + "" + j + "->" + (i + 1) + "" + (j + 1));
                            count++;
                        }
                        if (count == 3) {
                            //System.out.println(i + "" + j);
                            block4.add(i + "," + j);
                        }
                    }
                }
            }

            //4블록이 없다면 종료
            if (block4.size() == 0) {
                break;
            }
            answer += block4.size();

            //4블록 제거
            //System.out.println(block4);
            for (Iterator<String> it = block4.iterator(); it.hasNext(); ) {
                String[] block = it.next().split(",");
                int x = Integer.parseInt(block[0]);
                int y = Integer.parseInt(block[1]);

                cBoard[x][y] = '0';
            }

            //남은 블록 위치 재배열
            for (int j = 0; j < n; j++) {
                for (int i = m - 1; i >= 0; i--) {
                    if (cBoard[i][j] == '0') {
                        for (int k = i - 1; k >= 0; k--) {
                            if (cBoard[k][j] != '0') {
                                cBoard[i][j] = cBoard[k][j];
                                cBoard[k][j] = '0';
                                break;
                            }
                        }
                    }
                }
            }
        }

        /*for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(cBoard[i][j]);
            }
            System.out.println();
        }*/

        return answer;
    }

    //다른사람이 푼 것
    public static int solution3(int m, int n, String[] board) {
        int answer = 0;
        char[][] map = new char[m][n];

        for (int i = 0; i < m; i++) {
            map[i] = board[i].toCharArray();
        }

        while (true) {
            int cnt = checkBlock(m, n, map);
            if (cnt == 0) {
                break;
            }
            answer += cnt;

            dropBlock(m, n, map);
        }

        return answer;
    }

    private static void dropBlock(int m, int n, char[][] map) {
        for (int c = 0; c < n; c++) {
            for (int r = m - 1; r >= 0; r--) {
                if (map[r][c] == '.') {
                    for (int nr = r - 1; nr >= 0; nr--) {
                        if (map[nr][c] != '.') {
                            map[r][c] = map[nr][c];
                            map[nr][c] = '.';
                            break;
                        }
                    }
                }
            }
        }
    }

    private static int checkBlock(int m, int n, char[][] map) {
        int cnt = 0;
        boolean[][] isChecked = new boolean[m][n];

        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (map[i][j] == '.') {
                    continue;
                }
                checkFour(map, isChecked, i, j);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isChecked[i][j]) {
                    cnt++;
                    map[i][j] = '.';
                }
            }
        }

        return cnt;
    }

    private static void checkFour(char[][] map, boolean[][] isChecked, int i, int j) {
        char block = map[i][j];

        for (int r = i; r < i + 2; r++) {
            for (int c = j; c < j + 2; c++) {
                if (map[r][c] != block) {
                    return;
                }
            }
        }

        for (int r = i; r < i + 2; r++) {
            for (int c = j; c < j + 2; c++) {
                isChecked[r][c] = true;
            }
        }
    }
}
