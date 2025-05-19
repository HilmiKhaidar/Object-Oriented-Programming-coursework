// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.PrintStream;

public class KelasUtama {
   public KelasUtama() {
   }

   public static void main(String[] var0) {
      Prodi var1 = new Prodi();
      var1.setId(1);
      var1.setNama("Informatika");
      Himpunan var2 = new Himpunan();
      var2.setId(1);
      var2.setNama("Himpunan Dosen Informatika Itenas");
      Processor var3 = new Processor();
      var3.setId(1);
      var3.setMerk("Intel");
      var3.setTipe("Core i7");
      Laptop var4 = new Laptop();
      var4.setMerk("ASUS");
      var4.setProcessor(var3);
      Dosen var5 = new Dosen();
      var5.setId(1);
      var5.setNama("Uung Ungkawa");
      var5.setProdi(var1);
      var5.setHimpunan(var2);
      var5.setLaptop(var4);
      System.out.println("=== Data Dosen ===");
      System.out.println("Nama Dosen   : " + var5.getNama());
      System.out.println("Prodi        : " + var5.getProdi().getNama());
      System.out.println("Himpunan     : " + var5.getHimpunan().getNama());
      System.out.println("Laptop       : " + var5.getLaptop().getMerk());
      PrintStream var10000 = System.out;
      String var10001 = var5.getLaptop().getProcessor().getMerk();
      var10000.println("Processor    : " + var10001 + " " + var5.getLaptop().getProcessor().getTipe());
   }
}
