package Pertemuan4PBO;

public class Kubus implements BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    // Implementasi metode hitungVolume
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    // Implementasi metode hitungLuasPermukaan
    public double hitungLuasPermukaan() {
        return 6* (sisi * sisi);
    }
}


