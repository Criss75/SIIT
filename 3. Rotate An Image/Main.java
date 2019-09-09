import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
 
public class ReadAndWriteImage
{   
    public static void main(String[] args)
    {   
        File file = new File(DScoala Informala de ITTemeHW07051.jpg);
         
        BufferedImage image = null;
         
        try
        {
            image = ImageIO.read(file);
             
            ImageIO.write(image, jpg, new File(DScoala Informala de ITTemeHW07052.jpg));
             
    
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
         
        System.out.println(done);
    }
}