package Tugas2;

public class Sepatu extends Item {
    private String id;
    private String name;

    Sepatu(String id, String name, String rate) {
        super(rate);
        this.id = id;
        this.name = name;
    }

    Sepatu() {
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
        System.out.println("Id Shoes\t: " + id);
        System.out.println("Name Shoes\t: " + name);
        infoItem();
    }
}
