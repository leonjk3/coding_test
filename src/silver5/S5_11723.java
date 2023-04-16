package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class S5_11723 {
    public static void main(String[] args) throws IOException{
        HashMap<Integer, Boolean>map = new HashMap<>();
        for(int i = 1; i <=20; i++) {
            map.put(i, false);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(br.readLine());

        for(int i = 0; i < tc; i++) {
            String line = br.readLine();
            if(line.equals("all") || line.equals("empty")) {
                for(int j = 1; j <=20; j++) {
                    map.put(j, line.equals("all"));
                }
            }else {
                String[] arr = line.split(" ");
                String method = arr[0];
                int num = Integer.parseInt(arr[1]);

                if("check".equalsIgnoreCase(method)) {
                    bw.write((map.get(num) ? 1 : 0) + "");
                    bw.write("\n");
                }else {
                    cal(map, method, num);
                }
            }
        }
        bw.flush();
        bw.close();
    }

    static void cal(HashMap<Integer, Boolean> map, String method, int num) {
        switch(method) {
            case "add":
                if(!map.get(num)) {
                    map.put(num, true);
                }
                break;
            case "remove":
                if(map.get(num)) {
                    map.put(num, false);
                }
                break;
            case"toggle":
                if(!map.get(num)) {
                    map.put(num, true);
                }else {
                    map.put(num, false);
                }
                break;
        }
    }


}

