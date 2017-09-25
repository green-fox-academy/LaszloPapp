import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {

    public static void mainDraw(Graphics graphics) {

        drawCircles(graphics, 30,30, 600);

    }

   static void drawCircles(Graphics graphics, int xMid, int yMid, int radius) {

       Random rand = new Random();

       float r = rand.nextFloat();
       float g = rand.nextFloat();
       float b = rand.nextFloat();

       Color randomColor = new Color(r, g, b);

       if (radius < 5) {
           return;
       } else {
           graphics.drawOval(xMid, yMid, radius, radius);

           graphics.setColor(randomColor);
           drawCircles(graphics, xMid+radius/4, yMid, radius/2);

           graphics.setColor(randomColor);
           drawCircles(graphics, xMid+radius/27 , yMid+radius/2-radius/8 , radius/2);

           graphics.setColor(randomColor);
           drawCircles(graphics, xMid+radius/2-radius/27 , yMid+radius/2-radius/8 , radius/2);
       }
   }




    //    Don't touch the code below
    static int WIDTH = 900;
    static int HEIGHT = 800;
    public static void main(String[] args) throws InterruptedException {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(1000, 1000));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel im = new ImagePanel();
        jFrame.setLocationRelativeTo(null);
        jFrame.add(im);
        im.setBackground(Color.black);
        jFrame.setVisible(true);
        boolean trip = true;
        do {
            im.repaint();
            Thread.sleep(200);
        } while (trip);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
