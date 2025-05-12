package P4.Pewarisan;
class Hewan {
    String nama = "Hewan";
    int umur = 0;

    public void setHewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void suara() {
        System.out.println("Hewan bersuara...");
    }

    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }
}

class Anjing extends Hewan {
    public void suara() {
        System.out.println("Suara Anjing: Guk guk!");
    }
}

class Kucing extends Hewan {
    public void suara() {
        System.out.println("Suara Kucing: Meong!");
    }
}

public class PewarisanMain {
    public static void main(String[] args) {
        Hewan h = new Hewan();
        Anjing a = new Anjing();
        Kucing k = new Kucing();

        System.out.println("== Hewan ==");
        h.setHewan("Hewan Umum", 2);
        h.info();
        h.suara();

        System.out.println("\n== Anjing ==");
        a.setHewan("Anjing", 3);
        a.info();
        a.suara();

        System.out.println("\n== Kucing ==");
        k.setHewan("Kucing", 1);
        k.info();
        k.suara();
    }
}
