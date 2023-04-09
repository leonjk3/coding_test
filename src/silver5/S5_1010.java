package silver5;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class S5_1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            System.out.println(combination(N, M).toString());
        }
    }

    static BigInteger combination(int num1, int num2) {
        return factorial(num2).divide(factorial(num1).multiply(factorial(num2 - num1)));
    }

    static BigInteger factorial(int num) {
        BigInteger ret = new BigInteger("1");
        for (long i = 1; i <= num; i++) {
            ret = ret.multiply(new BigInteger(String.valueOf(i)));
        }
        return ret;
    }
}
