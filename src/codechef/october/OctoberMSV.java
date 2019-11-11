package codechef.october;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class OctoberMSV {


    public static void main(String[] args) throws Exception {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            hashMap.clear();
            int k = Integer.parseInt(reader.readLine());
            int[] arr = new int[k];
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < k; j++) {
                int n = Integer.parseInt(tokenizer.nextToken());
                arr[j] = hashMap.getOrDefault(n, 0);
                for (int i = 1; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        if (n / i == i) {
                            if (!hashMap.containsKey(i)) {
                                hashMap.put(i, 1);
                            } else {
                                hashMap.put(i, hashMap.get(i) + 1);
                            }
                        } else {
                            int xinv = n / i;
                            if (!hashMap.containsKey(i)) {
                                hashMap.put(i, 1);
                            } else {
                                hashMap.put(i, hashMap.get(i) + 1);
                            }
                            if (!hashMap.containsKey(xinv)) {
                                hashMap.put(xinv, 1);
                            } else {
                                hashMap.put(xinv, hashMap.get(xinv) + 1);
                            }
                        }
                    }
                }
            }
            int msv=0;
            for (int i = 0; i <k ; i++) {
                if (arr[i]>msv){
                    msv=arr[i];
                }
            }
            System.out.println(msv);

        }
    }
}
