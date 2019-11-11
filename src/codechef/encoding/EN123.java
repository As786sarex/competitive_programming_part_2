package codechef.encoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EN123 {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int sum=0;
            String[] str=reader.readLine().split(" ");
            int n= Integer.parseInt(str[0]),k= Integer.parseInt(str[1]);
            StringTokenizer tokenizer=new StringTokenizer(reader.readLine());
            for (int i = 0; i <n ; i++) {
                sum+=Integer.parseInt(tokenizer.nextToken());
            }
            System.out.println(sum<=k?"YES":"NO");
        }
    }
}
