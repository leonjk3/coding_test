package silver5;

import java.util.Scanner;

public class S5_1193 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int groupNum = 0;
        for (int i = 1; i < N+1; i++) {
            sum += i;
            if (sum >= N) {
                groupNum = i;
                break;
            }
        }
        int indexNum = N;
        for (int i = 1; i < groupNum; i++) {
            indexNum -= i;
        }

        if (groupNum % 2 == 0) {
            System.out.println(indexNum + "/" + (groupNum-indexNum+1));
        } else {
            System.out.println((groupNum-indexNum+1) + "/" + indexNum);
        }

    }
}
