package NO1.Catatan;
class Mahasiswa {
    private int id;
    private String nama;
    private Prodi prodi;
    private Himpunan himpunan;
    private Mobil mobil;

    Mahasiswa() {
    }

    public void setId(int var1) {
        this.id = var1;
    }

    public void setNama(String var1) {
        this.nama = var1;
    }

    public void setProdi(Prodi var1) {
        this.prodi = var1;
    }

    public void setHimpunan(Himpunan var1) {
        this.himpunan = var1;
    }

    public void setMobil(Mobil var1) {
        this.mobil = var1;
    }

    public String getNama() {
        return this.nama;
    }

    public Prodi getProdi() {
        return this.nama;
    }

    public Himpunan getHimpunan() {
        return this.himpunan;
    }

    public Mobil getMobil() {
        return this.mobil;
    }
}