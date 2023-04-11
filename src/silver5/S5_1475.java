package silver5;

import java.util.*;

public class S5_1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] roomNum = Arrays.stream(sc.next().split("")).mapToInt(Integer::parseInt).toArray();
        boolean[][] set = new boolean[roomNum.length][10];

        int count = 0; //세트를 쓴 갯수
        for(int i = 0; i < roomNum.length; i++) {
            if(!set[count][roomNum[i]]) {
                set[count][roomNum[i]] = true;
            }else {
                if(roomNum[i] == 6 || roomNum[i] == 9) { //6이나 9면 이전세트부터 현재세트까지 뒤지고 아무곳에나 넣는다.
                    boolean isAnotherSetExist = false;
                    for(int j = 0; j <= count; j++) {
                        if(!set[j][9]) {
                            set[j][9] = true;
                            isAnotherSetExist = true;
                            break;
                        } else if(!set[j][6]) {
                            set[j][6] = true;
                            isAnotherSetExist = true;
                            break;
                        }
                    }
                    if(!isAnotherSetExist) {
                        count++;
                        set[count][roomNum[i]] = true;
                    }
                }else { // 현재세트에 해당 번호를 썼다면 이전세트를 뒤져서 넣는다.
                    boolean isAnotherSetExist = false;
                    for(int j = 0; j <= count; j++) {
                        if(!set[j][roomNum[i]]) {
                            set[j][roomNum[i]] = true;
                            isAnotherSetExist = true;
                            break;
                        }
                    }
                    if(!isAnotherSetExist) {
                        count++;
                        set[count][roomNum[i]] = true;
                    }
                }
            }
        }
        System.out.println(count + 1);

    }
}
