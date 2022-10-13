package Tugas;

public class MainProgram {
    public static void main(String[] args) {
        // Inisialisasi Program
        DailyTask walking = new DailyTask("Walking", 2, 0.5, 1);
        DailyTask jogging = new DailyTask("Jogging", 3, 1, 2);
        DailyTask running = new DailyTask("Running", 5, 3, 3);

        Skin special = new Skin("Special", 5);
        Skin hutIndonesia = new Skin("HUT Indonesia", 3);
        Skin pahlawan = new Skin("Pahlawan", 4);

        Sepatu naiki = new Sepatu("Naiki", "common");
        Sepatu abibas = new Sepatu("Abibas", "common");
        Sepatu quma = new Sepatu("Quma", "Rare");
        Sepatu swallow = new Sepatu("Swallow", "Legend");

        // player
        User halim = new User("Halim", swallow, hutIndonesia);
        halim.info();

        // playing
        halim.startTask(running);
        halim.startTask(running);
        halim.startTask(running);
        halim.startTask(running);
        halim.startTask(running);
        halim.startTask(running);
        halim.startTask(running);
        halim.startTask(running);

    }
}
