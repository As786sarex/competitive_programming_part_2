package codechef.encoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class SS4 {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            String[] str = reader.readLine().split(" ");
            int x = Integer.parseInt(str[0]), y = Integer.parseInt(str[1]);
            map.put(y, (map.getOrDefault(x, 0) + 1));
        }
        AtomicInteger result = new AtomicInteger(1);
        int cnt = 0;
        HashMap<Integer, Integer> count = new HashMap<>();
        map.values().forEach(i -> {
            count.put(i, count.getOrDefault(i, 0) + 1);
        });
        count.forEach((integer, integer2) -> {
            if (integer2 >= cnt) {
                if (integer == cnt && result.get() <= integer) {

                } else
                    result.set(integer);
            }
        });
        System.out.println(result);
    }
}
