import java.util.ArrayList;

public class BasicEnemy extends PositionedImage {

    ArrayList<BasicEnemy> enemies = new ArrayList<>();

    public BasicEnemy(ArrayList<BasicEnemy> enemies){
        super(enemies);
    }

    public BasicEnemy() {
        super("harley-down.png",8,4);
    }

    public void addEnemy(BasicEnemy enemy){
        enemies.add(enemy);
    }
}
