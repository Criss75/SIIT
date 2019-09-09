import org.imgscalr.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.*;

public class Rotator{
    public static void main(String... args){
        
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("beagle-detail.jpg"));
        } catch (IOException e) {
        }
        
        BufferedImage rotatedImg = Scalr.rotate(img, Scalr.Rotation.CW_90);

        try {
            File outputfile = new File("beagle-detail-rotated.jpg");
            ImageIO.write(rotatedImg, "jpg", outputfile);
        } catch (IOException e) {
        }
    }
}