package codechef.october;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OctoberMARM_BF {
    public static void main(String[] args) throws Exception {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        FileWriter writer= new FileWriter("test3.txt");
        while (t-- > 0) {
            String[] str = reader.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            long k = Long.parseLong(str[1]);
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(tokenizer.nextToken());
            }
            for (long i = 0; i < k; i++) {
                long x=i%n;
                System.out.println(i+" "+x);
                try {
                    int a = arr[Math.toIntExact(x)];
                    int b = arr[Math.toIntExact(n - x - 1)];
                    arr[(int) (i % n)] = a ^ b;
                } catch (Exception e) {
                    System.out.println(i+" "+x);
                }
            }
            for (int i = 0; i < n; i++) {
                if (i != n - 1) {
                    System.out.print(arr[i] + " ");
                    writer.write(arr[i]+" ");

                } else {
                    writer.write(" ");
                    System.out.print(arr[i]);
                }
            }
            if (t != 0)
                System.out.println();
        }
    }
}
