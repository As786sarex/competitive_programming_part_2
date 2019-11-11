package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CrazyPrison {
    private static ArrayList<Integer> xAxis, yAxis, zAxis;
    private static int d, S, N, upto;
    private static BufferedReader reader;

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        int type = Integer.parseInt(reader.readLine());
        initialize(type);
        takeInput(type);
        if (type==1){
            System.out.println(get1dDp());
        }
        else if (type==2){
            System.out.println(get2dDp());
        }
        else if (type==3){
            System.out.println(get3dDp());
        }
    }

    private static int get1dDp() {
        int count = 0;
        for (int i = 0; i < xAxis.size(); i++) {
            for (int j = i+1; j < xAxis.size(); j++) {
                if (Math.abs(xAxis.get(i)-xAxis.get(j))<=d){
                    count++;
                }
            }
        }
        return count;

    }

    private static void takeInput(int type) throws IOException {
        if (type == 1) {
            N = Integer.parseInt(reader.readLine());
            d = Integer.parseInt(reader.readLine());
            S = Integer.parseInt(reader.readLine());
            upto = Integer.parseInt(reader.readLine());
            while (upto-- > 0) {
                int x= Integer.parseInt(reader.readLine());
                xAxis.add(x);
            }
        } else if (type == 2) {
            N = Integer.parseInt(reader.readLine());
            d = Integer.parseInt(reader.readLine());
            S = Integer.parseInt(reader.readLine());
            upto = Integer.parseInt(reader.readLine());
            while (upto-- > 0) {
                String[] s=reader.readLine().split(",");
                int x= Integer.parseInt(s[0]);
                int y= Integer.parseInt(s[1]);
                xAxis.add(x);
                yAxis.add(y);
            }
        } else if (type == 3) {
            N = Integer.parseInt(reader.readLine());
            d = Integer.parseInt(reader.readLine());
            S = Integer.parseInt(reader.readLine());
            upto = Integer.parseInt(reader.readLine());
            while (upto-- > 0) {
                String[] s=reader.readLine().split(",");
                int x= Integer.parseInt(s[0]);
                int y= Integer.parseInt(s[1]);
                int z= Integer.parseInt(s[2]);
                xAxis.add(x);
                yAxis.add(y);
                zAxis.add(z);
            }
        }
    }


    private static void initialize(int type) {
        if (type == 1) {
            xAxis = new ArrayList<>();
        } else if (type == 2) {
            xAxis = new ArrayList<>();
            yAxis = new ArrayList<>();
        } else if (type == 3) {
            zAxis = new ArrayList<>();
            xAxis = new ArrayList<>();
            yAxis = new ArrayList<>();
        }
    }

    private static int get3dDp() {
        int count = 0;
        for (int i = 0; i < xAxis.size(); i++) {
            for (int j = i+1; j < yAxis.size(); j++) {
                if (xAxis.get(i).equals(xAxis.get(j)) && yAxis.get(i).equals(yAxis.get(j)) && Math.abs(zAxis.get(i) - zAxis.get(j)) <= d) {
                    count++;
                } else if (yAxis.get(i).equals(yAxis.get(j)) && zAxis.get(i).equals(zAxis.get(j)) && Math.abs(xAxis.get(i) - xAxis.get(j)) <= d) {
                    count++;
                } else if (zAxis.get(i).equals(zAxis.get(j)) && xAxis.get(i).equals(xAxis.get(j)) && Math.abs(yAxis.get(i) - yAxis.get(j)) <= d) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int get2dDp() {
        int count = 0;
        for (int i = 0; i < xAxis.size(); i++) {
            for (int j = i+1; j < yAxis.size(); j++) {
                if (xAxis.get(i).equals(xAxis.get(j)) && Math.abs(yAxis.get(i) - yAxis.get(j)) <= d) {
                    count++;
                }
                else if (yAxis.get(i).equals(yAxis.get(j)) && Math.abs(xAxis.get(i) - xAxis.get(j)) <= d) {
                    count++;
                }
            }
        }
        return count;
    }
}
