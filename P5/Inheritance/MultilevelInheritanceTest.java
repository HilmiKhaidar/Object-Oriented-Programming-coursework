package P5.Inheritance;


class A {
    void tampilA() {
        System.out.println("Ini kelas A");
    }
}

class B extends A {
    void tampilB() {
        System.out.println("Ini kelas B");
    }
}

class C extends B {
    void tampilC() {
        System.out.println("Ini kelas C");
    }
}

public class MultilevelInheritanceTest {
    public static void main(String[] args) {
        C obj = new C();      // objek dari kelas C
        obj.tampilA();        // dari A
        obj.tampilB();        // dari B
        obj.tampilC();        // dari C
    }
}
