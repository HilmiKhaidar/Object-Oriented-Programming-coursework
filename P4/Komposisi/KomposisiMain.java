package P4.Komposisi;

class Kamar {
    private String tipe;
    private int luas;

    public Kamar(String tipe, int luas) {
        this.tipe = tipe;
        this.luas = luas;
    }

    public void infoKamar() {
        System.out.println("Tipe Kamar : " + tipe + ".");
        System.out.println("Luas : " + luas + " Meter");
    }
}

class Rumah {
    private String alamat;
    private Kamar kamar;

    public Rumah(String alamat) {
        this.alamat = alamat;
        this.kamar = new Kamar("Kamar Tetangga", 50); // langsung instansiasi kamar
    }

    public void infoRumah() {
        System.out.println("Alamat Rumah : " + alamat + ".");
        kamar.infoKamar(); // tampilkan info kamar dari objek rumah
    }
}

public class KomposisiMain {
    public static void main(String[] args) {
        Rumah rumah = new Rumah("Dago Pakar");
        rumah.infoRumah();
    }
}
