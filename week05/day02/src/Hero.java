import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Hero extends PositionedImage {

    public Hero(){
        super("bat-down.png", 0,0);

    }
    public void heroUp (){
        try {
            image = ImageIO.read(new File("bat-down.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void heroDown (){
        try {
            image = ImageIO.read(new File("bat-down.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void heroRight (){
        try {
            image = ImageIO.read(new File("bat-right.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void heroLeft (){
        try {
            image = ImageIO.read(new File("bat-left.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
