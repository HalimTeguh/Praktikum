package abstractclass;

public abstract class Hewan {
    private int umur;

    protected Hewan() {
        this.umur = 0;
    }

    public void bertambarUmur() {
        this.umur += 1;
    }

    public abstract void bergerak();
}
