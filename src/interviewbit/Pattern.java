package interviewbit;/* IMPORTANT: Multiple classes and nested static classes are supported */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

class TestClass {
    private static Set<Integer> seieve;

    public static void main(String[] args) throws Exception {
        seieve = new HashSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        StringTokenizer token = new StringTokenizer(reader.readLine());
        StringTokenizer token2 = new StringTokenizer(reader.readLine());
        int[] arr = new int[size];
        int[] adj = new int[size - 1];
        int max = 0;
        for (int i = 0; i < size; i++) {
            int x = Integer.parseInt(token.nextToken());
            max = Math.max(max, x);
            arr[i] = x;
        }
        int[] res = new int[size - 1];
        for (int i = 0; i < (size - 1); i++) {
            adj[i] = Integer.parseInt(token2.nextToken());
        }
        getSeive(max);
        List<Integer> primeIndex = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (seieve.contains(arr[i])) {
                primeIndex.add(i + 1);
            }
        }
        for (int i = 0; i < primeIndex.size(); i++) {
            int tr = primeIndex.get(i);
            if (tr != 1) {
                res[tr - 2] = res[tr - 2] + 1;
            }
            while (tr != 1) {
                tr = adj[tr - 2];
                if (tr != 1)
                    res[tr - 2] = res[tr - 2] + 1;
            }
        }
        for (int i = 0; i <res.length ; i++) {
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }

    private static void getSeive(int max) throws SQLException {
        boolean[] bool = new boolean[max + 1];
        bool[0] = true;
        bool[1] = true;
        for (int i = 2; i * i <= max; i++) {
            if (!bool[i]) {
                for (int j = (i * 2); j <= max; j = j + i) {
                    bool[j] = true;
                }
            }
        }
        for (int i = 2; i <= max; i++) {
            if (!bool[i]) {
                seieve.add(i);
            }
        }
    }

}
