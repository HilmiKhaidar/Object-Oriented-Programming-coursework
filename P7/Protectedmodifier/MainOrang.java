package P7.Protectedmodifier;

class Orang {
    protected String nama;

    public Orang(String nama) {
        this.nama = nama;
        perkenalan();
    }

    protected void perkenalan() {
        System.out.println("Halo, nama saya " + nama);
    }
}

class Pelajar extends Orang {
    protected String sekolah;

    public Pelajar(String nama, String sekolah) {
        super(nama);
        this.sekolah = sekolah;
    }

    public void infoBelajar() {
        System.out.println("Saya mahasiswa di " + sekolah);
    }
}

public class MainOrang {
    public static void main(String[] args) {
        Pelajar pelajar = new Pelajar("Hilmi Khaidar N", "Institut Teknologi Nasional Bandung");
        pelajar.infoBelajar();
    }
}
