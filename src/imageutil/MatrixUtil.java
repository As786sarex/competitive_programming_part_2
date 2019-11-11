package imageutil;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class MatrixUtil {
    public static void main(String[] args) throws Exception {
        BufferedImage image =ImageIO.read(new File("trr.jpg"));
        PrintWriter writer=new PrintWriter("my.txt");
        System.out.println(image.getHeight()+" "+image.getWidth());
        long[][] matrix=new long[image.getHeight()+1][image.getWidth()+1];
        for (int i = 1; i <=image.getHeight(); i++) {
            for (int j = 1; j <=image.getWidth() ; j++) {
                matrix[i][j]=image.getRGB(i,j);
                writer.print(image.getRGB(i,j)+" ");
                image.setRGB(i,j, (int) (Math.random()*256));
            }
           // writer.println();
        }
       ImageIO.write(image,"jpg",new File("jj.jpg"));
        writer.flush();
        writer.close();


    }
}
