package percobaanclass;

public abstract class Pohon {
    private int tinggi;

    protected Pohon() {
        this.tinggi = 0;
    }

    public abstract void tumbuh();

    public abstract void berbuah();
}
