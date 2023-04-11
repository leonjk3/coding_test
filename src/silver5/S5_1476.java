package silver5;

import java.util.*;
public class S5_1476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int e = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();

        int E = 1;
        int S = 1;
        int M = 1;
        int ret = 1;


        while(true) {
            if(E > 15) {
                E -= 15;
            }

            if(S > 28) {
                S -= 28;
            }

            if(M > 19) {
                M -= 19;
            }

            if(e == E && s == S && m == M) {
                break;
            }else {
                E += 1;
                S += 1;
                M += 1;
                ret += 1;
            }
        }
        System.out.println(ret);
    }

}
