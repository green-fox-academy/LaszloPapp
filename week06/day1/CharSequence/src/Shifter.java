public class Shifter implements CharSequence{

    String temp;
    int i;

    public Shifter(String temp, int i){
        this.temp = temp;
        this.i = i;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return temp.charAt(index+i);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
