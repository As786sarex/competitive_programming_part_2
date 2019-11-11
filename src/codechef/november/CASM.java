package codechef.november;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class CASM {
    public static void main(String[] args) throws Exception {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String[] s = reader.readLine().split(" ");
            int n = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]);
            Pair[] pairs = new Pair[n];
            StringTokenizer tokenizer=new StringTokenizer(reader.readLine());
            for (int i = 0; i <n ; i++) {
                long x= Long.parseLong(tokenizer.nextToken());
                int setIndex=(i%m)+1;
                Pair p=new Pair(x,setIndex);
                pairs[i]=p;
            }
            Arrays.sort(pairs, Comparator.comparingLong(o -> o.value));
            long min=Long.MAX_VALUE;
            Set<Long> isPresent=new HashSet<>(m);
            for (int i = 0; i <pairs.length ; i++) {
                int count=0;
                for (int j = i; j <pairs.length&&count<m ; j++) {
                    if (!isPresent.contains(pairs[j].set)){
                        isPresent.add(pairs[j].set);
                        count++;
                    }
                    if (count==m){
                        min=Math.min(min,(pairs[j].value-pairs[i].value));
                    }
                }
                isPresent.clear();
            }
            System.out.println(min);
        }
    }

    static class Pair {
        long value, set;

        Pair(long value, int set) {
            this.value = value;
            this.set = set;
        }

        @Override
        public String toString() {
            return this.value +" "+this.set;
        }
    }
    private static long minDifferenceAmongMaxMin(Pair[] arr,
                                                 int N, int K)
    {
        long res = Long.MAX_VALUE;
        for (int i = 0; i <= (N - K); i++)
        {
            long curSeqDiff = arr[i + K - 1].value - arr[i].value;
            res = Math.min(res, curSeqDiff);
        }

        return res;
    }
}
