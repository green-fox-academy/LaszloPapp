import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    int testBoxX;
    int testBoxY;
    String fileName;

    public Board() {
        testBoxX = 0;
        testBoxY = 0;
        fileName = "hero-down.png";


        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(testBoxX, testBoxY, 72, 72);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.
        PositionedImage floor = new PositionedImage("floor.png", 0, 0);
        PositionedImage wall = new PositionedImage("wall.png", 0, 0);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                floor.posX = i;
                floor.posY = j;
                floor.draw(graphics);
            }
        }
        int[][]wallArray = new int [][]{
                {0,0,0,1,0,1,0,0,0,0},
                {0,0,0,1,0,1,0,1,1,0},
                {0,1,1,1,0,1,0,1,1,0},
                {0,0,0,0,0,1,0,0,0,0},
                {0,0,0,0,1,0,0,0,0,1},
                {0,1,0,1,0,0,0,0,1,0},
                {0,1,0,1,0,1,1,0,1,0},
                {0,0,0,0,0,1,1,0,1,0},
                {0,1,1,1,0,0,0,0,1,0},
                {0,0,0,0,0,1,1,0,1,0},
                };
        for (int i = 0; i < wallArray.length; i++) {
            for (int j = 0; j < wallArray.length; j++) {
                if (wallArray[i][j] == 1) {
                    wall.posX = i;
                    wall.posY = j;
                    wall.draw(graphics);
                }
            }
        }
        PositionedImage heroDown = new PositionedImage(fileName, testBoxX, testBoxY);
        heroDown.draw(graphics);
        PositionedImage heroUp = new PositionedImage(fileName, testBoxX, testBoxY);
        heroUp.draw(graphics);
        PositionedImage heroRight = new PositionedImage(fileName, testBoxX, testBoxY);
        heroRight.draw(graphics);
        PositionedImage heroLeft = new PositionedImage(fileName, testBoxX, testBoxY);
        heroLeft.draw(graphics);
    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            fileName = "hero-up.png";
            testBoxY --;
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            fileName = "hero-down.png";
            testBoxY ++;
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            fileName = "hero-left.png";
            testBoxX --;
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            fileName = "hero-right.png";
            testBoxX ++;
        }
        System.out.println(testBoxX);
        System.out.println(testBoxY);
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}
