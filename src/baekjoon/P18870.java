package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = new Integer(br.readLine());
        int[] arr = new int[N];
        int[] arrClone;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        arrClone = arr.clone();

        Arrays.sort(arrClone);

        for (int i = 0; i < arrClone.length; i++) {
            if (!map.containsKey(arrClone[i])) {
                map.put(arrClone[i], count++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }

        System.out.println(sb);
    }
}
