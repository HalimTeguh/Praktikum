/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

/**
 *
 * @author arie
 */
public class TestBackend {

    public static void main(String[] args) {
        Kategori kat1 = new Kategori("Novel", "Collection of paperback books");
        Kategori kat2 = new Kategori("Reference", "Scholarly reference book");
        Kategori kat3 = new Kategori("Comic", "Comic Children");
        
        kat1.save();
        kat2.save();
        kat3.save();
        kat2.setKeterangan("Collection of scientific reference books");
        kat2.save();
        
        kat3.delete();
        for(Kategori kategori : new Kategori ().getAll()){
            System.out.println("name : " + kategori.getNama() + ", Ket: " + kategori.getKeterangan());
        }
        for(Kategori kategori : new Kategori ().search("scientific")){
            System.out.println("name : " + kategori.getNama() + ", Ket: " + kategori.getKeterangan());
        }
    }
}
