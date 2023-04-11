package silver5;

import java.util.*;

public class S5_1094_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stick = 64;
        int X = sc.nextInt();
        int count = 0;

        while(X > 0) { // 막대를 다 만들면 종료
            if(stick > X) { // 만들고자 하는 막대길이보다 크다면 반으로 자르기
                stick /= 2;
            }else {
                count++;
                X -= stick;
            }
        }

        System.out.println(count);
    }

}

