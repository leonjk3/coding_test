package silver5;

import java.util.*;

public class S5_1789_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = Long.parseUnsignedLong(sc.next());

        long num = 1;
        long sum = 0;
        long count = 0;

        while(true) {
            if(sum > S) {
                break;
            }
            sum += num;
            num++;
            count++;
        }
        System.out.println(count-1);
    }
}
