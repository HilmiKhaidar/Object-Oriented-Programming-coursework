package NO1;
public class Main {
    public static void main(String[] args) {
        // Membuat objek Prodi dan Himpunan
        Prodi prodi = new Prodi();
        prodi.setId(1);
        prodi.setNama("Informatika");

        Himpunan himpunan = new Himpunan();
        himpunan.setId(1);
        himpunan.setNama("Himpunan Mahasiswa Informatika Itenas");

        // Membuat mahasiswa 1
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setId(1);
        mhs1.setNama("Unyil Surunyil");
        mhs1.setProdi(prodi);
        mhs1.setHimpunan(himpunan);

        // Membuat mahasiswa 2
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setId(2);
        mhs2.setNama("Usro Suroso");
        mhs2.setProdi(prodi);
        mhs2.setHimpunan(himpunan);

        // Membuat mesin dan mobil untuk Unyil
        Mesin mesin = new Mesin();
        mesin.setId(1);
        mesin.setMerk("Honda");
        mesin.setUkuran(1500);

        Mobil mobil = new Mobil();
        mobil.setMerk("Honda");
        mobil.setMesin(mesin);
        mhs1.setMobil(mobil);

        // Output
        System.out.println("Nama Mahasiswa 1 " + mhs1.getNama());
        System.out.println("Nama Mahasiswa 2 " + mhs2.getNama());
        System.out.println(mhs1.getNama() + " dan " + mhs2.getNama() + " kuliah di " + mhs1.getProdi().getNama() + " Itenas Bandung");
        System.out.println("Mereka anggota " + mhs1.getHimpunan().getNama());
        System.out.println(mhs1.getNama() + " mengendarai Mobil " + mhs1.getMobil().getMerk() + " dengan mesin " + mhs1.getMobil().getMesin().getUkuran() + " cc");
    }
}

class Prodi {
    private int id;
    private String nama;

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Himpunan {
    private int id;
    private String nama;

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Mesin {
    private int id;
    private String merk;
    private int ukuran;

    public void setId(int id) {
        this.id = id;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public String getMerk() {
        return merk;
    }

    public int getUkuran() {
        return ukuran;
    }
}

class Mobil {
    private String merk;
    private Mesin mesin;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }

    public String getMerk() {
        return merk;
    }

    public Mesin getMesin() {
        return mesin;
    }
}

class Mahasiswa {
    private int id;
    private String nama;
    private Prodi prodi;
    private Himpunan himpunan;
    private Mobil mobil;

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(Prodi prodi) {
        this.prodi = prodi;
    }

    public void setHimpunan(Himpunan himpunan) {
        this.himpunan = himpunan;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public String getNama() {
        return nama;
    }

    public Prodi getProdi() {
        return prodi;
    }

    public Himpunan getHimpunan() {
        return himpunan;
    }

    public Mobil getMobil() {
        return mobil;
    }
}
