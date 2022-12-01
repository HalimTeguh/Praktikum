package Concrete;

import Abstract.Dinosaurus;
import Interface.IBerterlur;

public class Oviraptor extends Dinosaurus implements IBerterlur {

    @Override
    public void berterlur() {
        // TODO Auto-generated method stub
        System.out.println("Oviraptor sedang bertelur");
    }

    @Override
    public void makan() {
        // TODO Auto-generated method stub
        System.out.println("Oviraptor sedang makan");
    }

    @Override
    public void berjalan() {
        // TODO Auto-generated method stub
        System.out.println("Oviraptor sedang berjalan");
    }

}
