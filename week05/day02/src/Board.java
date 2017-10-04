import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    int testBoxX;
    int testBoxY;
    String fileName;
    int[][] wallArray;
    Hero batman;

    public Board() {
        wallArray = new int [][]{
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

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);

        batman = new Hero();

    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
      //  graphics.fillRect(testBoxX, testBoxY, 72, 72);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.
        PositionedImage floor = new PositionedImage("floor.png", 0, 0);
        PositionedImage wall = new PositionedImage("wall.png", 0, 0);
        for (int i = 0; i < wallArray.length; i++) {
            for (int j = 0; j < wallArray.length; j++) {
                if (wallArray[i][j] == 1) {
                    wall.posX = i;
                    wall.posY = j;
                    wall.draw(graphics);
                }else{
                    floor.posX = i;
                    floor.posY = j;
                    floor.draw(graphics);
                }
            }
        }
        batman.draw(graphics);
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
            batman.posY--;
            batman.heroUp();
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            batman.posY++;
            batman.heroDown();
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            batman.posX--;
            batman.heroLeft();
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            batman.posX++;
            batman.heroRight();
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}
