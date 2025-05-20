class Ayah {
    private String nama;

    public Ayah(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Perusahaan {
    private String id, nama;

    public Perusahaan(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Penduduk {
    private String NIK, nama;
    private Ayah ayah;

    public Penduduk(String NIK, String nama, Ayah ayah) {
        this.NIK = NIK;
        this.nama = nama;
        this.ayah = ayah;
    }

    public String getNama() {
        return nama;
    }

    public Ayah getAyah() {
        return ayah;
    }
}

class Karyawan extends Penduduk {
    private String id;
    private Perusahaan perusahaan;

    public Karyawan(String id, String NIK, String nama, Ayah ayah, Perusahaan perusahaan) {
        super(NIK, nama, ayah);
        this.id = id;
        this.perusahaan = perusahaan;
    }

    public Perusahaan getPerusahaan() {
        return perusahaan;
    }
}

public class Remedial {
    public static void main(String[] args) {
        Ayah ayah = new Ayah("Pak Ogah Surogah");
        Perusahaan perusahaan = new Perusahaan("01", "PT Cemerlang Jaya");
        Karyawan unyi = new Karyawan("01", "123", "Unyi Surunyil", ayah, perusahaan);

        System.out.println(unyi.getNama() + " adalah anak " + unyi.getAyah().getNama());
        System.out.println(unyi.getNama() + " bekerja di " + unyi.getPerusahaan().getNama());
    }
}
