package silver5;

import java.io.*;
import java.util.ArrayList;

public class S5_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 1; i <= 50; i++) {
            ArrayList<String> temp = new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].length() == i) {
                    temp.add(arr[j]);
                }
            }
            temp.stream().distinct().sorted().forEach(
                    str -> System.out.println(str)
            );
        }
        bw.flush();
        bw.close();

    }
}
