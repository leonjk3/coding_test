package silver5;

import java.math.BigInteger;
import java.util.*;

public class S5_1676 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger num = getFactorial(sc.nextInt());

        long count = 0;
        while (true) {
            BigInteger remainder = num.remainder(new BigInteger("10"));
            if (!remainder.toString().equals("0")) {
                break;
            } else {
                num = num.divide(new BigInteger("10"));
                count++;
            }
        }
        System.out.println(count);

    }

    static BigInteger getFactorial(int num) {
        BigInteger ret = new BigInteger("1");
        for (int i = 1; i <= num; i++) {
            ret = ret.multiply(new BigInteger(String.valueOf(i)));
        }
        return ret;
    }

}
