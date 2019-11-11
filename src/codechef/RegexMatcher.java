package codechef;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RegexMatcher {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("mytestcase.txt");
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        int num = random.nextInt(1000)+1000;
        for (int i = 0; i < 100; i++) {

            for (int j = 0; j < num; j++) {
                char c= (char) ((j%26)+97);
                builder.append(c);
            }
            builder.append("\n");
            writer.write(builder.toString());

        }
        writer.close();
    }
}
