package codechef.october;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OctoberS10E {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer;
        while (t-- > 0) {
            int res = 0;
            int n = Integer.parseInt(reader.readLine());
            tokenizer = new StringTokenizer(reader.readLine());
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(tokenizer.nextToken());
            }
            for (int i = 0; i < n; i++) {
                boolean flag = false;
                int prev = Math.max(0, (i - 5));
                int current = arr[i];
                for (int j = prev; j < i; j++) {
                    if (arr[j] <=current) {
                        flag = true;
                        break;
                    }
                }
                if (!flag)
                    res++;
            }
            System.out.println(res);
        }

    }
}
