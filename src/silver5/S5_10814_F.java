package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S5_10814_F {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String age = st.nextToken();
            String name = st.nextToken();

            arr[i][0] = String.valueOf(age);
            arr[i][1] = name;
        }

        Arrays.sort(arr, (x, y) -> {
            return Integer.parseInt(x[0]) - Integer.parseInt(y[0]);
        });

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }


    }
}
