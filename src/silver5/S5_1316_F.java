package silver5;

import java.io.*;

public class S5_1316_F {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            boolean[] check = new boolean[26]; // 해당 알파엣을 썼는지 체크해놓는 배열
            String word = br.readLine();
            boolean isGroup = true;
            for (int j = 0; j < word.length(); j++) {
                int index = word.charAt(j) - 'a'; //첫글자의 알파벳 인덱스 0~25사이
                if (check[index]) { // 해당 글자가 쓰였던적이 있는지.
                    if (word.charAt(j) != word.charAt(j - 1)) { //지금 글자와 이전글자가 같은지
                        isGroup = false;
                        break;
                    }
                } else {
                    check[index] = true;
                }
            }
            if(isGroup)count++;
        }
        System.out.println(count);
    }
}
