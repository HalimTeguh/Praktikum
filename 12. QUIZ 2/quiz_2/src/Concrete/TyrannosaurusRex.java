package Concrete;

import Abstract.Dinosaurus;

public class TyrannosaurusRex extends Dinosaurus {
    @Override
    public void makan() {
        // TODO Auto-generated method stub
        System.out.println("T-Rex sedang Makan");
    }

    @Override
    public void berjalan() {
        // TODO Auto-generated method stub
        System.out.println("T-Rex sedang Berjalan");
    }
}
