package P6.Overloading;

class JumlahParameter {
    // Method overloading dengan jumlah parameter berbeda
    int luas(int sisi) {
        return sisi * sisi;
    }

    int luas(int panjang, int lebar) {
        return panjang * lebar;
    }
}

class TipeParameter {
    // Method overloading dengan tipe parameter berbeda
    void tampilkan(int angka) {
        System.out.println("Angka: " + angka);
    }

    void tampilkan(String teks) {
        System.out.println("Teks: " + teks);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== JumlahParameter ===");
        JumlahParameter jp = new JumlahParameter();
        System.out.println("Luas persegi: " + jp.luas(4));
        System.out.println("Luas persegi panjang: " + jp.luas(4, 6));

        System.out.println("\n=== TipeParameter ===");
        TipeParameter tp = new TipeParameter();
        tp.tampilkan(100);
        tp.tampilkan("Overloading di Java");
    }
}
