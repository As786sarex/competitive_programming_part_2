package codechef.encoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ENOC3 {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        int offset=48;
        while (t-- > 0) {
            StringBuilder builder=new StringBuilder();
            char[] number=reader.readLine().toCharArray();
            int mod=number.length;
            if (mod==1){
                System.out.println(String.valueOf(number));
                continue;
            }
            for (int i = 0; i <mod ; i++) {
                builder.append(((number[i % mod] - offset) ^ (number[(i + 1) % mod] - offset)));
            }
            System.out.println(builder.toString());
        }
    }
}
