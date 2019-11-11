package imageutil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VideoGame {
    public static void main(String[] args) throws Exception {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        boolean isEmpty=true;
        int n=Integer.parseInt(str[0]);
        int h=Integer.parseInt(str[1]);
        StringTokenizer tokenizer=new StringTokenizer(reader.readLine());
        StringTokenizer tokenizer12=new StringTokenizer(reader.readLine());
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=Integer.parseInt(tokenizer.nextToken());
        }
        int pos=0;
        while (true){
            int turn=Integer.parseInt(tokenizer12.nextToken());
            if (turn==0){
                break;
            }
            switch(turn){
                case 1:if (pos>0){ pos--;}break;
                case 2: if (pos<(n-1)){pos++;}break;
                case 3:if (isEmpty&&arr[pos]!=0){arr[pos]=arr[pos]-1;isEmpty=false;}break;
                case 4:if (!isEmpty&&arr[pos]!=h){arr[pos]=arr[pos]+1;isEmpty=true;}break;
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
