public class Gnirts implements CharSequence{

    String example;

    public Gnirts(String example){
        this.example = example;
    }

    public static void main(String[] args) {

        Gnirts g = new Gnirts("example");
        System.out.println(g.charAt(1));
        System.out.println(g.subSequence(1,2));

        // should print out: l
    }

    @Override
    public int length() {
        return Integer.parseInt(this.example);
    }

    @Override
    public char charAt(int index) {
        return this.example.charAt(1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.example.subSequence(1,4);
    }
}
