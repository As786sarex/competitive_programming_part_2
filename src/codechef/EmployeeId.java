package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

class EmployeeId {
    static HashSet<Integer> vowels;

    public static void main(String[] args) throws Exception {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        vowels = new HashSet<>();
        fillVowels();
        char[] enployee = reader.readLine().toCharArray();
        int[] dp = new int[enployee.length];
        int start = 0, end = 0;
        for (int i = 2; i < enployee.length; i++) {
            if (!vowels.contains((int) enployee[i])) {
                start = i + 1;
                break;
            }
        }
        for (int i = enployee.length - 3; i >= 0; i--) {
            if (!vowels.contains((int) enployee[i])) {
                end = i - 1;
                break;
            }
        }
        for (int i = start; i < end; i++) {
            if (!vowels.contains((int) enployee[i])) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = 0;
            }
        }
        for (int i = enployee.length-7; i >=0 ; i--) {
            if (dp[enployee.length-6]>0){
                break;
            }
            if(dp[i]>1){
                dp[i]=1;
                break;
            }
        }
        int count = 0;
        for (int i = 0; i < enployee.length; i++) {
            if (dp[i] > 1) {
                count++;
            }
        }
        if (t == 1)
            System.out.println(1);
        else
            System.out.print(count + 1);
    }

    private static void fillVowels() {
        vowels.add((int) 'a');
        vowels.add((int) 'e');
        vowels.add((int) 'i');
        vowels.add((int) 'o');
        vowels.add((int) 'u');
        vowels.add((int)'A');
        vowels.add((int)'E');
        vowels.add((int)'I');
        vowels.add((int)'O');
        vowels.add((int)'U');
    }
}
