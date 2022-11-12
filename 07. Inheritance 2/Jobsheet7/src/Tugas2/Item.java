package Tugas2;

public class Item {
    private int durability;
    private String rate; // common, Rare, Legend

    public Item() {
        this.durability = 10;
    }

    public Item(String rate) {
        this.rate = rate;
        this.durability = 10;
        if (rate.equalsIgnoreCase("legend")) {
            durability += 10;
        } else if (rate.equalsIgnoreCase("Rare")) {
            durability += 5;
        }
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public void setDura(int durability) {
        this.durability = durability;
    }

    public int getDura() {
        return durability;
    }

    public void infoItem() {
        System.out.println("Rate Item\t: " + rate);
        System.out.println("Durability Item\t: " + durability);
    }

}
