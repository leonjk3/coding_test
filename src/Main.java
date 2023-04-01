import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 0);
        map.put(3, 0);

        for (int i = 0; i < num; i++) {
            int aNum = sc.nextInt();
            int bNum = sc.nextInt();

            int aVal = map.get(aNum);
            int bVal = map.get(bNum);

            map.put(aNum, bVal);
            map.put(bNum, aVal);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println(key);
                break;
            }
        }

    }
}
