package imageutil;

import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import javax.imageio.ImageIO;
import java.io.*;
import java.util.Arrays;
import java.util.Base64;
import java.util.StringTokenizer;

public class Testing {
    public static void main(String[] args){
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        File file = new File("trr.jpg");
        Mat image=Imgcodecs.imread(file.getAbsolutePath(), Imgcodecs.IMREAD_COLOR);
        int addPixelRows = Core.getOptimalDFTSize(image.rows());
        int addPixelCols = Core.getOptimalDFTSize(image.cols());
        Imgproc.accumulate(image,image,Mat.zeros(image.rows(),image.cols(),CvType.CV_8U));
        Imgcodecs.imwrite("kjj.jpg",image);
    }
}
