package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class P15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String num = br.readLine();
            StringTokenizer st = new StringTokenizer(num);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append(A + B).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
