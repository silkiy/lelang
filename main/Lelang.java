package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Lelang implements Item{

    private ArrayList<Integer> idPenawar = new ArrayList<Integer>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();


    boolean keluarLelang = true;
    boolean keluarProsesLelang = true;
    int max = 0;
    Scanner input = new Scanner(System.in);

    

    public void prosesLelang(Barang barang, Masyarakat masyarakat, int index){

        do{

            /* start pelelangan */
            System.out.print("\nMasukan Id Barang : ");
            index = input.nextInt();
            this.idBarang.add(index); //Memasukkan data ke idBarang
            if (index > idBarang.get(0) ){
                System.out.println("nomor barang tidak valid");
            }
            else {

                /* Item yang dilelang */
                System.out.print("\n--------------- Item yang Dipilih ----------------");
                System.out.print(
                        "\nId Barang   : " + barang.getId(index) +
                                "\nDengan Nama : " + barang.getNamaBarang(index) +
                                "\nHarga Awal  : " + barang.getHarga(index) +
                                "\nBerstatus   : " + barang.getStatus(index) +
                                "\n--------------------------------------------------\n");

                while (keluarProsesLelang) {

                    if(barang.getStatus(index) == false){
                        System.out.println("Barang yang akan dilelang sudah tidak ada!");
                        break;
                    }

                    /* Input identitas penawar */
                    System.out.print("\n--------------- Proses Input Data ----------------");

                    System.out.print("\nMasukan ID Anda : ");
                    int IndexPenawar = input.nextInt(); //Inputan idPenawar
                    this.idPenawar.add(IndexPenawar); //Memasukkan data ke idBarang
                    if (IndexPenawar > idPenawar.get(index)) {
                        System.out.println("Id Anda Salah");
                    }
                    else {
                    barang.getHarga(index);
                    System.out.println("Yang Terhormat Bapak/Ibu : " + masyarakat.getNama(IndexPenawar));

                    System.out.println("Silahkan masukkan harga penawaran !! ");
                    System.out.print("Harga : Rp.");
                    int hargaTawar = input.nextInt();

                    if (barang.getHarga(index) < hargaTawar) {
                        if (max < hargaTawar) { // Mengecheck apakah Valid atau tidak
                            max = hargaTawar;
                            setId(IndexPenawar);
                            setHarga(hargaTawar);
                        } else {
                            System.out.println("Mohon maaf sudah ada yang menawar lebih tinggi");
                        }
                    } else {
                        System.out.println("Mohon Masukkan harga diatas harga Awal!");
                    }
                    System.out.println("--------------------------------------------------\n");

                    System.out.println("Apakah Ada Yang Ingin Menawar Lebih? true/false ");
                    System.out.print("Pilihan : ");
                    keluarLelang = input.nextBoolean();

                        if (!keluarLelang && (max > barang.getHarga(index))) {
                            barang.editStatus(index, false);
                            System.out.println("\n---------------- Hasil Pelelangan ---------------");
                            System.out.print(
                                    "Id Barang       : " + barang.getId(index) +
                                            "\nDengan Nama     : " + barang.getNamaBarang(index) +
                                            "\nHarga Awal      : " + barang.getHarga(index) +
                                            "\nBerstatus       : " + barang.getStatus(index) +
                                            "\nDengan Harga    : " + max +
                                            "\n--------------------------------------------------\n");

                            /* ERROR
                            "\nDidapatkan oleh : " + masyarakat.getNama(IndexPenawar) +*/
                        }
                        if (barang.getStatus(index) == false) {
                            System.out.println("Barang " + barang.getNamaBarang(index) + " Sudah terjual");
                            break;
                        }


                }
            }
            }

            System.out.println("\nApakah Anda Ingin melanjutkan lelang? true / false ");
            System.out.print("Pilihan : ");
            keluarLelang = input.nextBoolean();

        }while(keluarLelang);
    }



    public void setIdBarang(Barang barang, int index){
        this.idBarang.add(barang.getId(index));
    }
    @Override
    public void setId(int idPenawar) {
        this.idPenawar.add(idPenawar);
    }
    @Override
    public void setHarga(int harga) {
        this.hargaTawar.add(harga);
    }

    @Override
    public int getHarga(int index) {
        return this.hargaTawar.get(index);
    }
    @Override
    public int getId(int index) {
        return this.getId(index);
    }

    public void prosesLelang(Barang barang, Masyarakat masyarakat){
        int index = 0;
        prosesLelang(barang, masyarakat, index);
    }
    
    public void prosesLelang(){
        Barang barang = new Barang();
        Masyarakat masyarakat = new Masyarakat();
        int index = 0;
        prosesLelang(barang, masyarakat, index);
    }

    // public void lelang(Petugas petugas, Masyarakat masyarakat, int angka2){
    //     int angka = 0;
    //     lelang(petugas, masyarakat,angka);
    // }

    // public void lelang(){
    //     Petugas petugas = new Petugas();
    //     Masyarakat masyarakat = new Masyarakat();
    //     int angka = 0;
    //     lelang(petugas,masyarakat,angka);
    // }
}
