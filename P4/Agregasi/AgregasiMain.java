package P4.Agregasi;

public class AgregasiMain {
    public static void main(String[] args) {
        Alamat alamat = new Alamat("Jl. Ir Juanda Dago Pakar", "Bandung", "Jawa Barat");
        Mahasiswa mhs1 = new Mahasiswa("Hilmi Khaidar N", 152023149, alamat);
        mhs1.tampilMahasiswa();
    }
}

class Mahasiswa {
    String nama;
    int nim;
    Alamat alamat;

    public Mahasiswa(String nama, int nim, Alamat alamat) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
    }

    public void tampilMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        alamat.tampilAlamat();
    }
}

class Alamat {
    String jalan;
    String kota;
    String provinsi;

    public Alamat(String jalan, String kota, String provinsi) {
        this.jalan = jalan;
        this.kota = kota;
        this.provinsi = provinsi;
    }

    public void tampilAlamat() {
        System.out.println("Alamat: " + jalan + ", " + kota + ", " + provinsi);
    }
}
