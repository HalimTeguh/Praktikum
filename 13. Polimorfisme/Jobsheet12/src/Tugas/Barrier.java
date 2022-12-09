package Tugas;

public class Barrier implements Destroyable {
    private int strenght;

    public Barrier(int strenght) {
        this.strenght = strenght;
    }

    public void setStrength(int strenght) {
        this.strenght = strenght;
    }

    public int getStrength() {
        return strenght;
    }

    public String getBarrierInfo() {
        String info = "Barrier Strength = " + getStrength();
        return info;
    }

    @Override
    public void destroyable() {
        strenght = strenght - (strenght * 10 / 100);
    }

}