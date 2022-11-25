package interfaceLatihan;

public class PascaSarjana extends Mahasiswa implements ICumlaude, IBerprestasi {
    public PascaSarjana(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        // TODO Auto-generated method stub
        kuliahDiKampus();
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTinggi() {
        // TODO Auto-generated method stub
        System.out.println("IPK-ku lebih dari 3,71");
    }

    @Override
    public void menjuaraiKompetisi() {
        // TODO Auto-generated method stub
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        // TODO Auto-generated method stub
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");
    }

}
