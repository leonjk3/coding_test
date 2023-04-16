package silver5;

import java.util.Scanner;

public class S5_2563 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int TC = sc.nextInt();

        int[][] arr = new int[TC][2];
        for (int i = 0; i < TC; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int maxWidth = 0;
        int maxHeight = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] > maxWidth) {
                maxWidth = arr[i][0];
            }

            if (arr[i][1] > maxHeight) {
                maxHeight = arr[i][1];
            }
        }

        int[][] ret = new int[maxWidth + 10][maxHeight + 10];

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i][0];
            int y = arr[i][1];

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    ret[j][k] = 1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < maxWidth + 10; i++) {
            for (int j = 0; j < maxHeight + 10; j++) {
                if (ret[i][j] == 1) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
