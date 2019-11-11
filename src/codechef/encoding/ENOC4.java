package codechef.encoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class ENOC4 {
    private static BigInteger mod = BigInteger.valueOf(1000000007L);

    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String[] str = reader.readLine().split(" ");
            long n = Long.parseLong(str[0]);
            long k = Long.parseLong(str[1]);
            long div = n / k;
            BigInteger sumOfNatural = (BigInteger.valueOf(div)
                    .multiply(BigInteger.valueOf(div + 1))).divide(BigInteger.valueOf(2));
            BigInteger result = (((BigInteger.valueOf(2).multiply(BigInteger.valueOf(k)))
                    .multiply(sumOfNatural)).add(BigInteger.valueOf(n))).mod(mod);
            System.out.println(result);
        }
    }
}
