package silver5;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class S5_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Arrays.stream(br.readLine().split("")).sorted(Comparator.reverseOrder()).forEach(
                str -> sb.append(str)
        );
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
