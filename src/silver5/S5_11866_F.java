package silver5;

import java.util.*;
import java.util.stream.Collectors;
/**
 *
 * Queue를 처음 사용해본 문제.
 */
public class S5_11866_F {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder("<");
        while (queue.size() > 1) {
            for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }

            sb.append(queue.poll() + ", ");
        }
        sb.append(queue.poll()).append(">");
        System.out.println(sb.toString());
    }
}
