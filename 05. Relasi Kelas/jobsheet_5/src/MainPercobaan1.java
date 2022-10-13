public class MainPercobaan1 {
    public static void main(String[] args) {
        Processor p = new Processor("Intel i5", 3);
        Laptop l = new Laptop("Thinkpad", new Processor("Intel i5", 3));

        l.info();

        Processor p1 = new Processor();
        p1.setMerk("Intel i5");
        p1.setCache(4);

        Laptop l1 = new Laptop();
        l1.setMerk("ThinkPad");
        l1.setProc(p1);

        l1.info();
    }
}
