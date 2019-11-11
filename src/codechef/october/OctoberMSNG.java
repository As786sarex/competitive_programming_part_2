package codechef.october;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OctoberMSNG {
    final static long upperBound=1000000000000L;
    public static void main(String[] args) throws Exception {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            long sum = 0;
            boolean printed = false;
            int n = Integer.parseInt(reader.readLine());
            for (int i = 0; i < n; i++) {
                String[] str = reader.readLine().split(" ");
                if (printed) {
                    continue;
                }
                int base = Integer.parseInt(str[0]);
                if (base == -1) {
                    continue;
                }
                char[] chr = str[1].toCharArray();
                int pow = 0;

                for (int j = chr.length - 1; j >= 0; j--) {
                    int extracted = Character.isLetter(chr[j]) ? (chr[j] - 55) : (chr[j] - 48);
                    sum += (extracted * Math.pow(base, pow));
                    pow++;
                }
                printed = true;
            }
            if (sum>upperBound){
                System.out.println(-1);
            }
            else {
                System.out.println(sum);
            }
        }
    }
}