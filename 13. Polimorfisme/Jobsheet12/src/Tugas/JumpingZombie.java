package Tugas;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        super.health = health;
        super.level = level;
    }

    public void heal() {
        if (level == 1) {
            health = health + (health * 30 / 100);
        } else if (level == 2) {
            health = health + (health * 40 / 100);
        } else if (level == 3) {
            health = health + (health * 50 / 100);
        }
    }

    public String getZombieInfo() {
        String info = "Jumping Zombie Data :\n"
                + "Health\t= " + (int) health + "\n"
                + "Level\t= " + level + "\n";
        return info;
    }

    @Override
    public void destroyable() {
        // TODO Auto-generated method stub
        health = health - (health * 1 / 100);
    }

}