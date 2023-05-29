package main;

// import java.util.ArrayList;

public class KasirLelang {
    public static void main(String[]args){


        Masyarakat masyarakat = new Masyarakat();
        Petugas petugas = new Petugas();
        Barang barang = new Barang();
        Lelang lelang = new Lelang();
        ChildClass report = new ChildClass();


        try {
            report.TampilanAwal();
            report.reportBarang(barang);
            lelang.prosesLelang(barang, masyarakat, 0);
            report.reportPetugas(petugas);
            report.TampilanAkhir();

        } catch (Exception e) { // nangkap error
            System.out.println("\nTerdapat Exception!!\nInfo : " + e.getMessage());
        }


    }
}
