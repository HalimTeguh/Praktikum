package Tugas2;

public class Sepeda extends Item {
    private String id;
    private String name;

    public Sepeda(String id, String name, String rate) {
        super(rate);
        this.id = id;
        this.name = name;
    }

    public Sepeda() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void info() {
        System.out.println("==========Status Item==========");
        System.out.println("Id Bicyle\t: " + id);
        System.out.println("Name Bicyle\t: " + name);
        infoItem();
    }

}
