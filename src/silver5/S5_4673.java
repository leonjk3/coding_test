package silver5;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class S5_4673 {
    public static void main(String[] args) {
        int[] arr = new int[10000];
        for (int i = 1; i < 10000; i++) {
            if (i == 1) {
                System.out.println(i);
                arr[i - 1] = d(i);
            } else {
                if (!isD(i, arr)) {
                    System.out.println(i);
                }
                arr[i - 1] = d(i);
            }
        }
    }

    static int d(int num) {
        AtomicInteger sum = new AtomicInteger();
        Arrays.stream(String.valueOf(num).split("")).forEach(
                str -> sum.addAndGet(Integer.parseInt(str))
        );

        return num + Integer.parseInt(sum.toString());
    }

    static boolean isD(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
