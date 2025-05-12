package P6.Overriding;

class Kendaraan {
    public void jalan() {
        System.out.println("Kendaraan sedang berjalan");
    }
}

class Mobil extends Kendaraan {
    @Override
    public void jalan() {
        System.out.println("Mobil berjalan dengan aman di jalan raya");
    }
}

public class Main {
    public static void main(String[] args) {
        Mobil m = new Mobil();  // Membuat objek dari class anak
        m.jalan();              // Menampilkan method yang dioverride
    }
}
