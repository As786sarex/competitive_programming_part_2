package codechef.october;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class OctoberSAKTAN {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            long res=0;
            String[] str = reader.readLine().split(" ");
            int m = Integer.parseInt(str[0]), n = Integer.parseInt(str[1]);
            long q = Integer.parseInt(str[2]);
            int[] row = new int[m];
            int[] col = new int[n - 1];
            long row_op=0,col_op=0;
            while (q-- > 0) {
                String[] s = reader.readLine().split(" ");
                int x = Integer.parseInt(s[0]) - 1, y = Integer.parseInt(s[1]) - 1;
                if (x == 0) {
                    row_op++;
                    row[x] = row[x] + 1;
                    for (int i = 0; i < col.length; i++) {
                        col[i] = col[i] + 1;
                    }
                } else {
                    row[x] = row[x] + 1;
                }
                if (y == 0) {
                    for (int i = 0; i < m; i++) {
                        row[i] = row[i] + 1;
                    }
                    col_op++;
                } else {
                    col[y-1] = col[y-1] + 1;
                }
            }
            long row_mat_even = 0;
            long row_mat_odd=0;
            long col_mat_even=0;
            long col_mat_odd = 0;
            for (int i = 1; i < row.length; i++) {
                if (((row[i]-col_op) & 1) == 1) {
                    row_mat_odd++;
                }
                else{
                    row_mat_even++;
                }
            }
            for (int i = 0; i < col.length; i++) {
                if (((col[i]-row_op) & 1) == 1) {
                    col_mat_odd++;
                }
                else{
                    col_mat_even++;
                }
            }
            int corner = (row[0] & 1) == 1 ? 1 : 0;
            long colval=(row_op&1)==1?col_mat_even:col_mat_odd;
            long rowval=(col_op&1)==1?row_mat_even:row_mat_odd;
            res = (col_mat_odd * row_mat_even) + colval+rowval+(col_mat_even*row_mat_odd)+corner;
            System.out.println(res);
        }
    }
}
