package Tugas;

public class DailyTask {
    private String nameTask;
    private int reward;
    private double exp;
    private int decreaseDura;

    DailyTask() {

    }

    DailyTask(String nameTask, int reward, double exp, int decreaseDura) {
        this.nameTask = nameTask;
        this.reward = reward;
        this.exp = exp;
        this.decreaseDura = decreaseDura;
    }

    public void setName(String nameTask) {
        this.nameTask = nameTask;
    }

    public String getName() {
        return nameTask;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getReward() {
        return reward;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public double getExp() {
        return exp;
    }

    public void setDeDura(int decreaseDura) {
        this.decreaseDura = decreaseDura;
    }

    public int getDeDura() {
        return decreaseDura;
    }

    public void info() {
        System.out.println("Name Daily Task\t\t\t\t\t: " + nameTask);
        System.out.println("Reward Daily Task\t\t\t\t: " + reward);
        System.out.println("Your Exp will increase as much as \t\t: +" + exp);
        System.out.println("Your Durability will be reduced as much as \t: -" + decreaseDura);
    }

}
