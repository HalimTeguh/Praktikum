package Tugas2;

public class MainProgram {
    public static void main(String[] args) {
        // Inisialisasi Program
        DailyTask walking = new DailyTask("Walking", 2, 0.5, 1);
        DailyTask jogging = new DailyTask("Jogging", 3, 1, 2);
        DailyTask running = new DailyTask("Running", 5, 3, 3);
        DailyTask cycling = new DailyTask("Cycling", 4, 2, 1);

        Skin special = new Skin("Special", 5);
        Skin hutIndonesia = new Skin("HUT Indonesia", 3);
        Skin pahlawan = new Skin("Pahlawan", 4);

        Sepatu naiki = new Sepatu("SCN01", "Naiki", "common");
        Sepatu abibas = new Sepatu("SCA02", "Abibas", "common");
        Sepatu quma = new Sepatu("SRQ01", "Quma", "Rare");
        Sepatu swallow = new Sepatu("SLS01", "Swallow", "Legend");

        Sepeda polycome = new Sepeda("BRP", "Polycome", "Rare");

        // player
        User halim = new User("Halim", swallow, hutIndonesia);
        halim.info();

        User teguh = new User("Teguh", polycome, pahlawan, 0, 0);

        // playing player 1
        halim.startTask(running);
        halim.startTask(running);

        halim.repairItem();

        halim.info();

        // playing player 2
        teguh.startTask(cycling);
        teguh.startTask(cycling);

        teguh.repairItem();

        teguh.info();

    }
}
