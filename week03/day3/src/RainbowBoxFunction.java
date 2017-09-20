import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static java.awt.Color.red;
import static javax.swing.JFrame.EXIT_ON_CLOSE;



public class RainbowBoxFunction {

    public static void mainDraw(Graphics graphics){
      // create a square drawing function that takes 2 parameters:
      // the square size, and the fill color,
      // and draws a square of that size and color to the center of the canvas.
      // create a loop that fills the canvas with rainbow colored squares.
        Random rand = new Random();

        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();

        Color randomColor = new Color(r, g, b);

        squareDraw(graphics, randomColor, 300);


    }

     static void squareDraw(Graphics graphics, Color color, int sizeSq) {

            for (int i = 0; i < 5; i++) {
                graphics.setColor(color);
                graphics.fillRect(160, 170, sizeSq, sizeSq);
                sizeSq -= 30;
            }
        }




//    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
