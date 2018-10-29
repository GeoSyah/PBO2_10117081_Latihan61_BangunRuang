/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan61_bangunruang;

/**
 *
 * @author Geo Syah Alkautsar
 */
class Bola extends BangunRuang {
    private double jari;
    private double volume;

    public double getJari() {
      return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }
    
    @Override
    public double hitungVolume() {
        this.volume = (4/3) * 3.14 * (jari * jari * jari);
      return this.volume;
    }
    
}
