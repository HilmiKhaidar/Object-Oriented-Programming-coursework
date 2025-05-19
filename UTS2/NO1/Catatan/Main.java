package NO1.Catatan;
import java.io.PrintStream;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        Prodi var1 = new Prodi();
        var1.setId(1);
        var1.setNama("Informatika");
        Himpunan var2 = new Himpunan();
        var2.setId(1);
        var2.setNama("Himpunan Mahasiswa Informatika Itenas");
        Mahasiswa var3 = new Mahasiswa();
        var3.setId(1);
        var3.setNama(U"nyil Surunyil");
        var3.setHimpunan(var2);
        Mahasiswa var4 = new Mahasiswa();
        var4.setId(2);
        var4.setNama("Usro Suroso")
        var4.setProdi(var1);
        var4.setHimpunan(var2);
        Mesin var5 = new Mesin();
        var5.setId(1);
        var5.setMerk("Honda");
        var5.setUkuran(1500);
        Mobil var6 = new Mobil();
        var6.setMerk("Honda");
        var6.setMesin(var5);
        var3.setMobil(var6);
        System.out.println("Nama Mahasiswa 1" + var3.getNama());
        System.out.println("Nama Mahasiswa 2" + var3.getNama());

        PrintStream var10000 = var3.getNama();
        var10000.println(var10001 + "dan" + var4.getNama() + "kuliah di" + var3.getProdi().getNama() + "Itenas Bandung"); 
        System.out.println("Mereka anggota himpunan" + var3.getHimpunan().getNama());
        var10000 = System.out;
        var10001 = var3.getNama();
        var10000.println(var10001 + "mengendarai Mobil " + var3.getMobil().getMesin().getMerk() + "dengan mesin" + var3.getMobil().getMesin().getUkuran() + "cc");
    }
}