package silver5;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class S5_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        HashMap<Integer, profile> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            profile profile = new profile(weight, height);
            map.put(i, profile);
        }

        HashMap<Integer, Integer> retMap = new HashMap<>();
        for (int i = 0; i < map.size(); i++) {
            int rank = 1;
            profile profile = map.get(i);
            for (int j = 0; j < map.size(); j++) {
                if (i != j) {
                    profile tempProfile = map.get(j);
                    if (tempProfile.getWeight() > profile.getWeight() && tempProfile.getHeight() > profile.getHeight()) {
                        rank++;
                    }
                }
            }
            retMap.put(i, rank);
        }

        for (Integer key : retMap.keySet()) {
            System.out.print(retMap.get(key) + " ");
        }
    }

    static class profile{
        public Integer weight;
        public Integer height;

        public profile(Integer weight, Integer height) {
            this.weight = weight;
            this.height = height;
        }

        public Integer getWeight() {
            return weight;
        }

        public Integer getHeight() {
            return height;
        }
    }
}
