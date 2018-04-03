public class Vegetable {

    public String name;
    public String color;
    private boolean peeled;

    public Vegetable(String name, String color, boolean peeled) {
        this.name = name;
        this.color = color;
        this.peeled = false;
    }

    public Vegetable(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPeeled(boolean peeled) {
        this.peeled = peeled;
    }

    public boolean isPeeled() {
        return peeled;
    }
}
