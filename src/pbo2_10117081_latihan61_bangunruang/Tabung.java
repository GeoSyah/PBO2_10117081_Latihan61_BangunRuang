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
class Tabung extends BangunRuang {
    private double jari;
    private double tinggi;
    private double volume;

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume() {
        this.volume = 3.14 * jari * jari * tinggi;
        return this.volume;
    }
}
