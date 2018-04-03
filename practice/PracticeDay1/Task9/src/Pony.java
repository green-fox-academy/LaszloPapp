public class Pony {

    private String color;
    private int extremities;
    private boolean canFly;

    public Pony(String color) {
        this.color = color;
        this.extremities = 4;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getExtremities() {
        return extremities;
    }

    public void setExtremities(int extremities) {
        this.extremities = extremities;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
