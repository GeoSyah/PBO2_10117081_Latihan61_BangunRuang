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
class Kerucut extends BangunRuang {
    private double jari;
    private double tinggi;
    private double sisi;
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
    
    public double hitungSisiSelimut() {
        this.sisi = Math.sqrt((jari*jari)+(tinggi*tinggi));
        return this.sisi;
    }
    
    @Override
    public double hitungVolume() {
        this.volume = (1 * 3.14 * jari * jari* tinggi) / 3;
        return this.volume;
    }
    
}
