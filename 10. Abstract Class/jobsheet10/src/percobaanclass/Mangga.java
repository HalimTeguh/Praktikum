package percobaanclass;

public class Mangga extends Pohon {

    public void info() {
        System.out.println("ini Pohon Mangga");
    }

    @Override
    public void tumbuh() {
        // TODO Auto-generated method stub
        System.out.println("Pohon Mangga sedang bertumbuh");
    }

    @Override
    public void berbuah() {
        // TODO Auto-generated method stub
        System.out.println("Pohon Mangga sudah berbuah");
    }
}
