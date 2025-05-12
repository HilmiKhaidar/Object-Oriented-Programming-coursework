package P2;
import java.util.ArrayList;

class Ayah {
    private String nama;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Ibu {
    private String nama;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Anak {
    private int NIK;
    private String nama;
    private String alamat;
    private Ayah ayahku;
    private Ibu ibuku;

    public Anak(int NIK, String nama) {
        this.NIK = NIK;
        this.nama = nama;
    }

    public int getNIK() {
        return NIK;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public Ayah getAyahku() {
        return ayahku;
    }

    public void setAyahku(Ayah ayahku) {
        this.ayahku = ayahku;
    }

    public Ibu getIbuku() {
        return ibuku;
    }

    public void setIbuku(Ibu ibuku) {
        this.ibuku = ibuku;
    }
}

public class KelasUtama {
    public static void main(String[] args) {
        Ayah ogah = new Ayah();
        ogah.setNama("Ogah Surogah");

        Ibu iteh = new Ibu();
        iteh.setNama("Iteh Suroteh");

        Anak unyil = new Anak(15202201, "Unyil Surunyil");
        unyil.setAlamat("Kampung Suronyoh");
        unyil.setAyahku(ogah);
        unyil.setIbuku(iteh);

        Anak usro = new Anak(15202202, "Usro Suroso");
        usro.setAlamat("Kampung Suronyoh");
        usro.setAyahku(ogah);
        usro.setIbuku(iteh);

        ArrayList<Anak> anak2 = new ArrayList<>();
        anak2.add(unyil);
        anak2.add(usro);

        System.out.println("Anak 1: NIK " + anak2.get(0).getNIK() +
            " Nama Anak " + anak2.get(0).getNama() +
            " Nama Ayah " + anak2.get(0).getAyahku().getNama() +
            " Nama Ibu " + anak2.get(0).getIbuku().getNama());

        System.out.println("Anak 2: NIK " + anak2.get(1).getNIK() +
            " Nama Anak " + anak2.get(1).getNama() +
            " Nama Ayah " + anak2.get(1).getAyahku().getNama() +
            " Nama Ibu " + anak2.get(1).getIbuku().getNama());

        System.out.println();
        System.out.println("Anak-anak dari Ayah " + ogah.getNama() +
            " dan Ibu " + iteh.getNama() + " adalah:");

        for (int i = 0; i < anak2.size(); i++) {
            System.out.println((i + 1) + ". " + anak2.get(i).getNama());
        }

        for (int i = 0; i < anak2.size(); i++) {
            System.out.println("Anak ke-" + (i + 1) + ": " + anak2.get(i).getNama() +
                " (Ayah: " + anak2.get(i).getAyahku().getNama() +
                ", Ibu: " + anak2.get(i).getIbuku().getNama() + ")");
        }
    }
}
