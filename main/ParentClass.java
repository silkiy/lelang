package main;

public class ParentClass {

    /* Method Tabel Masyarakat */
    public void reportMasyarakat(Masyarakat masyarakat){
        int x = masyarakat.getMasyarakat();

        System.out.println("\n=============  Pace - Info Client  =============\n");
        for(int i=0;i < x;i++){
            System.out.println("Yang Terhormat Bapak/Ibu : "+masyarakat.getNama(i) +
                    "\nDengan Alamat            : " + masyarakat.getAlamat(i) +
                    "\nNomor Telp.              : " + masyarakat.getTelepon(i));
        }
    }

    /* Method Nama Petugas */
    public void reportPetugas(Petugas petugas){
        int i = 0;

        System.out.println("__________________________________________________");
        System.out.print("\nPETUGAS : ");
        System.out.println(petugas.getNama(i));
        System.out.println("\t\t" + petugas.getAlamat(i));
        System.out.println("\t\t" + petugas.getTelepon(i));
        System.out.println("__________________________________________________");
    }

    /* Method Tabel Nama Barang */
    public void reportBarang(Barang barang){
        int x = barang.getBarang();

        System.out.println("\n=============  Pace - Info Barang  =============\n");
        for(int i=0;i < x;i++){

            System.out.println("Id Barang   : " + barang.getId(i) +
                    "\nDengan Nama : " + barang.getNamaBarang(i) +
                    "\nSeharga     : Rp." + barang.getHarga(i) +
                    "\nBerstatus   : "+ barang.getStatus(i) +
                    "\n--------------------------------------------------");
        }
    }
}
