package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S5_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] croatia = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String word = br.readLine();
        for (int i = 0; i < croatia.length; i++) {
            word = word.replaceAll(croatia[i], "@");
        }
        System.out.println(word.length());
    }
}
