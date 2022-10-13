package Tugas;

public class Sepatu {
    private int durability;
    private String name;
    private String rate; // Common, Rare, Legend

    Sepatu(String name, String rate) {
        this.name = name;
        this.rate = rate;
        this.durability = 10;
        if (rate.equalsIgnoreCase("legend")) {
            durability += 10;
        } else if (rate.equalsIgnoreCase("Rare")) {
            durability += 5;
        }
    }

    Sepatu() {
        this.durability = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void info() {
        System.out.println("Name Shoes\t: " + name);
        System.out.println("Rate Shoes\t: " + rate);
        System.out.println("Durability\t: " + durability);
    }
}
