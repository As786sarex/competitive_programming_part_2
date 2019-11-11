package codechef.november;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class PHCUL {
    public static void main(String[] args) throws Exception {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        HashMap<String, Double> abHashMap = new HashMap<>();
        HashMap<String, Double> cdHashmap = new HashMap<>();
        while (t-- > 0) {
            abHashMap.clear();
            cdHashmap.clear();
            String[] s = reader.readLine().split(" ");
            int x = Integer.parseInt(s[0]), y = Integer.parseInt(s[1]);
            s = reader.readLine().split(" ");
            int n = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]), k = Integer.parseInt(s[2]);
            long[][] ab = new long[n][2], cd = new long[m][2], ef = new long[k][2];
            StringTokenizer abToken = new StringTokenizer(reader.readLine());
            StringTokenizer cdToken = new StringTokenizer(reader.readLine());
            StringTokenizer efToken = new StringTokenizer(reader.readLine());
            for (int i = 0; i < n; i++) {
                ab[i][0] = Long.parseLong(abToken.nextToken());
                ab[i][1] = Long.parseLong(abToken.nextToken());
            }
            for (int i = 0; i < m; i++) {
                cd[i][0] = Long.parseLong(cdToken.nextToken());
                cd[i][1] = Long.parseLong(cdToken.nextToken());
            }
            for (int i = 0; i < k; i++) {
                ef[i][0] = Long.parseLong(efToken.nextToken());
                ef[i][1] = Long.parseLong(efToken.nextToken());
            }
            for (long[] abp : ab) {
                String s1 = abp[0] + "," + abp[1];
                double abefmin = Double.MAX_VALUE;
                for (long[] efp : ef) {
                    abefmin = Math.min(abefmin, distanceTo(abp[0], abp[1], efp[0], efp[1]));
                }
                abHashMap.put(s1, abefmin);
            }
            for (long[] cdp : cd) {
                String s1 = cdp[0] + "," + cdp[1];
                double cdefmin = Double.MAX_VALUE;
                for (long[] efp : ef) {
                    cdefmin = Math.min(cdefmin, distanceTo(cdp[0], cdp[1], efp[0], efp[1]));
                }
                cdHashmap.put(s1, cdefmin);
            }
            double minimumResultAb = Double.MAX_VALUE, minimumResultCd = Double.MAX_VALUE;
            for (long[] abp : ab) {
                double ses = distanceTo(x, y, abp[0], abp[1]);
                for (long[] cdp : cd) {
                    double distXYAB = ses;
                    distXYAB = distXYAB + distanceTo(abp[0], abp[1], cdp[0], cdp[1]);
                    String s1 = cdp[0] + "," + cdp[1];
                    distXYAB = distXYAB + cdHashmap.get(s1);
                    minimumResultAb = Double.min(minimumResultAb, distXYAB);
                }
            }
            for (long[] cdp : cd) {
                double ses = distanceTo(x, y, cdp[0], cdp[1]);
                for (long[] abp : ab) {
                    double distXYCD = ses;
                    distXYCD = distXYCD + distanceTo(cdp[0], cdp[1], abp[0], abp[1]);
                    String s1 = abp[0] + "," + abp[1];
                    distXYCD = distXYCD + abHashMap.get(s1);
                    minimumResultCd = Double.min(minimumResultCd, distXYCD);
                }

            }
            System.out.println(Math.min(minimumResultAb, minimumResultCd));
        }
    }

    private static double distanceTo(long x1, long y1, long x2, long y2) {
        return Math.sqrt((Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)));
    }
}
