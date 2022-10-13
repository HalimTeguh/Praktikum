package Tugas;

import java.util.Scanner;

public class User {
    private String name;
    private Sepatu sepatu;
    private Skin skin;
    private DailyTask task;
    private int level;
    private double exp;
    private int koin;
    Scanner sc = new Scanner(System.in);

    User() {
        this.level = 0;
        this.exp = 0;
        this.koin = 0;
    }

    User(String name, Sepatu sepatu, Skin skin) {
        this.name = name;
        this.sepatu = sepatu;
        this.skin = skin;
        if (this.skin.getName().equalsIgnoreCase(skin.getName())) {
            int tempDura = sepatu.getDura();
            tempDura += skin.getBenefit();
            sepatu.setDura(tempDura);
        }
        this.exp = 0;
        this.level = 0;
        this.koin = 0;
    }

    User(String name, Sepatu sepatu, Skin skin, int level, int koin) {
        this.name = name;
        this.sepatu = sepatu;
        this.skin = skin;
        if (this.skin.getName().equalsIgnoreCase(skin.getName())) {
            int tempDura = sepatu.getDura();
            tempDura += skin.getBenefit();
            sepatu.setDura(tempDura);
        }
        this.level = level;
        this.exp = 0;
        this.koin = koin;
    }

    public String getName() {
        return name;
    }

    public Sepatu getSepatu() {
        return sepatu;
    }

    public Skin getSkin() {
        return skin;
    }

    public int getLevel() {
        return level;
    }

    public int getKoin() {
        return koin;
    }

    public double getExp() {
        return exp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSepatu(Sepatu sepatu) {
        this.sepatu = sepatu;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    public void repairShoes() {
        System.out.println("1 koin = 2 durability");
        System.out.print("Do you wanna repair your shoes? (y/n) :");
        String choose = sc.nextLine();

        if (choose.equalsIgnoreCase("y")) {
            if (koin > 0) {
                koin--;
                sepatu.setDura(sepatu.getDura() + 2);
                System.out.println("your shoes have been repaired, Thank you very much");
            } else {
                System.out.println("Your koin is not enough");
            }
        } else {
            System.out.println("Don't Forget to repair your shoes,  See you next time");
        }

    }

    public void info() {
        System.out.println("\nyour Status");
        System.out.println("Name\t: " + getName());
        System.out.println("Level\t: " + getLevel());
        System.out.println("Exp\t: " + getExp());
        System.out.println("Koin\t: " + getKoin());
        System.out.println("\nEquipment");
        sepatu.info();
        skin.info();
        System.out.println();

    }

    public void startTask(DailyTask task) {
        System.out.println("**Start " + task.getName() + "**");
        System.out.println("##INFO TASK##");
        task.info();
        System.out.print("Do you want to begin this task? (y/n) :");
        String choose = sc.nextLine();

        if (choose.equalsIgnoreCase("y")) {
            if (sepatu.getDura() > task.getDeDura()) {
                this.koin += task.getReward(); // set KOIN
                int tempDura = sepatu.getDura(); // set DURABILITY
                tempDura -= task.getDeDura();
                sepatu.setDura(tempDura);
                exp += task.getExp(); // set EXP
                if (exp >= 10) {
                    level++;
                    exp -= 10;
                }
                info();
            } else {
                info();
                System.out.println(
                        "your shoes will broken if your start this taks. please repair your shoes!");
            }
        }
        System.out.println("**Finish " + task.getName() + "**\n");

    }
}
