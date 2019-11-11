package interviewbit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.BitSet;

public class SQL {
    static BigInteger factorial(int n) {
        if (n <= 1)
            return BigInteger.ONE;
        else {
            BigInteger res = BigInteger.ONE;
            for (int i = 1; i <= n; i++) {
                res = res.multiply(BigInteger.valueOf(i));
            }
            return res;
        }
    }
    static int result = Integer.MAX_VALUE;
    static int b=0;

    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");

        final String a = input[0];
        b= Integer.parseInt(input[1]);
        int n = a.length();
        nPr(a, 0, n - 1);
    }

    private static void nPr(String str, int start, int end) {
        if (start == end) {

        }
        else {
            for (int i = start; i <= end; i++) {
                str = swap(str, start, i);
                nPr(str, start + 1, end);
                str = swap(str, start, i);
            }
        }
    }

    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}

