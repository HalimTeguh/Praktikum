import Concrete.AnakPemburu;
import Concrete.Oviraptor;
import Concrete.Pemburu;
import Concrete.Triceratops;
import Concrete.TyrannosaurusRex;

public class MainProgram {
    public static void main(String[] args) {
        TyrannosaurusRex trex = new TyrannosaurusRex();
        Triceratops triceratops = new Triceratops();
        Oviraptor oviraptor = new Oviraptor();

        trex.berjalan();
        trex.makan();
        System.out.println();

        triceratops.berjalan();
        triceratops.makan();
        System.out.println();

        oviraptor.berjalan();
        oviraptor.makan();
        oviraptor.berterlur();
        System.out.println();

        Pemburu halim = new Pemburu();
        AnakPemburu teguh = new AnakPemburu();

        halim.berburu(trex);
        teguh.berburu(trex);
        System.out.println();

        teguh.mengambilTelur(oviraptor);
        System.out.println();
    }
}
