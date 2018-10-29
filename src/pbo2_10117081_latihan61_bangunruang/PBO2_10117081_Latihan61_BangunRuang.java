/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan61_bangunruang;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Memperlihatkan hasil dari rumus Bola, Tabung dan Kerucut
 */
public class PBO2_10117081_Latihan61_BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bola b = new Bola();
        Tabung t = new Tabung();
        Kerucut k = new Kerucut();
        
        b.setJari(7);
        System.out.println("Volume Bola : " + b.hitungVolume());
        
        t.setTinggi(21);
        t.setJari(10);
        System.out.println("Volume Tabung : " + t.hitungVolume());
        
        k.setJari(14);
        k.setTinggi(9);
        k.hitungSisiSelimut();
        System.out.println("Volume Kerucut : " + k.hitungVolume());
    }
    
}
