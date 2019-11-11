package imageutil;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.math.RoundingMode;
import java.util.Scanner;

public class JavaDev {
    private static BigDecimal[] factArr;
    public static void main(String[] args) {
        factArr=new BigDecimal[101];
        factArr[0]=BigDecimal.valueOf(1);
        factArr[1]=BigDecimal.valueOf(1);
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        BigDecimal factN=factorialDecimal(n);
        BigDecimal result=BigDecimal.ZERO;
        for(int i=0;i<=n;i++){
            if((i&1)==0){
                result=result.add((factN.divide(factArr[i],RoundingMode.HALF_DOWN)));
            }
            else{
                result=result.subtract((factN.divide(factArr[i], RoundingMode.HALF_DOWN)));
            }
        }
        System.out.println(result);
    }

    private static BigDecimal factorialDecimal(int n){
        BigDecimal res=BigDecimal.valueOf(1);
        if (n==0||n==1){
            return res;
        }
        else{
            for (int i = 2; i <=n ; i++) {
                res=res.multiply(BigDecimal.valueOf(i));
                factArr[i]=res;
            }
        }
        return res;
    }
}