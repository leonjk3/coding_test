package silver5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S5_11650_F {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        int[][] ret = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            ret[i][0] = Integer.parseInt(st.nextToken());
            ret[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(ret, (x, y) -> {
            if (x[0] == y[0]) {
                return x[1] - y[1];
            } else {
                return x[0] - y[0];
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(ret[i][0] + " " + ret[i][1]);
        }

    }
}
