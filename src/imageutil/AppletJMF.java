package imageutil;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.*;

class AppletJMF {
    private final static int mod=1000000007;
    public static void main(String[] args) throws IOException {
        long st=System.currentTimeMillis();
        BufferedImage image = ImageIO.read(new File("trr.JPG"));
        int height = image.getHeight();
        int width = image.getWidth();
        BufferedImage image1=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        long[][] imgArr = new long[height][width];
        int[][] rowWise=new int[height][4];
        int[][] columnWise=new int[width][4];
        for (int i = 0; i < height; i++) {
            int red=0,green=0,blue=0,alpha=0;
            for (int j = 0; j < width; j++) {
                Color c=new Color(image.getRGB(j,i));

                int a=c.getAlpha();
                int r=c.getRed();
                int g=c.getGreen();
                int b=c.getBlue();
                alpha=(alpha+a)%mod;
                red=(red+r)%mod;
                green=(green+g)%mod;
                blue=(blue+b)%mod;
                image1.setRGB(j,i,((a<<24)|(r<<16)|(g<<8)|(b)));
                //System.out.print(r+" "+g+" "+b);
                //System.out.println();
            }
            rowWise[i][0]=alpha;
            rowWise[i][1]=red;
            rowWise[i][2]=green;
            rowWise[i][3]=blue;
        }
        for (int i = 0; i <rowWise.length ; i++) {

            for (int j = 0; j <4 ; j++) {
                System.out.print(rowWise[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(rowWise.length);
        /*for (int i = 0; i < width; i++) {
            System.out.print(imgArr[0][i] + " ");
        }*/
        ImageIO.write(image1,"jpg",new File("great.jpg"));
        /*for (int i = 0; i <height ; i++) {
            for (int j = 0; j <width ; j++) {
                int alpha= (int) (imgArr[i][j]<<24&0xFF);
                int r= (int) (imgArr[i][j]<<16&0xFF);
                int g= (int) (imgArr[i][j]<<8&0xFF);
                int b= (int) (imgArr[i][j] &0xff);

                int out=alpha|r|g|b;
                System.out.print(out+" ");
                //System.out.print(alpha+" "+r+" "+g+" "+b);
            }
            System.out.println();
        }*/

        //System.out.println(out);
        long et=System.currentTimeMillis();
        System.out.println((et-st));
    }
}