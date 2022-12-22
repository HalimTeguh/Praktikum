public abstract class Komputer implements Mouse, Keyboard, Printer {
    protected String merek, processor;
    protected int ram;
    protected boolean status;

    abstract void hidupkan_os();

    abstract void matikan_os();
}
