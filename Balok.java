package Pertemuan4PBO;

public class Balok implements BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Implementasi metode hitungVolume
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
 // Implementasi metode hitungLuasPermukaan
    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}

