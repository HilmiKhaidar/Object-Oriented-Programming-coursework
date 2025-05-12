package P5.Implementasikan_penggunaan_super;

class Hewan {
    public Hewan() {
        // Constructor tidak menghasilkan output
    }

    public void suara() {
        System.out.println("Hewan bersuara.");
    }
}

class Burung extends Hewan {
    public Burung() {
        super(); // Memanggil constructor Hewan
    }

    @Override
    public void suara() {
        super.suara(); // Memanggil method suara() dari Hewan
        System.out.println("Burung berkicau.");
    }
}

public class Main {
    public static void main(String[] args) {
        Burung b = new Burung();
        b.suara();
    }
}

