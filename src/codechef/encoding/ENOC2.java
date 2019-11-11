package codechef.encoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ENOC2 {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String[] str=reader.readLine().split(" ");
            long a= Long.parseLong(str[0]),b= Long.parseLong(str[1]);
            boolean bEven=(b&1L)==0,aEven=(a&1L)==0;
            if (bEven&&aEven){
                System.out.println("YES");
            }
            else if (!bEven&&!aEven){
                System.out.println("YES");
            }
            else{
                if (aEven){
                    System.out.println("NO");
                }
                else {
                    if ((2*a)<=b){
                        System.out.println("YES");
                    }
                    else
                    {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}
