package codechef.codevitaround2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Att {
    static int upperlimit = 100000;

    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] q1 = new int[n], q2 = new int[n], q3 = new int[n];
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        StringTokenizer tokenizer1 = new StringTokenizer(reader.readLine());
        StringTokenizer tokenizer2 = new StringTokenizer(reader.readLine());
        for (int j = 0; j < n; j++) {
            q1[j] = Integer.parseInt(tokenizer.nextToken());
            q2[j] = Integer.parseInt(tokenizer1.nextToken());
            q3[j] = Integer.parseInt(tokenizer2.nextToken());
        }
        int[] arr = new int[100001];
        int q = Integer.parseInt(reader.readLine());
        while (q-- > 0) {
            String[] s = reader.readLine().split(" ");
            int q1l = Integer.parseInt(s[0]), q1u = Integer.parseInt(s[1]),
                    q2l = Integer.parseInt(s[2]), q2u = Integer.parseInt(s[3]),
                    q3l = Integer.parseInt(s[4]), q3u = Integer.parseInt(s[5]);
            for (int i = q1l - 1; i < q1u; i++) {
                arr[q1[i]] = q1[i];
            }
            for (int i = q2l - 1; i < q2u; i++) {
                arr[q2[i]] = q2[i];
            }
            for (int i = q3l - 1; i < q3u; i++) {
                arr[q3[i]] = q3[i];
            }

        }



    }
}
