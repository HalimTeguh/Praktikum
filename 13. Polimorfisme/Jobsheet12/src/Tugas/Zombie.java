package Tugas;

public abstract class Zombie implements Destroyable {
    protected double health;
    protected int level;

    public void heal() {
        if (level == 1) {
            health = health;
        } else if (level == 2) {
            health = health;
        } else if (level == 3) {
            health = health;
        }
    }

    public void destroyable() {
        health = health - (health * 5 / 100);
    }

    public String getZombieInfo() {
        String info = "Zombie Data :\n"
                + "Health\t= " + (int) health + "\n"
                + "Level\t= " + level + "\n";
        return info;

    }
}