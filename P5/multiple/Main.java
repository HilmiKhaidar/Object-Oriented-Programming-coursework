interface Makan {
    void makan();
}

interface Tidur {
    void tidur();
}

class Manusia implements Makan, Tidur {
    @Override
    public void makan() {
        System.out.println("Manusia sedang makan.");
    }

    @Override
    public void tidur() {
        System.out.println("Manusia sedang tidur.");
    }
}

public class Main {
    public static void main(String[] args) {
        Manusia orang = new Manusia();
        orang.makan();
        orang.tidur();
    }
}
