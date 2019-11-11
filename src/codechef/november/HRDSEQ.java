package codechef.november;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

class HRDSEQ {
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        arr = new int[129];
        generateSeq();
        System.out.println(Arrays.toString(arr));
        while (t-- > 0) {
            int n= Integer.parseInt(reader.readLine())-1;
            int element=arr[n];
            int count=0;
            for (int i = 0; i <=n ; i++) {
                if (arr[i]==element){
                    count++;
                }
            }
            System.out.println(count);

        }

    }

    private static void generateSeq() {
        HashMap<Integer, Integer> mp = new HashMap<>();
        arr[0] = 0;
        mp.put(0, 0);
        arr[1] = 0;
        for (int i = 2; i < 129; i++) {
            if (mp.containsKey(arr[i - 1])) {
                arr[i] = (i - 1) - mp.get(arr[i - 1]);
                mp.put(arr[i - 1], i - 1);
            } else {
                arr[i] = 0;
                mp.put(arr[i - 1], i - 1);
            }
        }

    }
}
