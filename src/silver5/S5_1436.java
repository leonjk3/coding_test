package silver5;

import java.io.*;
import java.util.ArrayList;

public class S5_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Long> list = new ArrayList<>();
        long num = 1;
        while (list.size() < N) {
            if (String.valueOf(num).indexOf("666") > -1) {
                list.add(num);
            }
            num++;
        }
        System.out.println(list.get(N-1));
    }
}
