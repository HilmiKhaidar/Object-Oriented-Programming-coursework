class Dosen {
    private int id;
    private String nama;
    private Prodi prodi;
    private Himpunan himpunan;
    private Laptop laptop;

    Dosen() {
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

    public void setLaptop(Laptop var1) {
        this.laptop = var1;
    }

    public int getId() {
        return id;
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

    public Laptop getLaptop() {
        return laptop;
    }

    
}