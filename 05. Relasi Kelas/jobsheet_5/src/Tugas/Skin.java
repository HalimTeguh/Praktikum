package Tugas;

public class Skin {
    private String nameSkin;
    private int benefit;

    Skin() {

    }

    Skin(String nameSkin, int benefit) {
        this.nameSkin = nameSkin;
        this.benefit = benefit;
    }

    public void setName(String nameSkin) {
        this.nameSkin = nameSkin;
    }

    public String getName() {
        return nameSkin;
    }

    public void setBenefit(int benefit) {
        this.benefit = benefit;
    }

    public int getBenefit() {
        return benefit;
    }

    public void info() {
        System.out.println("Name Skin\t: " + nameSkin);
        System.out.println("Benefit Skin\t: Durability +" + benefit);
    }
}
