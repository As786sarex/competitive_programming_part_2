package codechef.codevitaround2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class RoundTable {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] s=reader.readLine().split(" ");
        int r= Integer.parseInt(s[0]),n= Integer.parseInt(s[1]);
        BigInteger ans=nCr(n,r);
        System.out.print(ans);
    }
    static BigInteger nCr(int n, int r)
    {
        return fact(n).divide((fact(r).multiply(fact(n - r))));
    }

    // Returns factorial of n
    static BigInteger fact(int n)
    {
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            res = res.multiply(BigInteger.valueOf(i));
        return res;
    }
}
