// File: KelasUtama.java

class Prodi {
    private int id;
    private String nama;

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getId() {
        return id;
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

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }
}

class Processor {
    private int id;
    private String merk;
    private String tipe;

    public void setId(int id) {
        this.id = id;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getId() {
        return id;
    }

    public String getMerk() {
        return merk;
    }

    public String getTipe() {
        return tipe;
    }
}

class Laptop {
    private String merk;
    private Processor processor;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public String getMerk() {
        return merk;
    }

    public Processor getProcessor() {
        return processor;
    }
}

class Dosen {
    private int id;
    private String nama;
    private Prodi prodi;
    private Himpunan himpunan;
    private Laptop laptop;

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

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
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

public class KelasUtama {
    public static void main(String[] args) {
        // Membuat objek Prodi
        Prodi prodi = new Prodi();
        prodi.setId(1);
        prodi.setNama("Informatika");

        // Membuat objek Himpunan
        Himpunan himpunan = new Himpunan();
        himpunan.setId(1);
        himpunan.setNama("Himpunan Dosen Informatika Itenas");

        // Membuat objek Processor
        Processor processor = new Processor();
        processor.setId(1);
        processor.setMerk("Intel");
        processor.setTipe("Core i7");

        // Membuat objek Laptop
        Laptop laptop = new Laptop();
        laptop.setMerk("ASUS");
        laptop.setProcessor(processor);

        // Membuat objek Dosen
        Dosen dosen = new Dosen();
        dosen.setId(1);
        dosen.setNama("Uung Ungkawa");
        dosen.setProdi(prodi);
        dosen.setHimpunan(himpunan);
        dosen.setLaptop(laptop);

        // Menampilkan data lengkap
        System.out.println("=== Data Dosen ===");
        System.out.println("Nama Dosen   : " + dosen.getNama());
        System.out.println("Prodi        : " + dosen.getProdi().getNama());
        System.out.println("Himpunan     : " + dosen.getHimpunan().getNama());
        System.out.println("Laptop       : " + dosen.getLaptop().getMerk());
        System.out.println("Processor    : " + dosen.getLaptop().getProcessor().getMerk() + " " + dosen.getLaptop().getProcessor().getTipe());
    }
}
