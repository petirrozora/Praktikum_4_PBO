package Pertemuan4PBO;

public class BangunRuangMain {
	
	public static void main(String[] args) {
        // Membuat objek Balok
        BangunRuang balok = new Balok(2, 4, 7);
        System.out.println("Balok:");
        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());

        // Membuat objek Kubus
        BangunRuang kubus = new Kubus(4);
        System.out.println("\nKubus:");
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());
    }
}
