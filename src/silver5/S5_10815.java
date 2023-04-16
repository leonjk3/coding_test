package silver5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S5_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] Narr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(Narr);

        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            sb.append(getBinarySearch(Narr, N, Integer.parseInt(st.nextToken())) + " ");
        }
        System.out.println(sb.toString());
    }

    static String getBinarySearch(int[] arr, int N, int search) {
        int first = 0;
        int last = N - 1;
        int mid = 0;

        while (first <= last) {
            mid = (first + last) / 2;
            if (arr[mid] == search) {
                return "1";
            } else {
                if (arr[mid] > search) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
            }
        }
        return "0";
    }

}
