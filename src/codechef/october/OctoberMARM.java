package codechef.october;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OctoberMARM {
    public static void main(String[] args) throws Exception {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        FileWriter writer=new FileWriter("test1.txt");
        while (t-- > 0) {
            StringBuilder builder = new StringBuilder();
            String[] str = reader.readLine().split(" ");
            int n =  Integer.parseInt(str[0]);
            long k = Long.parseLong(str[1]);
            boolean isOdd = (n & 1) == 1;
            int iter = (int) ((k % n) - 1);
            int times = (int) ((k / n) % 3);
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            long[] arr = new long[n];
            long[] modArr1 = new long[n];
            long[] modArr2 = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(tokenizer.nextToken());
            }
            for (int i = 0; i < n / 2; i++) {
                modArr1[i] = (arr[i] ^ arr[n - i - 1]);
                modArr2[i] = arr[n - i - 1];
            }
            int next = isOdd ? (n / 2) + 1 : (n / 2);
            for (int i = next; i < n; i++) {
                modArr1[i] = arr[n - i - 1];
                modArr2[i] = modArr1[n - i - 1];
            }
            int more = (n - 1 - iter);
            switch (times) {
                case 0:

                case 1:

                case 2:

            }
            System.out.println(builder.toString());
            writer.write(builder.toString());
            writer.flush();
            writer.close();
        }
    }
}
