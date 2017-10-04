import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class PositionedImage {

    BufferedImage image;
    int posX, posY;

    public PositionedImage(ArrayList<BasicEnemy> enemies){

    }


    public PositionedImage(String filename, int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public PositionedImage() {

    }

    public void draw(Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, posX*72, posY*72, null);
        }
    }
}