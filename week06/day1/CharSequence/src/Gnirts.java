public class Gnirts implements CharSequence{

    String temp;

    public Gnirts(String example){
        this.temp = example;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return temp.charAt(temp.length() - (index + 1));
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
