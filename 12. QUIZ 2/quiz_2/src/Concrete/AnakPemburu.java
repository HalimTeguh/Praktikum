package Concrete;

import Abstract.Dinosaurus;
import Interface.IMengambilTelur;

public class AnakPemburu extends Pemburu implements IMengambilTelur {

    @Override
    public void mengambilTelur(Dinosaurus dino) {
        // TODO Auto-generated method stub
        System.out.println("Anak Pemburu sedang mengambil Telur Dinosaurus");
    }

    @Override
    public void berburu(TyrannosaurusRex trex) {
        // TODO Auto-generated method stub
        System.out.println("Anak Pemburu sedang memburu T-Rex");
    }

}
