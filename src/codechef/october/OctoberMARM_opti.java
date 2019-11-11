package codechef.october;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OctoberMARM_opti {

    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            StringBuilder builder = new StringBuilder();
            String[] str = reader.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            long k = Long.parseLong(str[1]);
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(tokenizer.nextToken());
            }
            int x = (int) (k % (3 * n));
            if ((arr.length&1)==1 && k>(n/2)){
                arr[n/2]=0;
            }
            for (int i = 0; i < x; i++) {
                int l = i % n;
                int a = arr[l];
                int b = arr[(n - l - 1)];
                arr[(i % n)] = (a ^ b);
            }
            for (int i : arr) {
                builder.append(i + " ");
            }
            System.out.println(builder.toString());
        }
    }
}
