package ro.siit;

import org.imgscalr.Scalr;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class RotatorBatch
{
    public static void main( String[] args )
    {


        File folder = new File("input");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            process(listOfFiles[i]);
        }
    }

    private static void process(File file){
        BufferedImage img = null;
        try {
            img = ImageIO.read(file);
        } catch (IOException e) {
        }

        BufferedImage rotatedImg = Scalr.rotate(img, Scalr.Rotation.CW_90);

        try {
            File outputfile = new File("output/rotated" + file.getName());
            ImageIO.write(rotatedImg, file.getName().substring(file.getName().lastIndexOf('.') + 1), outputfile);
        } catch (IOException e) {
        }
    }
}
