public class ToDo {

    String ID;
    boolean completed = false;
    private String arg;

    public ToDo(String arg, String ID, boolean completed){
        this.setArg(arg);
        this.ID = ID;
        this.completed = completed;
    }

    public String getArg() {
        return arg;
    }

    public void setArg(String arg) {
        this.arg = arg;
    }
}
