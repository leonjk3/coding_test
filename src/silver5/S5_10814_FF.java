package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S5_10814_FF {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        People[] arr = new People[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = new People(st.nextToken(), st.nextToken());
        }
        Arrays.sort(arr, (x, y) -> {
            return Integer.parseInt(x.getAge()) - Integer.parseInt(y.getAge());
        });

        for (People people : arr) {
            System.out.println(people.getAge() + " " + people.getName());
        }
    }

    static class People {
        private String age;
        private String name;

        public People(String age, String name) {
            this.age = age;
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }
}
