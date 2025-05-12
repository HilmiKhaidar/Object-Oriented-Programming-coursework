package P5.Hierarchical;

class A {
    public void info() {
        System.out.println("Ini kelas induk A");
    }
}

class B extends A {
    public void infoB() {
        System.out.println("Kelas B menurisi dari class A");
    }
}

class C extends A {
    public void infoC() {
        System.out.println("Kelas C menurisi dari class A");
    }
}

class D extends A {
    public void infoD() {
        System.out.println("Kelas D menurisi dari class A");
    }
}

public class HierarchicalTest {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();

        b.info();
        b.infoB();

        c.info();
        c.infoC();

        d.info();
        d.infoD();
    }
}

