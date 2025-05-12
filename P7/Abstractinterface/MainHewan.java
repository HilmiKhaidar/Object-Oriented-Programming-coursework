package P7.Abstractinterface;

interface BisaTerbang {
    void terbang();
}

abstract class Hewan {
    protected String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public void makan() {
        System.out.println(nama + " sedang makan.");
    }

    public abstract void bersuara();
}

class Burung extends Hewan implements BisaTerbang {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: ciit-ciit!");
    }

    @Override
    public void terbang() {
        System.out.println(nama + " sedang terbang tinggi di langit.");
    }
}

public class MainHewan {
    public static void main(String[] args) {
        Burung burung = new Burung("Burung Merpati");

        burung.makan();
        burung.bersuara();
        burung.terbang();
    }
}
